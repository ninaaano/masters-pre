package main.week2;// @ author ninaaano

public class mission2_1 {
    public static void main(String[] args) {
        // 문자 배열을 만들어 A-Z 까지 배열에 저장하고 이를 다시 출력하기
        // 아스키 65번부터 90번까지

        char[] charArr = new char[26];
        for(int i=0; i<charArr.length; i++){
            charArr[i]= (char) (65+i);
        }
        for(int i=0;i <charArr.length; i++){
            System.out.print(charArr[i]);
        }

    }
}
