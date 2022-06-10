package src.com.vivamostoles.homework03.utils;

import src.com.vivamostoles.homework03.Student;
import src.com.vivamostoles.homework03.service.*;

import java.util.*;

public class TreeSetCreator {
    public static TreeSet<String> generation(int numberOfElementsTreeSet){
        TreeSet <String> students = new TreeSet<>() ;
        String [] studentFirstName = StudentsInfo.firstNames;
        String [] studentLastName = StudentsInfo.lastNames;
        String [] studentDepartmentOfStudy = StudentsInfo.department;
        String [] studentNativeCity = StudentsInfo.nativeCity;
        for (int i = 0; i <numberOfElementsTreeSet; i++){
            int randomValueOfFirstName = new Random().nextInt(studentFirstName.length);
            int randomValueOfLastName = new Random().nextInt(studentLastName.length);
            int randomValueOfDepartmentOfStudy = new Random().nextInt(studentDepartmentOfStudy.length);
            int randomValueOfNativeCity = new Random().nextInt(studentNativeCity.length);
          Student studentFromGenerator = new Student(studentFirstName[randomValueOfLastName],
                  studentLastName[randomValueOfFirstName], studentDepartmentOfStudy[randomValueOfDepartmentOfStudy],
                  studentNativeCity[randomValueOfNativeCity]);
            students.add(String.valueOf(studentFromGenerator));        }
        return students;    }

    public static void deleteStudent(TreeSet<String> students){
        List <String> studentToRemove = new ArrayList<>();
        int countCheck = 1;
        for (String checkingStudent: students
             ){if(countCheck % 2 == 0){
                System.out.println("Students after delete>>" + checkingStudent);} else {
                studentToRemove.add(checkingStudent);      }
            countCheck ++;
        }
        students.removeAll(studentToRemove);

    }
}


