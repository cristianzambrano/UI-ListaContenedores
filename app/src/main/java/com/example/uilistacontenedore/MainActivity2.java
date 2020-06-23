package com.example.uilistacontenedore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.uilistacontenedore.Model.adaptadorNoticias;
import com.example.uilistacontenedore.Model.Noticia;

public class MainActivity2 extends AppCompatActivity
            implements AdapterView.OnItemClickListener {

    public Noticia[] noticias;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        noticias= new Noticia[]{
                        new Noticia("Noticia 1", "SubNoticia Contenido  Contenido Contenido Contenido  1"),
                        new Noticia("Noticia 2", "SubNoticia Contenido  Contenido Contenido Contenido  2"),
                        new Noticia("Noticia 3", "SubNoticia Contenido  Contenido Contenido Contenido  3"),
                        new Noticia("Noticia 4", "SubNoticia Contenido  Contenido Contenido Contenido  4")
        };

        adaptadorNoticias adaptadornoticias = new adaptadorNoticias(this, noticias);

        ListView lstOpciones = (ListView)findViewById(R.id.lstListaNoticias);

        View header = getLayoutInflater().inflate(R.layout.ly_headernoticias, null);

        lstOpciones.addHeaderView(header);
        lstOpciones.setAdapter(adaptadornoticias);

        lstOpciones.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,
                ((Noticia)parent.getItemAtPosition(position)).getTitulo(),
                Toast.LENGTH_LONG).show();
    }
}