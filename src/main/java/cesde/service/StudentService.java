package cesde.service;

import cesde.domain.Student;

import java.util.Scanner;

public class StudentService {

    Scanner sc = new Scanner(System.in);


    // Voy a crear una instancia unica de Student

    private final Student student;

    public StudentService(Student student){
        this.student = student; // Esto es una inyeccion de dependencias
    }




    public Student updateStudentService(){

        System.out.println("Seleccione el dato a actualizar \n" +
                "1. id \n" +
                "2. Nombre \n" +
                "3. Apellido \n" +
                "4. Email \n" +
                "5. Estado ");


        int option = sc.nextInt();

        sc.nextLine();

        switch (option){
            case 1:
                System.out.println("Actualizar id");
                int id = sc.nextInt();
                sc.nextLine();
                student.setId(id);
            case 2:
                System.out.println("Actualizar Nombre");
                String name = sc.nextLine();
                student.setName(name);
            default:
                System.out.println("Seleccione una opción valida");
        }


        return student;
    }


}
