# Arrays


### Copying Arrays

The `System` class has an `ararycopy()` method that you can use to efficiently coyp data from one array another:


#### Copy Numbers

For the first example we are going to copy the numbers from one array to another, starting from index `1` for first array `num1` to another array `num2` from starting position `0` for the length of `num2` `5`:

```java
    public void copyToAnotherArrayNumber() {
        int size = 5;

        // original array
        int[] num1 = {1, 2 ,3, 4, 5, 6, 7, 8, 9};
        System.out.print("Original Array ");
        for (int num : num1 )  {
            System.out.print(num + " ");
        }
        System.out.println("\nCopy data from index 1, of length 5");


        int[] num2 = new int[size];


        System.arraycopy(num1, 1, num2, 0, size);


        System.out.print("Copied Array ");
        for (int num : num2 ) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
```

#### Copy Strings

Following above code, we are going to copy string from one array to another:

```java
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

```