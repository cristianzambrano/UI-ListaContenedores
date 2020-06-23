package com.example.uilistacontenedore.Model;

public class Noticia {
    String Titulo;
    String  SubTitulo;

    public Noticia(String titulo, String subTitulo) {
        Titulo = titulo;
        SubTitulo = subTitulo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getSubTitulo() {
        return SubTitulo;
    }

    public void setSubTitulo(String subTitulo) {
        SubTitulo = subTitulo;
    }
}
