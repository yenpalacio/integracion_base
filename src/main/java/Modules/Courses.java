package Modules;

public class Courses {

    private Long id;
        private String codigo;
        private String descripcion;
        private int duracion;
        private int cupo;

        public Courses (long id, String nombre, String descripcion, int duracion, int cupo) {
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String nombre) {
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
