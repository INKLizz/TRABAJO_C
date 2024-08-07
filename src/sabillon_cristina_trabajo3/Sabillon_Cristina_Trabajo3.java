/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sabillon_cristina_trabajo3;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Laura Sabillon
 */
public class Sabillon_Cristina_Trabajo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        String ventana;
        boolean input_valido = true;
        
        System.out.println("  **** MENU ****");
        System.out.println("1.- Piramides");
        System.out.println("2.- Minimo Comun Multiplo y Maximo Comun Divisor");
        System.out.println("3.- Numero Perfecto");
        ventana = scan.next();
        
        while (!(ventana.equals("1") || ventana.equals("2") || ventana.equals("3"))){
            System.out.println("Tiene que ingresar 1,2 o 3. No se vale cualquier otro ingreso.");
            ventana = scan.next();
        }
        
        if (ventana.equals("1")){
            int contador = 0, base = 0, altura = 0;
            double area = 0, mayor = 0, menor = 0;
            String areas = "";
            
            System.out.println("\nPiramides");
            
            while (contador < 8) {
                contador++;
                System.out.println("\nPiramide #" + contador);

                System.out.print("Ingrese la base: ");
                input_valido = false;
                while (!input_valido){
                try{
                base = scan.nextInt(); 
                input_valido = true;
                }catch(InputMismatchException e){
                    System.out.println("Debe de ingresar un numero entero.");
                    scan.next();
                }
                
                while (base < 0){
                    System.out.println("Base no puede ser negativa.");
                    base = scan.nextInt();
                }
                
                }

                System.out.print("Ingrese la altura: ");
                input_valido = false;
                while (!input_valido){
                try{
                altura = scan.nextInt();                
                input_valido = true;
                }catch(InputMismatchException e){
                    System.out.println("Debe de ingresar un numero entero.");
                    scan.next();
                }
                }
                while (altura < 0){
                    System.out.println("Base no puede ser negativa.");
                    base = scan.nextInt();
                }               
                
                area = 0.5 * base * altura;

                if (area > mayor) {
                    mayor = area;
                }
                areas += area + ", ";
            }
            System.out.println("Areas: " + areas);
            System.out.println("El area mayor es: " + mayor);
        }
        
        if (ventana.equals("2")){
            int divisor = 0, multiple = 0, numero = 0, numero2 = 0, contador = 0, MCM = 0, MCD = 0;
            System.out.println("\nMinimo comun multiple y Maximo comun divisor");
            
            contador ++;
            System.out.println("Ingresar un numero: ");
            while (!input_valido){
            try{            
                numero = scan.nextInt(); 
                input_valido = true;
                }catch(InputMismatchException e){
                    System.out.println("Debe de ingresar un numero entero.");
                    scan.next();
                }
            }            
            System.out.println("Ingresar otro numero: ");
            while (!input_valido){
            try{            
                numero2 = scan.nextInt(); 
                input_valido = true;
                }catch(InputMismatchException e){
                    System.out.println("Debe de ingresar un numero entero.");
                    scan.next();
                }
            }                  
            while (numero == 0){
                System.out.println("No puede ingresar 0. El cero no se puede dividir");
                scan.nextInt();
            }
            while (numero2 == 0){
                System.out.println("No puede ingresar 0. El cero no se puede dividir");
                scan.nextInt();
            }
            
            numero = numero % numero2;
            MCD = numero;         
            
            MCM = (numero * numero2);
            
            System.out.println("Minimo comun multiple: " + MCM);
            System.out.println("Maximo comun divisor: " + MCD);
            
        }
        if (ventana.equals("3")){
            int numero = 0, numero_perfecto = 0;
            
            System.out.println("\nNumero Perfecto");
            
            
            
        }
        
    }
    
}
