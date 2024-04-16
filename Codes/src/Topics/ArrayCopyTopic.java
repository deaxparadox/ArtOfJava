package Topics;

import java.lang.reflect.Array;

public class ArrayCopyTopic {
    ArrayCopyTopic() {
        System.out.println("Array Copy Constructor");
    }
    public void copyToAnotherArrayNumber() {
        int size = 5;

        // original array
        int[] name1 = {1, 2 ,3, 4, 5, 6, 7, 8, 9};
        System.out.print("Original Array ");
        for (int num : name1 )  {
            System.out.print(num + " ");
        }
        System.out.println("\nCopy data from index 1, of length 5");


        int[] name2 = new int[size];


        System.arraycopy(name1, 1, name2, 0, size);


        System.out.print("Copied Array ");
        for (int num : name2 ) {
            System.out.print(num + " ");
        }
        System.out.println();

    }

    public void copyToAnotherArrayString() {
        int size = 5;

        // original array
        String[] name1 = {"Paradox", "Azmuth", "Ben10", "XLR8", "Upgrade", "Daimond Head", "Chroma Stone", "Alien-X", "Gwen 10"};
        System.out.print("Original Array: ");
        for (String name : name1 )  {
            System.out.print(name + ", ");
        }
        System.out.println("\nCopy data from index 1, of length 5");


        String[] name2 = new String[size];


        System.arraycopy(name1, 4, name2, 0, size);


        System.out.print("Copied Array: ");
        for (String name : name2 ) {
            System.out.print(name + ", ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        ArrayCopyTopic  obj1 = new ArrayCopyTopic();
        // obj1.copyToAnotherArrayNumber();
        obj1.copyToAnotherArrayString();
    }
}
