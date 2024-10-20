package cine;
import cliente.Cliente;
import pelicula.Pelicula;
import java.util.Random;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;



public class Cine {

    public ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
    public ArrayList <Cliente> listaClientes = new ArrayList<>();
    Random rand = new Random();
    Cine cine=new Cine();
    Scanner read = new Scanner(System.in);;

    public void agregarPelicula(Pelicula pelicula){
        listaPeliculas.add(pelicula);
        System.out.println("Se registró una nueva pelíula.");
    }

    public void eliminarPelicula(Pelicula pelicula){
        this.listaPeliculas.remove(pelicula);
    }

    public String generarIDpelicula(String nombre){

        char letra1 = nombre.charAt(0);
        char letra2 = nombre.charAt(1);
        int aleatorio = rand.nextInt(0,70000);
        int dia = LocalDate.now().getDayOfMonth();
        String ID=String.format("%c%c%d%d" , letra1, letra2, aleatorio, dia);
        return ID.toUpperCase();
    }

    public boolean validadFechaFuncion(LocalDate fechaDeseada) {

        if (fechaDeseada.isBefore(LocalDate.now())) return false;
        return true;
    }

    public void mostrarPeliculas(){

        if (this.listaPeliculas.isEmpty()){
            System.out.println("Aún no hay películas registradas :(");
            return;
        }
        for (Pelicula pelicula : this.listaPeliculas) {
            System.out.println(pelicula.mostrarPelicula());
        }
    }
    public String genereadorIDsala(int NoDeSala){

        int aleatorio = rand.nextInt(10000,70000);
        int dia = LocalDate.now().getDayOfMonth();
        int numero = NoDeSala;
        String ID=String.format("S%c%c%d%d" , aleatorio, dia, numero);
        return ID.toUpperCase();
    }
    public String generarid(String nombre, String apellido){
        Random random=new Random();
        int num_al= random.nextInt(0, 100000);
        char primeraLetra=nombre.charAt(0);
        char segundaLetra=nombre.charAt(1);
        char primeraLetraApellido=apellido.charAt(0);
        char segundaLetraApellido=apellido.charAt(1);
        LocalDate fecha=LocalDate.now();
        String idC=String.format("C%c%c%c%c%d", primeraLetra, segundaLetra, primeraLetraApellido, segundaLetraApellido, num_al);
        return idC;
    }
    public void registrarCliente(Cliente cliente){
        this.listaClientes.add(cliente);
    }
    public Cliente obtenerClientePorCurp(String Curp){
        return listaClientes.stream().filter(p -> p.getCURP().equals(Curp)).findFirst().orElse(null);
    }
    public int mesNacimiento(String CURP){
        char primermes=CURP.charAt(6);
        char segundmes=CURP.charAt(7);
        String mes=""+primermes+segundmes;
        int mesnacimiento=Integer.parseInt(mes);
        return mesnacimiento;
    }
    public void descuento(){
        System.out.println("Ingresa tu CURP: ");
        String CurpCliente = read.nextLine();
        cine.obtenerClientePorCurp(CurpCliente);
        System.out.println("Elige un asiento: ");
        System.out.println("1. Normal");
        System.out.println("2. Premium");
        System.out.println("3. VIP");
        System.out.println("4. Salir");
        int opcion2= read.nextInt();
        switch (opcion2){
            case 1:
                System.out.println("Elegiste un asiento normal");
                System.out.println("El precio del asiento es de $100");
                if (LocalDate.now().getMonthValue()==cine.mesNacimiento(CurpCliente)){
                    double precio=100*0.30;
                    System.out.printf("Por ser tu mes de cumpleaños, el precio del boleto será "+precio);
                }
                break;
            case 2:
                System.out.println("Elegiste un asiento premium");
                System.out.println("El precio del asiento es de $200");
                if (LocalDate.now().getMonthValue()==cine.mesNacimiento(CurpCliente)){
                    double precio=200*0.40;
                    System.out.printf("Por ser tu mes de cumpleaños, el precio del boleto será "+precio);
                }
                break;
            case 3:
                System.out.println("Elegiste un asiento VIP");
                System.out.println("El precio del asiento es de $400");
                if (LocalDate.now().getMonthValue()==cine.mesNacimiento(CurpCliente)){
                    double precio=400*0.65;
                    System.out.printf("Por ser tu mes de cumpleaños, el precio del boleto será "+precio);
                }
                break;
        }
    }
}
