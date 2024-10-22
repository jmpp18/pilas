

package com.javalovers.pilas;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Pila<T> {
    
    private Object[] elementos;
    private int tope;
    private static final int CAPACIDAD_INICIAL = 10;

    public Pila() {
        elementos = new Object[CAPACIDAD_INICIAL];
        tope = -1; // La pila está vacía
    }

    public void push(T elemento) {
        if (tope == elementos.length - 1) {
            aumentarCapacidad();
        }
        elementos[++tope] = elemento;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        T elemento = (T) elementos[tope];
        elementos[tope--] = null;
        return elemento;
    }
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return (T) elementos[tope];
    }
    public T peekretorno() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return (T) elementos[tope-1];
    }
    
    public boolean isEmpty() {
        return tope == -1;
    }

    private void aumentarCapacidad() {
        int nuevaCapacidad = elementos.length * 2;
        elementos = Arrays.copyOf(elementos, nuevaCapacidad);
    }

    public int size() {
        return tope + 1;
    }
    public void imprimir() {
    if (isEmpty()) {
        JOptionPane.showMessageDialog(null, "La lista esta vacia");
        return;
    }
    
    JOptionPane.showMessageDialog(null, "Elementos en la lista:");
    for (int i = tope; i >= 0; i--) {
        JOptionPane.showMessageDialog(null, elementos[i]);
    }
}
}