# Arrays

- Array Way
    - [Declaring](#declaring-a-variable-to-refer-to-an-array)
    - [Creating](#creating-initializing-and-accessing-an-array)


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