package main.week2;// @ author ninaaano

import java.util.Arrays;

/*
복사본 -> 새롭게 만들어야한다. 원본이 바뀌면 같이 훼손되니까 => 깊은 복사
깊은 복사 = 새로운 메모리 할당, 얕은 복사 = 기존꺼 참조
두마을 도서관도 새롭게 생성?

책에 대한 관리를 목록으로 하고 있는데 혹시 분실 될까 복사본(A-1)을 하나 두었습니다.
그리고 같은 책 목록으로 두마을(B)도서관을 개관했습니다.

이때 책 목록 A, A-1, B 를 출력하세요

두 도서관의 목록이 다음과 같이 변경되었습니다.

온마을(A)도서관에 다음과 같이 책 목록이 변경되었습니다.
(수정) 3번째 목록
[자전거 도둑| 박완서] => [그 많던 싱아는 누가 다 먹었을까| 박완서]

두마을(B)도서관에 책이 추가되었습니다.
(추가)마지막 목록
[사피엔스|유발 하라리]

A, A-1, B 목록을 출력하세요
 */

public class Library {
    private String title; // 책제목
    private String author; // 저자

    public Library() {
    }

    public Library(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}

class BookList {
    private Library[] bookList;

    private BookList() {
    }

    private BookList(Library[] bookList) {
        this.bookList = bookList;
    }

    private void printBookList() {
        for (int i = 0; i < bookList.length; i++) {
            System.out.println(bookList[i].getTitle() + " | " + bookList[i].getAuthor());
        }
    }

    public static void main(String[] args) {
        Library[] aList = new Library[5];

        Library book1 = new Library("태백산맥", "조정래");
        Library book2 = new Library("이기적 유전자", "리처드 도킨즈");
        Library book3 = new Library("자전거 도둑", "박완서");
        Library book4 = new Library("토지", "박경리");
        Library book5 = new Library("대변동", "제레드 다이아몬드");

        aList[0] = book1;
        aList[1] = book2;
        aList[2] = book3;
        aList[3] = book4;
        aList[4] = book5;

        Library[] a1List = aList.clone(); // 1차원 배열에서 clone은 깊은 복사가 된다

        Library[] bLibrary = Arrays.copyOf(aList,6);

        bLibrary[5] = new Library("사피엔스","유발 하라리");

        aList[2] = new Library("그 많던 싱아는 누가 다 먹었을까","박완서");

        BookList aLibrary = new BookList(aList);

        System.out.println("<온마을 도서관>");
        aLibrary.printBookList();
        System.out.println("");

        BookList aCopy = new BookList(a1List);

        System.out.println("<복사된 책 목록>");
        aCopy.printBookList();
        System.out.println("");

        BookList bList = new BookList(bLibrary);

        System.out.println("<두마을 도서관>");
        bList.printBookList();
        System.out.println("");
    }
}


