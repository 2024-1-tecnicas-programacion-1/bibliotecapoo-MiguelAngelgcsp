package com.mycompany.bibliotecapoo;

public class Libro {
       private String titulo;
    private String autor;
    private int anoPublicacion;
    private String genero;
    private boolean leido;

    public Libro(String titulo, String autor, int anoPublicacion, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.genero = genero;
        this.leido = false;
    }

    public String mostrarInformacion() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Ano de publicacion: " + anoPublicacion + ", Genero: " + genero;
    }

    public void marcarLeido() 
    {
        leido = true;
    }

    public boolean esAntiguo() 
    {
        return (2024 - anoPublicacion) > 50;
    }

    public boolean isLeido()
    {
        return leido;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public String getGenero() {
        return genero;
    }
}