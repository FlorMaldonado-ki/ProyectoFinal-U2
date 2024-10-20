package menu;

import cine.Cine;
import pelicula.Pelicula;
import pelicula.utils.Categoria;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Menu {

    Scanner read = new Scanner(System.in);
    private Cine cine = new Cine();

    public void mostrarMenu() {
        boolean salir = false;

        while (!salir) {
            System.out.println("\n Sistema Integral de Gestión para Cinépolis.");
            System.out.println("Elige una de las siguientes opciones: \n");
            System.out.println("1. Agregar película.");
            System.out.println("2. Modificar detalles de la película.");
            System.out.println("3. Asignar película a sala.");
            System.out.println("4. Asignar horarios disponibles.");
            System.out.println("5. Administrar películas en cartelera.");
            System.out.println("6. Administrar sala.");
            System.out.println("7. Venta de boletos.");
            System.out.println("8. Mostrar películas.");
            System.out.println("9. Salir");
            int opcion = read.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n----- AGREGAR PELÍCULA -----\n");
                    System.out.print("Ingresa el nombre de la película: ");
                    read.nextLine();
                    String nombre = read.nextLine();
                    System.out.println("Ingresa la categoría de la película: ");
                    Categoria categoria=Categoria.A;
                    boolean band=false;
                    System.out.println("1. A");
                    System.out.println("2. B");
                    System.out.println("3. C");
                    System.out.println("4. D");
                    int num = read.nextInt();

                    while(!band){

                        switch (num) {
                            case 1:
                                categoria = Categoria.A;
                                band = true;
                                break;
                            case 2:
                                categoria = Categoria.B;
                                band = true;
                                break;
                            case 3:
                                categoria = Categoria.C;
                                band = true;
                                break;
                            case 4:
                                categoria = Categoria.D;
                                band = true;
                                break;
                            default:
                                System.out.println("No existe esa opción");
                        }
                    }
                    System.out.print("Agregar sinópsis: ");
                    String Sinopsis = read.nextLine();
                    read.nextLine();
                    System.out.print("Ingresa la duración de horas de la película: ");
                    int horas = read.nextInt();
                    System.out.print("Ingresa la duración de minutos de la película: ");
                    int minutos = read.nextInt();
                    LocalTime Duracion = LocalTime.of(horas, minutos);
                    String idPelicula= cine.generarIDpelicula(nombre);

                    LocalDate FechaFuncion= LocalDate.of(2005,06, 01);

                    while(!cine.validadFechaFuncion(FechaFuncion)) {
                        System.out.print("Ingresar el día de la función: ");
                        int dia = read.nextInt();
                        System.out.print("Ingresar mes de la función: ");
                        int mes = read.nextInt();
                        System.out.print("Ingresar año de la función: ");
                        int año = read.nextInt();

                        FechaFuncion = LocalDate.of(año, mes, dia);

                        if(!cine.validadFechaFuncion(FechaFuncion)){
                            System.out.println("La función no puede estar registrada en el pasado.");
                        }
                    }

                    Pelicula pelicula= new Pelicula(idPelicula, nombre, Duracion, FechaFuncion, Sinopsis, categoria);
                    cine.agregarPelicula(pelicula);
                    break;

                case 2:
                    System.out.println("\n----- MODIFICAR PELÍCULA -----\n");
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("\n----- MOSTRAR PELÍCULAS -----\n");
                    cine.mostrarPeliculas();
                    break;
                case 9:
                    salir = true;
                    System.out.println("Gracias por usar el Sistema Integral de Gestión para Cinépolis");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intentelo de nuevo.");
            }
        }
    }
}
