package de.haubold.sortieralgorithmen;

public class Bubblesort {

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
        for (int i = 1; i < zahlen.length; i++){
            for (int j = 0; j < zahlen.length-1;j++){
                if(zahlen[j] > zahlen[j+1]) {
                    int größer = zahlen[j];
                    int kleiner = zahlen[j+1];
                    zahlen[j+1] = größer;
                    zahlen[j] = kleiner;
                }
            }
        }
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
