/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menus;


import cliente.Cliente;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;
import cine.Cine;
import sala.Sala;
import cliente.Cliente;
import pelicula.Pelicula;
import compraBoletos.ComprasBoletos;

public class Menu_Admin {
    Scanner read = new Scanner(System.in);
    Cine cine = new Cine();

    public int mostrarMenuAdmin() {
        System.out.println("\nSISTEMA CINE");
        System.out.println("1. Registrar cliente");
        System.out.println("2. Registrar sala");
        System.out.println("3. Validar compra");
        System.out.println("4. Validar compra adicional");
        System.out.println("5. Seleccionar asientos");
        System.out.println("6. Realizar boleto");
        System.out.println("7. Salir");

        System.out.println("Ingrese una opcion: ");

        int opcion = read.nextInt();

        return opcion;
    }

    public void procesarDatos(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Ingresa nombre de cliente: ");
                String nombreCliente = read.nextLine();
                System.out.println("Ingresa apellido del cliente: ");
                String apellidoCliente = read.nextLine();
                System.out.println("Ingresa CURP del cliente: ");
                String curpCliente = read.nextLine();
                System.out.println("Ingresa dirección del cliente: ");
                String direccionCliente = read.nextLine();
                System.out.println("Ingresa año de nacimiento del cliente: ");
                int añoNaciCliente = read.nextInt();
                System.out.println("Ingresa mes de nacimiento del cliente:");
                int mesNaciCliente = read.nextInt();
                System.out.println("Ingresa dia de nacimiento del cliente:");
                int diaNaciCliente = read.nextInt();
                LocalDate fechaNacimiento = LocalDate.of(añoNaciCliente, mesNaciCliente, diaNaciCliente);
                String id = cine.generarid(nombreCliente, apellidoCliente);
                Cliente cliente = new Cliente(id, apellidoCliente, nombreCliente, curpCliente, direccionCliente, fechaNacimiento);
                cine.registrarCliente(cliente);
                break;
            case 2:
                System.out.println("Ingresa número de sala: ");
                int numsala= read.nextInt();
                System.out.println("Ingresa capacidad de asientos");
                int capacidadAsientos= read.nextInt();
                System.out.println("Ingresa distribución de asientos");
                int distribucionAsientos= read.nextInt();
                int salafuncion[][]= new int [capacidadAsientos][distribucionAsientos];
                /*int opcionsala=0;
                while(opcionsala!=3) {
                    System.out.println("Asigna premium o VIP al asiento");
                    System.out.println("1. Premium");
                    System.out.printf("2. VIP");
                    System.out.println("3. No quiero asignar premium o VIP");

                    opcionsala = read.nextInt();
                    int decision=0;
                switch (opcionsala) {
                        case 1:
                            do {
                            System.out.println("Elegiste asignar premium a un asiento");
                            System.out.printf("Cual fila de asiento quieres asignar el premium?");
                            int filapremium = read.nextInt();
                            System.out.println("Cual columna de asiento quieres asignar el premium?");
                            int columnapremium = read.nextInt();
                            salafuncion[filapremium][columnapremium] = 2;
                            System.out.println("Quieres asignar otro premium?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            decision = read.nextInt();
                    }while(decision!=2);
                            break;
                        case 2:
                            do {
                                System.out.println("Elegiste asignar VIP a un asiento");
                                System.out.printf("Cual fila de asiento quieres asignar el VIP?");
                                int filaVIP = read.nextInt();
                                System.out.println("Cual columna de asiento quieres asignar el VIP?");
                                int columnaVIP = read.nextInt();
                                salafuncion[filaVIP][columnaVIP] = 3;
                                System.out.println("Quieres asignar otro VIP?");
                                System.out.println("1. Si");
                                System.out.println("2. No");
                                decision = read.nextInt();
                            }while(decision!=2);
                            break;
                        case 3:
                            return;
                }*/
        }

    }
}

