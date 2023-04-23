package de.haubold.sortieralgorithmen;

import java.util.Random;

public class Selectionsort {

    private int[] zahlen;

    public void befüllen(int größe) {
        if(größe <= 0) {
            throw new IllegalArgumentException("Größe darf nicht Negativ oder null sein");
        }
        zahlen = new int[größe];
        for (int i = 0;i < zahlen.length;i++ ) {
            zahlen[i]= (int) (Math.random()*100);
        }

    }
    public void sortieren() {
        for (int i = 0; i < zahlen.length;i++) { //Auswahl der zu vergleichenden Zahl
            int min = zahlen[i];
            for (int j = i; j < zahlen.length; j++) { //vergleichen der Zahl am Index und Tauschen dieser
                if (zahlen[j] < min) {
                    int größer = min;
                    min = zahlen[j];
                    zahlen[i] = min;
                    zahlen[j] = größer;
                }
            }        }
    }
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < zahlen.length; i++) {
            s.append(zahlen[i]).append("  ");
        }
        return s.toString();
    }
}
