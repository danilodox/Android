package com.example.danil.cardview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.danil.cardview.R;
import com.example.danil.cardview.model.Postagens;

import java.util.List;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {
    private List<Postagens> postagens;



    public PostagemAdapter(List<Postagens> listaPostagens){
        this.postagens = listaPostagens;
    }

    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.postagem_detalhe, parent, false);

        return new MyViewHolder(itemLista);


    }

    @Override
    public void onBindViewHolder( MyViewHolder holder, int position) {

        Postagens postagem = postagens.get(position);
        holder.textNome.setText(postagem.getNome());
        holder.textPostagem.setText(postagem.getPostagem());
        holder.textImagem.setImageResource( postagem.getImagem() );
    }

    @Override
    public int getItemCount() {
        return this.postagens.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        private TextView textNome, textPostagem;
        private ImageView textImagem;


        public MyViewHolder(View itemView) {
            super(itemView);
            textNome = itemView.findViewById(R.id.textNome);
            textPostagem = itemView.findViewById(R.id.textPostagem);
            textImagem = itemView.findViewById(R.id.textImagem);
        }
    }

}
