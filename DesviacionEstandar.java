package DesviacionEstandar;

public class DesviacionEstandar {
    double[] numeros = { 5, 7, 8.2, 7.9, 9, 3 };

    public DesviacionEstandar(double[] numeros) {
        this.numeros = numeros;
    }

    float DesviacionEstandarFormula(Double[] listaNumeros) {
        // Se empieza calculando la media del conjunto de numeros
        int i;
        double suma = 0;
        double media = 0;

        for (i = 0; i < numeros.length - 1; i++) {
            suma = suma + listaNumeros[i];
        }

        media = suma / numeros.length;

        // Calculamos la distancio de cada dato a la media y luego lo elevamos al
        // cuadrado

        double{}

        for (i = 0; i < numeros.length - 1; i++) {
            suma = suma + listaNumeros[i];
        }

        return 0;
    }

}