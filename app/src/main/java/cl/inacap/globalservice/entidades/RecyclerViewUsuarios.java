package cl.inacap.globalservice.entidades;

import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewUsuarios {

    private String idUser;
    private String nombreUser;
    private String apellidoUser;
    private int ivUser;

    public RecyclerViewUsuarios() {

    }

    public RecyclerViewUsuarios(String idUser, String nombreUser, String apellidoUser, int ivUser) {
        this.idUser = idUser;
        this.nombreUser = nombreUser;
        this.apellidoUser = apellidoUser;
        this.ivUser = ivUser;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
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

    public int getIvUser() {
        return ivUser;
    }

    public void setIvUser(int ivUser) {
        this.ivUser = ivUser;
    }
}