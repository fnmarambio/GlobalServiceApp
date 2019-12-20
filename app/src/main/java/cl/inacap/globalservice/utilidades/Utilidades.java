package cl.inacap.globalservice.utilidades;

public class Utilidades {

    //Constantes campos tabla usuario
    public final static String TABLA_USUARIO="usuario";
    public final static String CAMPO_ID="idUser";
    public final static String CAMPO_NOMBRE="nombreUser";
    public final static String CAMPO_APELLIDO="apellidoUser";
    public static final String CAMPO_RUT="rutUser";
    public static final String CAMPO_CORREO="correoUser";
    public static final String CAMPO_CONTRASENA="contrasenaUser";
    public static final String CAMPO_PAIS="paisUser";

    public static final String CREAR_TABLA_USUARIO="CREATE TABLE "+
            ""+TABLA_USUARIO+" ("+CAMPO_ID+" " +
            "INTEGER, "+CAMPO_NOMBRE+" TEXT, "+CAMPO_APELLIDO+" TEXT, "+CAMPO_RUT+" TEXT, "+CAMPO_CORREO+" TEXT, "+CAMPO_CONTRASENA+" TEXT, "+CAMPO_PAIS+" TEXT)";



}
