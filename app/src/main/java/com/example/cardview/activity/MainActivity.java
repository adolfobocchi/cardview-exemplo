package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.cardview.R;
import com.example.cardview.activity.adapter.PostagemAdapter;
import com.example.cardview.activity.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<Postagem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerView);

        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        // layoutManager.setOrientation(LinearLayout.HORIZONTAL);
        //recyclerPostagem.setLayoutManager(layoutManager);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        recyclerPostagem.setLayoutManager(layoutManager);

        this.prepararPostagens();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void prepararPostagens() {
        Postagem p = new Postagem("Adolfo Bocchi", "Viagem legal", R.drawable.imagem1);
        postagens.add(p);
        p = new Postagem("Simone", "#tbt viagem mara", R.drawable.imagem2);
        postagens.add(p);
        p = new Postagem("Francisco", "Sensacional", R.drawable.imagem3);
        postagens.add(p);
        p = new Postagem("Lorena", "#partiu ", R.drawable.imagem4);
        postagens.add(p);
    }
}
