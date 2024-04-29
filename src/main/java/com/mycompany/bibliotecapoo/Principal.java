package com.mycompany.bibliotecapoo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        int opcion = -1;
        while (opcion != 0) {
            System.out.println("Menu:");
            System.out.println("1) Ingresar libro");
            System.out.println("2) Mostrar todos los libros");
            System.out.println("3) Buscar libro");
            System.out.println("4) Marcar libro como leido");
            System.out.println("5) Mostrar libros no leidos");
            System.out.println("0) Salir");
           scanner.nextLine();
            opcion = scanner.nextInt();
           

            switch (opcion) {
                case 1:
                    
                    
                    scanner.nextLine();
                    
                    System.out.print("Ingrese el titulo del libro: ");
                    String titulo = scanner.nextLine();
                    
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    
                    System.out.print("Ingrese el ano de publicacion del libro: ");
                    int anoPublicacion = scanner.nextInt();
                    
                    scanner.nextLine();
                   
                    System.out.print("Ingrese el genero del libro: ");
                    String genero = scanner.nextLine();
                    
                    
                    
                    Libro nuevoLibro = new Libro(titulo, autor, anoPublicacion, genero);
                    biblioteca.registrarLibro(nuevoLibro);
                    System.out.println("Libro ingresado exitosamente.");
                    break;
                case 2:
                    System.out.println("Libros disponibles:");
                    biblioteca.mostrarLibros();
                    break;
                case 3:
                System.out.print("Ingrese la palabra de búsqueda: ");
                String palabraBusqueda = scanner.nextLine();
                Libro libroEncontrado = biblioteca.buscarLibro(palabraBusqueda);
                if (libroEncontrado != null)
                {
                    System.out.println("Libro encontrado:");
                    System.out.println("Título: " + libroEncontrado.getTitulo() + ", Autor: " + libroEncontrado.getAutor() + ", Año de publicación: " + libroEncontrado.getAnoPublicacion() + ", Género: " + libroEncontrado.getGenero());
                }
                else 
                {
                    System.out.println("Libro no encontrado.");
                }
                break;

                    
                case 4:
                    System.out.print("Ingrese el título del libro a marcar como leído: ");
                    String tituloMarcar = scanner.nextLine();
                    Libro libroMarcar = biblioteca.buscarLibro(tituloMarcar);
                    if (libroMarcar != null) 
                    {
                        libroMarcar.marcarLeido();
                    } 
                    else 
                    {
                        System.out.println("Libro no encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("Libros no leídos:");
                    biblioteca.mostartLibrosNoLeidos();
                    break;
                case 0:
                    
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }

        scanner.close();
    }
}
