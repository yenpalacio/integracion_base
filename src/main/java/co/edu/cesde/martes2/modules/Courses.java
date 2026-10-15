package co.edu.cesde.martes2.modules;

import jakarta.persistence.*;

@Entity
@Table(name = "Cursos")
public class Courses {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

@Column(name = "estudiante_id",nullable = false)
        private tipoCodigo codigo;
    @Column(name = "Descripcion")
        private String descripcion;
@Column(name = "duracion")
        private Integer duracion;
@Column(name="cupo",nullable = false)
        private Integer cupo;

        public Courses (long id, tipoCodigo nombre, String descripcion, int duracion, int cupo) {
            this.id = id;
            this.codigo = nombre;
            this.descripcion = descripcion;
            this.duracion = duracion;
            this.cupo = cupo;

        }

    public Courses() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public tipoCodigo getCodigo() {
        return codigo;
    }

    public void setCodigo(tipoCodigo nombre) {
        this.codigo = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }
}
