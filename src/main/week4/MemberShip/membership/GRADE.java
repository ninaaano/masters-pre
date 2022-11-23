package main.week4.MemberShip.membership;// @ author ninaaano

public enum GRADE {

    SILVER("SILVER"),
    VIP("VIP"),
    PLATINUM("PLATINUM");

    private String grade;

    GRADE(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

}

