package cl.inacap.globalservice.entidades;

public class Admins {

    private Integer id;
    private String nombreAdmin;
    private String contraseña;

    public Admins(Integer id, String nombreAdmin, String contraseña) {
        this.id = id;
        this.nombreAdmin = nombreAdmin;
        this.contraseña = contraseña;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreAdmin() {
        return nombreAdmin;
    }

    public void setNombreAdmin(String nombreAdmin) {
        this.nombreAdmin = nombreAdmin;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
