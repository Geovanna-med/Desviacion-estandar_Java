package DesviacionEstandar;

public class DesviacionEstandar {

    public DesviacionEstandar() {
    }

    double DesviacionEstandarFormula(double[] numeros) {
        // Se empieza calculando la media del conjunto de numeros
        double media = calcularMedia(numeros);

        /*
         * Calculamos la distancio de cada dato a la media y luego lo elevamos al
         * cuadrado
         */
        calcularDistancia(numeros, media);

        return 0;
    }

    public double calcularMedia(double[] numeros) {
        // Se empieza calculando la media del conjunto de numeros
        int i;
        double suma = 0;
        double media = 0;

        for (i = 0; i < numeros.length - 1; i++) {
            suma = suma + numeros[i];
        }

        media = suma / numeros.length;

        System.out.println(media);

        return media;
    }

    public double calcularDistancia(double[] numeros, double media) {
        /*
         * Calculamos la distancio de cada dato a la media y luego lo elevamos al
         * cuadrado
         */

        double distancia = 0;
        int i = 0;
        double suma = 0;

        for (i = 0; i < numeros.length - 1; i++) {
            distancia = (numeros[i] - media) * (numeros[i] - media);

            suma = suma + distancia;
        }

        System.out.println(suma);
        return suma;
    }

    public static void main(String[] args) {
        double[] ListaNumeros = { 5, 7, 8.2, 7.9, 9, 3 };

        DesviacionEstandar dEstandar = new DesviacionEstandar();

        dEstandar.DesviacionEstandarFormula(ListaNumeros);

    }

}