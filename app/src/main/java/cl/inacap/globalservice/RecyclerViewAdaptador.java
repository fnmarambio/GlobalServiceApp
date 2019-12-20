package cl.inacap.globalservice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder> {


    public static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView usuario,rut;
        ImageView fotoUser;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            usuario =(TextView)itemView.findViewById(R.id.tvNombre);
            rut=(TextView)itemView.findViewById(R.id.tvRut);
            fotoUser=(ImageView)itemView.findViewById(R.id.imgUser);
        }
    }

    public List<UsuarioModelo>usuariosLista;

    public RecyclerViewAdaptador(List<UsuarioModelo> usuariosLista) {
        this.usuariosLista = usuariosLista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.img_usuarios,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.usuario.setText(usuariosLista.get(position).getNombre());
        holder.rut.setText(usuariosLista.get(position).getRut());
        holder.fotoUser.setImageResource(usuariosLista.get(position).getFotoUsuer());

    }

    @Override
    public int getItemCount() {
        return usuariosLista.size();
    }
}
