package co.edu.cesde.martes2.console;

import co.edu.cesde.martes2.modules.Students;
import co.edu.cesde.martes2.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;
@Service
public class StudentConsole {
    private final StudentService studentService;
    private final java.util.Scanner scanner;

    public StudentConsole(StudentService studentService){
        this.studentService = studentService;
        this.scanner = new Scanner(System.in);
    }

    public StudentService getStudentService() {
        return studentService;
    }
    public void createStudent(){
       /* System.out.println("Crear Estudiante");
        System.out.println("Ingrese ID:");
        Long Id = Long.parseLong(scanner.nextLine());
        System.out.println("Ingrese nombre:");
        String firstName = scanner.nextLine();
        System.out.println("Ingrese apellido:");
        String lastName = scanner.nextLine();
        System.out.println("Ingrese Email");
        String email = scanner.nextLine();
        System.out.println("Ingrese telefono:");
        String Phone = scanner.nextLine();

        Students student = new Students (Id,firstName,lastName,email,Phone);
        studentService.save(student);*/
        studentService.save(new Students(20L,"Alice","Morales","alice@","38393839399"));
        System.out.println("Estudiante creado con exito");

    }

    public void liststudents() {List<Students> students = studentService.findAll();
        students.forEach(System.out::println);
    }
}
