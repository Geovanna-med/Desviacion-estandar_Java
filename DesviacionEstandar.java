package DesviacionEstandar;

import java.lang.Math;

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
        double sumaDistancias = calcularDistancia(numeros, media);

        // En este paso dividimos el resultado del paso 3 entre la variable NNN, que es
        // el número de datos.
        int n = numeros.length;

        double division = divisionDeSumaDistancias(sumaDistancias, n);

        // sacamos la raíz cuadrada de la respuesta obtenida en el paso 4 y listo.

        double desEstandar = Math.sqrt(division);

        return desEstandar;
    }

    public double calcularMedia(double[] numeros) {
        // Se empieza calculando la media del conjunto de numeros
        int i;
        double sumaDistancias = 0;
        double media = 0;

        for (i = 0; i <= numeros.length - 1; i++) {
            sumaDistancias = sumaDistancias + numeros[i];
        }

        media = sumaDistancias / numeros.length;

        return media;
    }

    public double calcularDistancia(double[] numeros, double media) {
        /*
         * Calculamos la distancio de cada dato a la media y luego lo elevamos al
         * cuadrado
         */

        double distancia = 0;
        int i = 0;
        double sumaDistancias = 0;

        for (i = 0; i <= numeros.length - 1; i++) {
            distancia = (numeros[i] - media) * (numeros[i] - media);

            // Aqui sumamos las distancias
            sumaDistancias = sumaDistancias + distancia;
        }

        return sumaDistancias;
    }

    public double divisionDeSumaDistancias(double suma, int numDatos) {
        double division = suma / numDatos;

        return division;
    }

    public static void main(String[] args) {
        double[] ListaNumeros = { 6, 2, 3, 1
        };

        DesviacionEstandar dEstandar = new DesviacionEstandar();

        double resultado = dEstandar.DesviacionEstandarFormula(ListaNumeros);

        System.out.println("La desviacion estandar es: " + resultado);
    }

}