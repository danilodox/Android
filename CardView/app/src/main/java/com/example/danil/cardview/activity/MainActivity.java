package com.example.danil.cardview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.danil.cardview.R;
import com.example.danil.cardview.adapter.PostagemAdapter;
import com.example.danil.cardview.model.Postagens;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagens> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //DEFINIR LAYOUT
           // Vertical
            //RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
            //recyclerPostagem.setLayoutManager(layoutManager);

           // Horizontal
            LinearLayoutManager layoutManager = new LinearLayoutManager(this);
            layoutManager.setOrientation(LinearLayout.HORIZONTAL);
            recyclerPostagem.setLayoutManager(layoutManager);

        //DEFINIR ADAPTER

        this.prepararPostagens();
        PostagemAdapter adapter = new PostagemAdapter( postagens );
        recyclerPostagem.setAdapter(adapter);


    }

    public void prepararPostagens () {
        Postagens p = new Postagens("Danilo Medeiros", "#tbt viajem!!", R.drawable.imagem1);
        this.postagens.add(p);

        p = new Postagens("Renata Alves", "#City!!", R.drawable.imagem2);
        this.postagens.add(p);

        p = new Postagens("Brainiak", "#???", R.drawable.imagem3);
        this.postagens.add(p);

        p = new Postagens("Leona", "#Uouuuu!!", R.drawable.imagem4);
        this.postagens.add(p);
    }
}
