package main.week2_2.IO;// @ author ninaaano

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IO io = new IO();
        String FILE_NAME = "/Users/nino/masters-pre/src/main/week2_2/IO/input.txt";
        List<Student> studentList = io.readStudnetInfo(FILE_NAME);

        for (Student student : studentList) {
            student.printStudentInfo();
        }
    }
}

