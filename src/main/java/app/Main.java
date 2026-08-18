package app;
import Modules.Courses;
import Modules.EnroLlments;
import Modules.Students;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        students.add(new Students(1L, "Juan", "Alvarez", "juan@", "575585757"));
        students.add(new Students(2L, "Maria", "Giraldo", "maria@", "3983975895"));
        students.add(new Students(3L, "Jose", "Restrepo", "jose@", "39393033083"));
        students.add(new Students(4L, "Lina", "Lopez", "lina@", "38398339830"));
        students.add(new Students(5L, "Lucy", "Osorio", "lucy@", "384984849948"));

        System.out.println("List of students");
        for (Students student : students) {
            System.out.println("ID" + student.getId() + "Name" + student.getFirstName() + "lastname" + student.getLastName() + "email" + student.getEmail() + "phone" + student.getPhone());
        }
        System.out.println("List of Courses");
        courses.add(new Courses(1L, "2568689", "Fundamentos de programacion", 48, 40));
        courses.add(new Courses(2L, "5o686", "Matematicas Basicas", 36, 65));
        courses.add(new Courses(3L, "i765765", "Base de datos ", 40, 58));
        courses.add(new Courses(4L, "784784", "Economia", 37, 64));
        courses.add(new Courses(5L, "673863", "POO", 39, 63));

        for (Courses course : courses) {
            System.out.println("ID" + course.getId() + "Code" + course.getCodigo() + "Name" + course.getDescripcion() + "cups" + course.getCupo() + "Time" + course.getDuracion());
        }
        System.out.println("List of enroLlments");
        enroLlments.add(new EnroLlments(1L, 1L, "Active"));
        enroLlments.add(new EnroLlments(2L, 2L, "Active"));
        enroLlments.add(new EnroLlments(3L, 3L, "Active"));
        for (EnroLlments EnroLlments : enroLlments) {
            System.out.println("Course ID" + EnroLlments.getCoursid() + "Student ID" + EnroLlments.getStudentid() + "Status" + EnroLlments.getStatus());
        }


    }

}



