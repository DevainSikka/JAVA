//Iterate - list - arraylist

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import marks.StudentsInfo;

//collection is for non primitive types
//collection has inbuild functions
public class Collections {
    public static void main(String args[]) {

        List list = new ArrayList<StudentsInfo>();
        ArrayList arrayList = new ArrayList<Integer>();// only works in non pemitive type
        try {
            File file = new File("marks/Marks1.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String splitText[] = scanner.nextLine().split(",");
                StudentsInfo studentsInfo = new StudentsInfo(splitText[0],
                        Integer.valueOf(splitText[1]),
                        Double.valueOf(splitText[2]),
                        Double.valueOf(splitText[3]),
                        Double.valueOf(splitText[4]));
                list.add(studentsInfo);
            }
        } catch (Exception exception) {
            System.out.println("in exception " + exception.getMessage());
        }

        list.add(1, new StudentsInfo());
        // for (int i = 0; i < list.size(); i++) {
        // StudentsInfo studentsInfo = (StudentsInfo) list.get(i);
        // System.out.println("value = " + studentsInfo.name);
        // }

        for (Object object : list) {
            StudentsInfo studentsInfo = (StudentsInfo) object;
            System.out.println("value = " + studentsInfo.name);

        }

    }
}
