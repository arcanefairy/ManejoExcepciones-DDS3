package manejoex;

/*
Realizado por Adriana Leon Camacho
*/

import java.util.Scanner;

public class ManejoEx {
    /*
    Ejercicio #1
    */
    public static char caracterEn(String cadena, int posicion) throws Exception {
        if (posicion >= 0 && cadena.length() > posicion) {  
            return cadena.charAt(posicion);
        } else {
            throw new Exception("Posicion fuera del rango establecido");
        }
    } /* Aquí simplemente se explica que pasa cuando se utiliza "charAt", el cuál ubica la posición de un caracter dependiendo
    del número ingresado
     En este if, nos dice que la posición que se escoja (en este caso la septima), debe ser un número no menor a cero
    y que la longitud de la cadena no debe ser menor al número de la posición que se busca, en este caso
    debe de haber más o hasta 7 números en la cadena
        */
    
    
    public static void main(String[] args) {
        
        /*
        Ejercicio #2
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena de caracteres: ");
        String cadena = scanner.nextLine();
        
        try {
            System.out.println("El caracter en la posicion 7 es: " + caracterEn(cadena, 6)); 
        } catch (Exception e) {
            System.out.println("Has intentado recuperar una posicion de la cadena de caracteres que no existe");
        }
        
        
        /*
        Ejercicio #3
        */
        System.out.print("Ingresa un numero: ");
        int numero = scanner.nextInt();
        
        try {
            if (numero < 0) {
                throw new NumeroNegativo();
            } else {
                double raizCuadrada = Math.sqrt(numero);
                System.out.println("La raiz cuadrada de " + numero + " es: " + raizCuadrada);
            }
        } catch (NumeroNegativo e) {
            System.out.println(e.getMessage());
        }
    }
}
