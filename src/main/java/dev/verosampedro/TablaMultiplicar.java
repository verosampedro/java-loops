package dev.verosampedro;

public class TablaMultiplicar {

    public static void main(String[] args) {
        int n = 5;
        imprimirTablaMultiplicar(n);
    }

    public static String[] imprimirTablaMultiplicar(int n) {
        String[] output = new String[10];
        for (int i = 1; i <= 10; i++) {
            int resultado = n * i;
            output[i - 1] = n + " x " + i + " = " + resultado;
        }
        return output;
    }
}
