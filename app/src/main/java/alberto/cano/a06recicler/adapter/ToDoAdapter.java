package alberto.cano.a06recicler.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import alberto.cano.a06recicler.R;
import alberto.cano.a06recicler.modelos.ToDo;

public class ToDoAdapter  extends RecyclerView.Adapter<ToDoAdapter.ToDoVH> {
    private List<ToDo> objects;

    private int resource;

    private Context context;

    public ToDoAdapter(List<ToDo> objects, int resource, Context context) {
        this.objects = objects;
        this.resource = resource;
        this.context = context;
    }

    //Instanciar tantos elementos como quepan en pantalla
    @NonNull
    @Override
    public ToDoVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View todoView = LayoutInflater.from(context).inflate(resource, null);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        todoView.setLayoutParams(lp);
        return new ToDoVH(todoView);
    }

    //Para pintar cada uno de los elementos
    @Override
    public void onBindViewHolder(@NonNull ToDoVH holder, int position) {
        ToDo toDo = objects.get(position);

        holder.lbTitulo.setText(toDo.getTitulo());
        holder.lbContenido.setText(toDo.getContenido());
        holder.lbFecha.setText(toDo.getFecha().toString());

        if (toDo.isComplementado()){
            holder.btnCompletado.setImageResource(android.R.drawable.checkbox_on_background);
        }else {
            holder.btnCompletado.setImageResource(android.R.drawable.checkbox_off_background);
        }

        holder.btnCompletado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toDo.setComplementado(!toDo.isComplementado());
                notifyDataSetChanged();
            }
        });
    }

    //Cuantos elementos tengo para mostrar
    @Override
    public int getItemCount() {
        return objects.size();
    }

    public class ToDoVH extends RecyclerView.ViewHolder{
        TextView lbTitulo, lbContenido, lbFecha;
        ImageButton btnCompletado;


        public ToDoVH(@NonNull View itemView) {
            super(itemView);

            lbTitulo = itemView.findViewById(R.id.lbTitutloToDoViewModel);
            lbContenido = itemView.findViewById(R.id.lbContenidoToDoViewModel);
            lbFecha = itemView.findViewById(R.id.lbFechaToDoViewModel);
            btnCompletado = itemView.findViewById(R.id.btnCompletado);
        }
    }
}
