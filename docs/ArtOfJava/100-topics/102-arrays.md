# Arrays


- [Array Creation](#array-creation)
- [Interating over array](#iterating-over-arrays)
- [Copy Array](#copying-arrays)


### Array Creation



We are going to declare empty *integer* array of of size *10*.

```java
        // declaring arary
        int[] nums = new int[10];
```

Update values, interating over index, and updating values.

```java
        // updating values
        for (int i=0; i<10; i++) {
            nums[i] = i+10;
        }
```

Printing array:

```java
        for (int i: nums) {
            System.out.println(i);
        }
```

Output:

```
10
11
12
13
14
15
16
17
18
19
```


We can also initialize an array with values:

```java
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 0};
```

### Iterating over arrays

Iterating over array using index, this approach requires you to known the size of the array.

```java
        // iterating over array using index
        System.out.print("Using index: ");
        for (int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
```

Iterating over elements of array.

```java
        // interating over array using element
        System.out.print("\nOn element: ");
        for (int i: nums) {
            System.out.print(i + " ");
        }

```


### Copying Arrays

The `System` class has an `ararycopy()` method that you can use to efficiently coyp data from one array another:


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


In the second example, following above code, we are going to copy string from one array to another:

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

Java has another builtin method to copy array `copyOfRange(array, start, stop)`, which take source array, range of index you want to copy, it internally creates an array and return the new array:

```java
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
```

```output
Alien-X
Azmuth
Ghost Freak
Vilgax
```