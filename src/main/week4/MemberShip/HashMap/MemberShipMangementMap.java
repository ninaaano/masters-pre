package main.week4.MemberShip.HashMap;// @ author ninaaano

import main.week4.MemberShip.membership.GRADE;
import main.week4.MemberShip.membership.Member;

import java.util.HashMap;
import java.util.Map;

public class MemberShipMangementMap {

    private HashMap<Integer, Member> memberMap;

    public MemberShipMangementMap() {
        this.memberMap = new HashMap<>();
    }


    public void addMemberShip(int id, String name, GRADE grade) {
        if(memberMap.containsKey(id)){
            System.out.println("이미 있는 아이디"+id+"의 값이 변경됩니다.");
        }
        memberMap.put(id,new Member(id,name,grade));
    }

    public boolean removeMember(int id) {
            if (memberMap.containsKey(id)) {
                memberMap.remove(id);
                return true;
            }
        System.out.println(id + "에 해당하는 멤버가 없습니다.");
        return false;
    }

    public void showAllMember() {
        System.out.println("=========================");
        memberMap.forEach((id , member) -> System.out.println(member.viewInfo()));
        System.out.println("=========================");
    }


}
