package com.practica05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {

    private BubbleSort sorter;

    @BeforeEach
    void setUp() {
        sorter = new BubbleSort(); // Arrange inicial
    }

    @Test
    @DisplayName("CP1: Arreglo unitario (vet.length < 2) - Salida temprana sin iteraciones")
    void testArregloConUnElemento() {
        // Arrange
        int[] entrada = {5};
        int[] esperado = {5};

        // Act
        sorter.bubbleSort(entrada);

        // Assert
        assertArrayEquals(esperado, entrada, "Un arreglo de un elemento debe permanecer igual.");
    }

    @Test
    @DisplayName("CP2: Par desordenado (2 elementos) - Ejecución de bucles con condición if verdadera e intercambio")
    void testArregloDesOrdenado() {
        // Arrange
        int[] entrada = {2, 1};
        int[] esperado = {1, 2};

        // Act
        sorter.bubbleSort(entrada);

        // Assert
        assertArrayEquals(esperado, entrada, "El arreglo de dos elementos debe invertirse correctamente.");
    }

    @Test
    @DisplayName("CP3: Par ordenado (2 elementos) - Ejecución de bucles con condición if falsa sin intercambios")
    void testArregloOrdenado() {
        // Arrange
        int[] entrada = {1, 2};
        int[] esperado = {1, 2};

        // Act
        sorter.bubbleSort(entrada);

        // Assert
        assertArrayEquals(esperado, entrada, "Un arreglo ya ordenado debe conservar sus posiciones.");
    }

    @Test
    @DisplayName("CP4: Arreglo mixto (3 elementos) - Cobertura de múltiples iteraciones con ramas if evaluadas a verdadero y falso")
    void testArregloDesordenado2() {
        // Arrange
        int[] entrada = {2, 1, 3};
        int[] esperado = {1, 2, 3};

        // Act
        sorter.bubbleSort(entrada);

        // Assert
        assertArrayEquals(esperado, entrada, "El arreglo debe quedar ordenado de forma ascendente.");
    }
}