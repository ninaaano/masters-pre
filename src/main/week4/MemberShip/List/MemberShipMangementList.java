package main.week4.MemberShip.List;// @ author ninaaano

import main.week4.MemberShip.membership.GRADE;
import main.week4.MemberShip.membership.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberShipMangementList {

    // 여기서 new를 생성해주는거랑 생성자에서 new를 하는거랑 어떤 차이가 있을까?
    // private List<Member> memberList = new ArrayList<>(); // static이 붙으면 변경이 없음. 내부에서 사용하면 여기서 new해도됨
    private List<Member> memberList;

    public MemberShipMangementList() {
        // this.memberList = memberList;
        this.memberList = new ArrayList<>();
    }

    public void addMemberShip(int id, String name, GRADE grade) { // main에서 입력된 변수 저장
        /*
        // NullPointException 발생.
        member.getMemberName(name);
        member.getMemberGrade(grade);
        memberList.add(id,member);
         */
        memberList.add(new Member(id,name,grade)); // element로 넣어야한다
    }

    public boolean removeMember(int id) { // 숫자에 해당하는 순서 지우기
        for(Member member : memberList) {
            if(member.getMemberId() == id){
                memberList.remove(member); // id가 1000단위라 id가 index가 될 수 없다. object 자체를 삭제해야한다
                return true;
            }
        }
        System.out.println(id + "에 해당하는 멤버가 없습니다.");
        return false;
    }

    public void showAllMember() { // 모든 배열 내용 출력
        System.out.println("=========================");
        for (Member member : memberList) {
            System.out.println(member.viewInfo() + " ");
        }
        System.out.println("=========================");
    }
}
