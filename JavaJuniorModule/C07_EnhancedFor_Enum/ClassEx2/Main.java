package src.C7_EnhancedFor_Enum.ClassEx2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Students student1 = new Students("Ana", "Popescu", 24);
        Students student2 = new Students("Robert", "Girbea", 22);
        Students student3 = new Students("Dragos", "Calin", 23);

        ArrayList<Students> studentsArrayList = new ArrayList<>();
        studentsArrayList.add(student1);
        studentsArrayList.add(student2);
        studentsArrayList.add(student3);


        for (Students s : studentsArrayList) {
            s.setAge(10);
        }

        System.out.println(studentsArrayList);
        System.out.println(student1);
        System.out.println();

        student1.setApplicationStatus(ApplicationStatus.ACCEPTED);
        student2.setApplicationStatus(ApplicationStatus.IN_PROGRES);
        student3.setApplicationStatus(ApplicationStatus.REFUSED);

        System.out.println(studentsArrayList);
        System.out.println("Enum message is: " + student1.applicationStatus.getMessage());

    }

}
