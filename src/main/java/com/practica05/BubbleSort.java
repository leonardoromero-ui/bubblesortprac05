package com.practica05;

public class BubbleSort {

    public void bubbleSort(int vet[]) {
        int i, j, aux;
        for (i = tamanho(vet); i >= 1; i--) {
            for (j = 0; j <= i - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
    }

    private int tamanho(int vet[]) {
        return vet.length - 1;
    }
}