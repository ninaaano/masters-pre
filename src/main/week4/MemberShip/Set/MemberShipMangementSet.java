package main.week4.MemberShip.Set;// @ author ninaaano

import main.week4.MemberShip.membership.GRADE;
import main.week4.MemberShip.membership.Member;

import java.util.HashSet;

public class MemberShipMangementSet {

    private HashSet<Member> memberHashSet;

    public MemberShipMangementSet() {
        this.memberHashSet = new HashSet<>();
    }

    public void addMemberShip(int id, String name, GRADE grade) {
        if(!memberHashSet.add(new Member(id,name,grade))){
            System.out.println("이미 있는 아이디" + id + "는 추가할 수 없습니다.");
        }

    }

    public boolean removeMember(int id) {
        for (Member member : memberHashSet){
            if (member.getMemberId() == id) {
                memberHashSet.remove(member);
                return true;
            }
        }
        System.out.println(id + "에 해당하는 멤버가 없습니다.");
        return false;
    }

    public void showAllMember() {
        System.out.println("=========================");
        for (Member member : memberHashSet) {
            System.out.println(member.viewInfo() + " ");
        }
        System.out.println("=========================");
    }
}
