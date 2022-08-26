package co.gov.mintic.cartera.ingresoegreso.entity;

public class Rol {
    private long idRol;
    private String descripcion;
    private boolean estado; // para realizar un borrado logico



    public long getIdRol() {
        return idRol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setIdRol(long idRol) {
        this.idRol = idRol;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Rol{" +
                "idRol=" + idRol +
                ", descripcion='" + descripcion + '\'' +
                ", estado=" + estado +
                '}';
    }
}
