import de.haubold.beispiel.Namen;
import de.haubold.sortieralgorithmen.Bubblesort;
import de.haubold.sortieralgorithmen.Selectionsort;

public class Main {


    public static void main(String[] args) {

        Bubblesort sort = new Bubblesort();
        sort.befüllen(10);
        sort.sortieren();
        System.out.println(sort.toString());

        /*Namen n = new Namen(4);
        setNamebesipiel(n);
        n.selectionsort();
        System.out.println(n.toString());*/

        /*Selectionsort select = new Selectionsort();
        select.befüllen(10);
        select.sortieren();
        System.out.println(select.toString());*/
    }

    public static void setNamebesipiel(Namen n) {
        n.setName("Tom",2001);
        n.setName("Paul", 2000);
        n.setName("Niklas",2000);
        n.setName("Jakob", 1997);
    }
}