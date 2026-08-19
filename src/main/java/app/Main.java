package app;
import Data.DataStore;
import Modules.Courses;
import Modules.EnroLlments;
import Modules.Students;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();


        dataStore.addStudent(new Students(1L, "Juan", "Alvarez", "juan@", "575585757"));
        dataStore.addStudent(new Students(2L, "Maria", "Giraldo", "maria@", "3983975895"));
        dataStore.addStudent(new Students(3L, "Jose", "Restrepo", "jose@", "39393033083"));
        dataStore.addStudent(new Students(4L, "Lina", "Lopez", "lina@", "38398339830"));
        dataStore.addStudent(new Students(5L, "Lucy", "Osorio", "lucy@", "384984849948"));

       dataStore.getStudents().forEach( student->{
            System.out.println("ID: " + student.getId() + "Name: " + student.getFirstName() + "lastname: " + student.getLastName() + "email: " + student.getEmail() + "phone: " + student.getPhone());
        });

        dataStore.addCourses(new Courses( 1L, " :2568689", " :Fundamentos de programacion", 48, 40));
        dataStore.addCourses(new Courses(2L, "5o686", "Matematicas Basicas", 36, 65));
        dataStore.addCourses(new Courses(3L, "i765765", "Base de datos ", 40, 58));
        dataStore.addCourses(new Courses(4L, "784784", "Economia", 37, 64));
        dataStore.addCourses(new Courses(5L, "673863", "POO", 39, 63));

        dataStore.getListcourses(). forEach( course-> {
            System.out.println("ID: " + course.getId() +  "Code: " + course.getCodigo() +  "Name: " +  course.getDescripcion() + "cups: "  + course.getCupo() +  "Time: " + course.getDuracion());
        });

        dataStore.addEnroLlments(new EnroLlments(1L, 1L, "Active"));
        dataStore.addEnroLlments(new EnroLlments(2L, 2L, "Active"));
        dataStore.addEnroLlments(new EnroLlments(3L, 3L, "Active"));

        dataStore.getListenroLlments(). forEach(EnroLlments-> {
            System.out.println("Course ID: " + EnroLlments.getCoursid() + "Student ID: " + EnroLlments.getStudentid() + "Status: " + EnroLlments.getStatus());
        });
        dataStore.addEnroLlments(new EnroLlments(3L,5L,"Active"));





    }

}



