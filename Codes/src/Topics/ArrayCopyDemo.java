package Topics;

import java.lang.reflect.Array;

public class ArrayCopyDemo {

    public final int SIZE = 7;

    public ArrayCopyDemo() {
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto"
        };
        String[] copyTo = new String[this.SIZE];
        System.arraycopy(copyFrom, 2, copyTo, 0, this.SIZE);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        new ArrayCopyDemo();
    }
}
