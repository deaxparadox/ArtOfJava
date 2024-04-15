# Arrays

- Array Way
    - [Declaring](#declaring-a-variable-to-refer-to-an-array)
    - [Creating](#creating-initializing-and-accessing-an-array)
    - [Multi Dimensional Array](#multidimensional-array)
    - [Length of Array](#length-of-array)


### Declaring a Variable to Refer to an Array

The preceding program declares an array (name `anArray`) with the following line of code

```java
// declares an array of integers
int[] anArray;
```

An array declaration has two component:

1. **The array's type**: 
    - An array's type is written as **type[]**, where type is the data type of the container elements; the bracket are special symbols indicating that this variable holds an array.
    - The size of the array is not part of its type (which is why the brackets are empty).
2. **The array's name**
    - An array's name can be anything you want, provided it follows that rules and conventions.

A Declaration does not actually create an array; it simply tells the compiler that this variable will hold the arry of the specified type.


Similarly, you can declare arrays of other types:

```java
byte[] anArrayOfBytes;
short[] anArrayOfShorts;
long[] anArrayOfLongs;
float[] anArrayOfFloats;
double[] anArrayOfDoubles;
boolean[] anArrayOfBooleans;
char[] anArrayOfChars;
String[] anArrayOfStrings;
```

You can also place the brackets after the array's name:

```java
// this form is discouraged
float anArrayOfFloats[];
```



### Creating, Initializing and Accessing an Array

One way to create an array is with the new operator. 

#### Step 1. Create an array of integers

```java
// Create an array of 10 size of integers
anArray = new int[10];
```

If this statement is missing, then the compiler prints an error link the following, and compilation fails:

```bash
ArrayDemo.java:4: Variable anArray may not have been initialized.
```

The next few lines assign values to each element of the array:

```java
anArray[0] = 100; // initialize first element
anArray[1] = 200; // initialize second element
anArray[2] = 300; // and so forth
```

Each array element is accessed by its numeical index:

```java
System.out.println("Element 1 at index 0: " + anArray[0]);
System.out.println("Element 2 at index 1: " + anArray[1]);
System.out.println("Element 3 at index 2: " + anArray[2]);

```


Alternatively, you can use the shortcut syntax to create and initialize an array:

```java
int[] anArray = {
    100, 200, 300,
    400, 500, 600,
    700, 800, 900, 1000
};

```

Here the length of the array is determined by the number of values provided between braces and separated by commas.


You can also declare an array of arrays (also known as a multidimensional array) by two or more sets of brackets, such as `String[][]` names. Each element, therefore, must be accessed by a corresponding number of index values.



### Multidimensional Array

In the Java programming language, a multidimensional array is an array whose components are themselves arrays. A consequence of this is that the rows are allowed to vary in length, as shown:

```java
class MultiDimArrayDemo {
    public static void main(String[] args) {
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);
    }
}

```

The output from this program is:

```bash
Mr. Smith
Ms. Jones
```


### Length of Array

Finally, you can use the built-in `length` property to determine the size of any array. The following code prints the array's size to standard output:

```java
System.out.println(anArray.length);
```