package manejoex;


public class NumeroNegativo extends Exception {

    public NumeroNegativo() {
        super("El número ingresado es negativo");
    }

    public NumeroNegativo(String mensaje) {
        super(mensaje);
    }
}