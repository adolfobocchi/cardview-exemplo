package com.example.cardview.activity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardview.R;
import com.example.cardview.activity.model.Postagem;

import java.util.ArrayList;
import java.util.List;


public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {
    private List<Postagem> listPostagem = new ArrayList<Postagem>();

    public PostagemAdapter(List<Postagem> postagens) {
        this.listPostagem = postagens;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.adapter_postagem, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Postagem postagem = this.listPostagem.get(position);
        holder.txtNome.setText(postagem.getNome());
        holder.txtPostagem.setText(postagem.getPostagem());
        holder.imgPostagem.setImageResource(postagem.getImagem());

    }

    @Override
    public int getItemCount() {

        return this.listPostagem.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView txtNome;
        private TextView txtTempo;
        private ImageView imgPostagem;
        private TextView txtPostagem;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNome = itemView.findViewById(R.id.txtNome);
            txtTempo = itemView.findViewById(R.id.txtTempo);
            imgPostagem = itemView.findViewById(R.id.imgPostagem);
            txtPostagem = itemView.findViewById(R.id.txtPostagem);
        }
    }
}
