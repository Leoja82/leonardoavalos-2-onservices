package ej2.onservices;

public class Ej2Onservices {

    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int suma = 0;
            int numero = i;
            while (numero != 0) {
                suma += Math.pow(numero % 10, 3);
                numero /= 10;
            }

            if (i == suma) {
                System.out.println(suma);
            }
        }

    }
}
