package cl.inacap.globalservice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import cl.inacap.globalservice.entidades.RecyclerViewUsuarios;
import cl.inacap.globalservice.entidades.Usuarios;

public class GlobalService_CRUD extends AppCompatActivity {


    private RecyclerView recyclerViewUsuario;
    private RecyclerViewAdaptador adaptadorUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_global_service__crud);

        recyclerViewUsuario=(RecyclerView)findViewById(R.id.rvUsuarios);
        recyclerViewUsuario.setLayoutManager(new LinearLayoutManager(this));

        adaptadorUsuario = new RecyclerViewAdaptador(obtenerUsuarios());
        recyclerViewUsuario.setAdapter(adaptadorUsuario);
    }

    public List<RecyclerViewUsuarios> obtenerUsuarios(){
        List<RecyclerViewUsuarios> usuarios = new ArrayList<>();
       usuarios.add(new RecyclerViewUsuarios("1","Katyusha","Urss",R.drawable.katyusha));

        return usuarios;
    }

    public void btnRegistrar(View view){
        Intent crud = new Intent(this,RegistrarUser.class);
        startActivity(crud);

    }

    public void btnSalirUser(View view){
        Intent crud = new Intent(this,MainActivity.class);
        startActivity(crud);

    }


}
