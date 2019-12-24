package cl.inacap.globalservice;

public class UsuarioModelo {


    private String nombre;
    private  String rut;
    private int fotoUsuer;


    public UsuarioModelo() {
    }

    public UsuarioModelo(String nombre, String rut, int fotoUsuer) {
        this.nombre = nombre;
        this.rut = rut;
        this.fotoUsuer = fotoUsuer;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getFotoUsuer() {
        return fotoUsuer;
    }

    public void setFotoUsuer(int fotoUsuer) {
        this.fotoUsuer = fotoUsuer;
    }
}


