package de.haubold.beispiel;

public class Namen{

    private final int größe;
    private String[] namen;
    private int[] geburtsjahr;
    private int zähler = 0;



    public Namen(int größe) {
        if(größe <= 0) {
            throw new IllegalArgumentException("größe darf nicht negativ oder null sein");
        }
        this.größe = größe;
        namen = new String[größe];
        geburtsjahr= new int[größe];
    }

    public void setName(String namen, int geburtsjahr) {
        if (namen == null || geburtsjahr <= 0) {
            throw new IllegalArgumentException("Kein Name eingegeben oder das geburtsjahr ist außerhalb des erlaubten Bereichs"); //ändern
        }
        this.namen[zähler] = namen;
        this.geburtsjahr[zähler] = geburtsjahr;
        zähler++;
    }

    public void bubblesort() {
        for (int i = 1; i < geburtsjahr.length;i++) {
            for (int j = 0; j < geburtsjahr.length-1;j++) {
                if (geburtsjahr[j] > geburtsjahr[j+1]) {
                    int größer = geburtsjahr[j];
                    int kleiner = geburtsjahr[j+1];
                    geburtsjahr[j] = kleiner;
                    geburtsjahr[j+1] = größer;
                    String größer_n = namen[j];
                    String kleiner_n = namen[j+1];
                    namen[j] = kleiner_n;
                    namen[j+1] = größer_n;
                }
            }
        }
    }
    public void selectionsort() {
        for (int i = 0; i < geburtsjahr.length;i++) {
            int min = geburtsjahr[i];
            for (int j = i; j < geburtsjahr.length; j++) {
                if (geburtsjahr[j] < min) {
                    int größer = min;
                    min = geburtsjahr[j];
                    geburtsjahr[i] = min;
                    geburtsjahr[j] = größer;
                    String kleiner_n = namen[j];
                    String größer_n = namen[i];
                    namen[i] = kleiner_n;
                    namen[j]= größer_n;
                }
            }
        }
    }


    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < geburtsjahr.length;i++) {
            s.append(namen[i]).append("      ");
        }
        s.append("\n");
        for (int i = 0; i < geburtsjahr.length;i++) {
            s.append(geburtsjahr[i]).append("       ");
        }
        return s.toString();
    }
}
