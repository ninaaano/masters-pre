package main.week4.MemberShip.membership;// @ author ninaaano

import java.util.Objects;

public class Member {
    private int id;
    private String name;
    private GRADE grade;

    public Member(int id, String name, GRADE grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getMemberId() {
        return id;
    }

    public String getMemberName() {
        return name;
    }

    public GRADE getMemberGrade() {
        return grade;
    }

    public String viewInfo() {
        return  name + "님의 아이디는 " + id + "이고 등급은 " + grade + "입니다.";
    }

    @Override
    public boolean equals(Object o) {
        Member member = (Member) o;
        return this.id == member.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
