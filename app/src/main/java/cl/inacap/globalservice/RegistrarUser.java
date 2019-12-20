package cl.inacap.globalservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import cl.inacap.globalservice.utilidades.Utilidades;

public class RegistrarUser extends AppCompatActivity {

    public EditText idUser, nombreUser, apellidoUser, rutUser, correoUser, contrasenaUser, reptContrasenaUser, paisUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_user);

        idUser = (EditText) findViewById(R.id.etIdUser);
        nombreUser = (EditText) findViewById(R.id.etNombreUser);
        apellidoUser = (EditText) findViewById(R.id.etApellidoUser);
        rutUser = (EditText) findViewById(R.id.etRutUser);
        correoUser = (EditText) findViewById(R.id.etCorreoUser);
        contrasenaUser = (EditText) findViewById(R.id.etContraseñaUser);
        reptContrasenaUser = (EditText) findViewById(R.id.etReptContraseñaUser);
        paisUser = (EditText) findViewById(R.id.etPaisUser);
    }

    public void registrarUser(View view){
        ConexionSQLiteHelper conn=new ConexionSQLiteHelper(this,"bd_usuarios",null,1);

        SQLiteDatabase db = conn.getWritableDatabase();



        ContentValues values = new ContentValues();
        values.put(Utilidades.CAMPO_ID,idUser.getText().toString());
        values.put(Utilidades.CAMPO_NOMBRE,nombreUser.getText().toString());
        values.put(Utilidades.CAMPO_APELLIDO,apellidoUser.getText().toString());
        values.put(Utilidades.CAMPO_RUT,rutUser.getText().toString());
        values.put(Utilidades.CAMPO_CORREO,correoUser.getText().toString());
        values.put(Utilidades.CAMPO_CONTRASENA,contrasenaUser.getText().toString());
        values.put(Utilidades.CAMPO_PAIS,paisUser.getText().toString());

        Long idResultante=db.insert(Utilidades.TABLA_USUARIO,Utilidades.CAMPO_ID,values);

        Toast.makeText(getApplicationContext(),"ID Registro: "+idResultante,Toast.LENGTH_SHORT).show();
        db.close();
    }
}
