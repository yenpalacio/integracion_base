package app;
import Data.DataStore;
import Modules.Courses;
import Modules.EnroLlments;
import Modules.Students;
import console.StudentConsole;
import repositories.StudentRepository;
import repositories.impl.StudentRepositoryImpl;
import service.StudentService;
import service.impl.StudentServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepositoryImpl(DataStore.getStudents()) ;
        StudentService studentService = new StudentServiceImpl(studentRepository);
        StudentConsole studentConsole = new StudentConsole(studentService);

        studentConsole.createStudent();
        studentConsole.liststudents();




    }

}



