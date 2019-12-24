package cl.inacap.globalservice;

<<<<<<< HEAD
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
=======
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
>>>>>>> origin/master
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

<<<<<<< HEAD
import cl.inacap.globalservice.entidades.RecyclerViewUsuarios;
import cl.inacap.globalservice.entidades.Usuarios;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView idUser, nombre, apellido;
        ImageView fotoUsuario;

        public ViewHolder(View itemView) {
            super(itemView);

            idUser = (TextView)itemView.findViewById(R.id.tvIdUsuario);
            nombre = (TextView)itemView.findViewById(R.id.tvNombre);
            apellido = (TextView)itemView.findViewById(R.id.tvApellido);
            fotoUsuario = (ImageView) itemView.findViewById(R.id.imgUsuario);
        }
    }

    public List<RecyclerViewUsuarios> usuariosLista;

    public RecyclerViewAdaptador(List<RecyclerViewUsuarios> usuariosLista) {
        this.usuariosLista = usuariosLista;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_usuarios,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
=======
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

>>>>>>> origin/master
        return viewHolder;
    }

    @Override
<<<<<<< HEAD
    public void onBindViewHolder( ViewHolder holder, int position) {
        holder.idUser.setText(usuariosLista.get(position).getIdUser());
        holder.nombre.setText(usuariosLista.get(position).getNombreUser());
        holder.apellido.setText(usuariosLista.get(position).getApellidoUser());
        holder.fotoUsuario.setImageResource(usuariosLista.get(position).getIvUser());
=======
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.usuario.setText(usuariosLista.get(position).getNombre());
        holder.rut.setText(usuariosLista.get(position).getRut());
        holder.fotoUser.setImageResource(usuariosLista.get(position).getFotoUsuer());
>>>>>>> origin/master

    }

    @Override
    public int getItemCount() {
<<<<<<< HEAD

=======
>>>>>>> origin/master
        return usuariosLista.size();
    }
}
