package app;

import Modules.Students;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Students> students=new ArrayList<>();
        students.add(new Students(1L,"Juan","Alvarez", "juan@","575585757"));
        students.add(new Students(2L,"Maria","Giraldo","maria@","3983975895"));
        students.add(new Students(3L,"Jose","Restrepo","jose@","39393033083"));
        students.add(new Students(4L,"Lina","Lopez","lina@","38398339830"));
        students.add(new Students(5L,"Lucy","Osorio","lucy@","384984849948"));

        System.out.println("List of students");
        for(Students student : students) System.out.println("ID" + student.getId() + "Name" + student.getFirstName() + "lastname"+student.getLastName()+"email" + student.getEmail()+ "phone" + student.getPhone());
    }
}
