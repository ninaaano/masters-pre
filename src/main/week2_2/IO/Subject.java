package main.week2_2.IO;// @ author ninaaano

public class Subject{
    private String className;
    private int testScore;

    public Subject(String className, int testScore) {
        this.className = className;
        this.testScore = testScore;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getTestScore() {
        return testScore;
    }

    public void setTestScore(int testScore) {
        this.testScore = testScore;
    }
}
