package marks;

import java.io.*;
import java.util.Scanner;
//double data type
//Double class
//char data type
//Character Wrapper class
//wrapper class - non primitive types - wrap primitive
//in build functions
//wrapper class - autoboxing, unboxing

public class StudentsInfo {
    public String name;
    int rollNo;
    double marks1, marks2, marks3;

    public StudentsInfo() {
    }

    public StudentsInfo(String name, int rollNo, double marks1, double marks2, double marks3) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public static void main(String arrgs[]) {
        File file = new File("marks/Marks1.txt");
        System.out.println("After creating file");
        int studentCount = 2;

        StudentsInfo studentsInfo[] = new StudentsInfo[studentCount];
        int count = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String fileLine = scanner.nextLine();
                String splitText[] = fileLine.split(",");
                int splitLength = splitText.length;
                StudentsInfo student = new StudentsInfo(splitText[0],
                        Integer.valueOf(splitText[1]),
                        Double.valueOf(splitText[2]),
                        Double.valueOf(splitText[3]),
                        Double.valueOf(splitText[4]));
                studentsInfo[count] = student;
                count++;
                // for (int i = 0; i < splitText.length; i++) {
                // System.out.println("split text " + String.valueOf(splitText[i]));
                // }
            }
        } catch (Exception exception) {

        }
        double max = studentsInfo[0].marks1 + studentsInfo[0].marks2 + studentsInfo[0].marks3;
        int hightestMarksStudent = 0;
        for (int i = 1; i < studentCount; i++) {
            double nextStudentMarks = studentsInfo[i].marks1 + studentsInfo[i].marks2 + studentsInfo[i].marks3;
            if (nextStudentMarks > max) {
                max = nextStudentMarks;
                hightestMarksStudent = i;
            }
        }
        System.out.println("student with highest marks = " + studentsInfo[hightestMarksStudent].name);
    }
}
