package com.mycompany.bibliotecapoo;

import java.util.LinkedList;
public class Biblioteca 
{
    private LinkedList<Libro>libros;
    
    public Biblioteca() 
    {
        this.libros = new LinkedList<>();
    }

    public void registrarLibro(Libro libro) 
    {
        libros.add(libro);
    }

    public void mostrarLibros()
    {
        for (int i = 0; i < libros.size(); i++) 
        {
            System.out.println(libros.get(i).mostrarInformacion());
        }
    }

    public void mostartLibrosNoLeidos()
    {
        for (int i = 0; i < libros.size(); i++) 
        {
            if (!libros.get(i).isLeido())
            {
                System.out.println(libros.get(i).mostrarInformacion());
            }
        }
    }

    public Libro buscarLibro(String palabraBusqueda)
    
    {
        for (int i = 0; i < libros.size(); i++) 
        {
            if (libros.get(i).mostrarInformacion().toLowerCase().contains(palabraBusqueda.toLowerCase()))
            {
                return libros.get(i);
            }
        }
        return null;
    }
}