package Topics;

import java.lang.reflect.Array;

public class ArrayCopyTopic {
    ArrayCopyTopic() {
        System.out.println("Array Copy Constructor");
    }

    static int globalVariable = 1;
    int localClassVariable = 2;


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

    public void arrayCopyOfRange() {
        String[] names = {
                "Nitish", "Deaxparadox", "Alien-X", "Azmuth", "Ghost Freak", "Vilgax",
                "Tom", "Jerry", "Spike"
        };

        String[] newNames = java.util.Arrays.copyOfRange(names, 2, 6);
        for (String i: newNames) {
            System.out.println(i);
        }
    }


    public void array_creation() {

        // declaring arary
        int[] nums = new int[10];

        // updating values
        for (int i=0; i<10; i++) {
            nums[i] = i+10;
        }

        // printing values
        for (int i: nums) {
            System.out.println(i);
        }
    }

    public void array_creation_with_values() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 0};


        // iterating over array using index
        System.out.print("Using index: ");
        for (int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }



        // interating over array using element
        System.out.print("\nOn element: ");
        for (int i: nums) {
            System.out.print(i + " ");
        }
    }


    public static void main(String[] args) {
        ArrayCopyTopic  obj1 = new ArrayCopyTopic();
        // obj1.copyToAnotherArrayNumber();
        // obj1.copyToAnotherArrayString();
        // obj1.array_creation_with_values();
        obj1.arrayCopyOfRange();
    }
}
