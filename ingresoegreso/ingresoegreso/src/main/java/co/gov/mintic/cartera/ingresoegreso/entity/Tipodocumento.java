package co.gov.mintic.cartera.ingresoegreso.entity;

public class Tipodocumento {
    private long idTipodocumento;
    private String descripcion;
    private String siglas;
    private boolean estado;

    public long getIdTipodocumento() {
        return idTipodocumento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getSiglas() {
        return siglas;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setIdTipodocumento(long idTipodocumento) {
        this.idTipodocumento = idTipodocumento;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Tipodocumento{" +
                "idTipodocumento=" + idTipodocumento +
                ", descripcion='" + descripcion + '\'' +
                ", siglas='" + siglas + '\'' +
                ", estado=" + estado +
                '}';
    }
}
