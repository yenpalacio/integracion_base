package app;
import co.edu.cesde.martes2.data.DataStore;
import co.edu.cesde.martes2.console.StudentConsole;
import co.edu.cesde.martes2.repositories.StudentRepository;
import co.edu.cesde.martes2.repositories.impl.StudentRepositoryImpl;
import co.edu.cesde.martes2.service.StudentService;
import co.edu.cesde.martes2.service.impl.StudentServiceImpl;

public class Main {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepositoryImpl(DataStore.getStudents()) ;
        StudentService studentService = new StudentServiceImpl(studentRepository);
        StudentConsole studentConsole = new StudentConsole(studentService);

        studentConsole.createStudent();
        studentConsole.liststudents();




    }

}



