package co.edu.cesde.martes2.modules;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "Matriculas")
public class EnroLlments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "id",nullable = false)
    private Long coursid;
    @ManyToOne
    @JoinColumn(name = "Estudiante_id",nullable = false)
    private  Students students;
    @Column(name = "Estado",nullable = false)
    private String status;
    @Column(name = "tiempo")
    private LocalDateTime createAt;

    public EnroLlments() {
    }

    public EnroLlments(Long coursid, Long studentid, String status) {
        this.coursid = coursid;
        this.students = students;
        this.status = status;
        this.createAt= LocalDateTime.now();
    }

    public Long getCoursid() {
        return coursid;
    }

    public void setCoursid(Long coursid) {
        this.coursid = coursid;
    }

    public Long getStudentid() {
        return students.getId();
    }

    public void setStudentid(Long studentid) {
        this.students = students;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }
}
