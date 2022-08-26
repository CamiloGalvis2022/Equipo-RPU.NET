package co.gov.mintic.cartera.ingresoegreso.entity;

public class Usuario {
    private  long idUsuario;
    private String nombre;
    private String apellido;
    private Tipodocumento tipodocumento;
    private String cedula;
    private String usuario;
    private String clave;
    private String correo;
    private Rol rol; // Rol puede ser administrador, usuario normal
    private boolean estado;

    public long getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Tipodocumento getTipodocumento() {
        return tipodocumento;
    }

    public String getCedula() {
        return cedula;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public String getCorreo() {
        return correo;
    }

    public Rol getRol() {
        return rol;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTipodocumento(Tipodocumento tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", tipodocumento=" + tipodocumento +
                ", cedula='" + cedula + '\'' +
                ", usuario='" + usuario + '\'' +
                ", clave='" + clave + '\'' +
                ", correo='" + correo + '\'' +
                ", rol=" + rol +
                ", estado=" + estado +
                '}';
    }
}
