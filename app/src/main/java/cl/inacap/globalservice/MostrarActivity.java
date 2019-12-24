package cl.inacap.globalservice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MostrarActivity extends AppCompatActivity {

    private RecyclerView recyclerViewUaurio;
  private RecyclerViewAdaptador adaptadorUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);

        recyclerViewUaurio=(RecyclerView)findViewById(R.id.recyclerUser);
        recyclerViewUaurio.setLayoutManager(new LinearLayoutManager(this));

        adaptadorUsuario=new RecyclerViewAdaptador(obtenerUsuarios());
        recyclerViewUaurio.setAdapter(adaptadorUsuario);
    }

    public List<UsuarioModelo> obtenerUsuarios(){
        List<UsuarioModelo> usuario = new ArrayList<>();
        usuario.add(new UsuarioModelo("Lucho Chorizon","11111-1",R.drawable.ic_launcher_foreground));
        return usuario;
    }
}
