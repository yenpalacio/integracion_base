package co.edu.cesde.martes2.modules;

import jakarta.persistence.*;

@Entity
@Table(name = "Estudiante")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "id",nullable = false)
    private Long id;
    @Column(name = "Nombre",nullable = false,length = 100)
    private String firstName;
    @Column(name = "Apellido",nullable = false,length = 100)
    private  String lastName;
    @Column(name = "email",nullable = false)
    private String email;
    @Column(name = "Telefono",nullable = false)
    private String phone;

    public Students(){

    }
    public Students (Long id, String firstName, String lastName, String email, String phone){
        this.id= id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.phone=phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public String toString(){
        return "Nombre =" + firstName+"/"+",Apellido:"+ lastName+"/"+"email:"+email+"/n";
    }
}
