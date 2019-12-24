package cl.inacap.globalservice.entidades;

import android.widget.ImageButton;
import android.widget.ImageView;

public class Usuarios {

    private Integer idUser;
    private String nombreUser;
    private String apellidoUser;
    private String rutUser;
    private String correo;
    private String contrasenaUser;
    private String paisUser;

    public Usuarios(){

    }

    public Usuarios(String nombreUser, String apellidoUser) {
        this.idUser = idUser;
        this.nombreUser = nombreUser;
        this.apellidoUser = apellidoUser;
        this.rutUser = rutUser;
        this.correo = correo;
        this.contrasenaUser = contrasenaUser;
        this.paisUser = paisUser;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public String getApellidoUser() {
        return apellidoUser;
    }

    public void setApellidoUser(String apellidoUser) {
        this.apellidoUser = apellidoUser;
    }

    public String getRutUser() {
        return rutUser;
    }

    public void setRutUser(String rutUser) {
        this.rutUser = rutUser;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenaUser() {
        return contrasenaUser;
    }

    public void setContrasenaUser(String contrasenaUser) {
        this.contrasenaUser = contrasenaUser;
    }

    public String getPaisUser() {
        return paisUser;
    }

    public void setPaisUser(String paisUser) {
        this.paisUser = paisUser;
    }

}
