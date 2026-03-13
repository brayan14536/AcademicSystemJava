package cesde.view;

import cesde.domain.Student;
import cesde.service.StudentService;

import java.util.List;
import java.util.Scanner;

public class StudentView {

    Scanner sc = new Scanner(System.in);

    private final Student student;
    private final StudentService studentService;

    public StudentView(Student student, StudentService studentService){
        this.student = student;
        this.studentService = studentService; // Esto es inyeccion de dependencias
    }


    public Student createStudent(Student student){


        System.out.println("Ingrese el id del Estudiente");
        int id = sc.nextInt();
        student.setId(id);
        sc.nextLine();

        System.out.println("Ingrese el Nombre del Estudiante");
        String name = sc.nextLine();
        student.setName(name);

        System.out.println("Ingrese el apellido del estudiante");
        String lastName = sc.nextLine();
        student.setLastName(lastName);


        return student;

    }

    public void getStudentById(int id){

        if(id == student.getId()){
            System.out.println("id:" + student.getId() + "\n" +
                    "Nombre:" + student.getName() + "\n" +
                    "Apellido " + student.getLastName() + "\n" +
                    "email: " + student.getEmail() + "\n" +
                    "Status: " + student.isStatus());
        }else{
            System.out.println("Id no encontrado");
        }

    }

    public List<Student> getAllStudents(){
        return null;
    }

    public void updateStudent(){

        studentService.updateStudentService();

    }

    public void deleteStudent(int id){

    }





}
