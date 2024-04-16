# Catching and Handling Exceptions

The following examples defines and implements a class named `ListOfNumbers`. When constructured, `ListOfNumbers` creates an [ArrayList](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/ArrayList.html) that contains 10 [Integer](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/lang/Integer.html) elements with sequential values 0 through 9. The `ListOfNumbers` class also defines a method named `writeList()` which writes that list of number into a text file called `OutFile.txt`. The example uses output classes defiend in `java.io` which are covered in the Basic I/O.

```java
// Note: This class will not compile yet.
import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ListOfNumbers {

    private List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbers () {
        list = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(i);
        }
    }

    public void writeList() {
    // The FileWriter constructor throws IOException, which must be caught.
        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));

        for (int i = 0; i < SIZE; i++) {
            // The get(int) method throws IndexOutOfBoundsException, which must be caught.
            out.println("Value at: " + i + " = " + list.get(i));
        }
        out.close();
    }
}

```

The first line in boldface is a call to a constructor. The constructor initializes an output stream on a file. If the cannot be opened, the constructor throws an [IOException](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/io/IOException.html). T

The second boldface line is call to the [ArrayList](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/ArrayList.html) class's get method, which throws an [IndexOutOfBoundsException](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/lang/IndexOutOfBoundsException.html) if the value of its argument isto small (less than 0) or too large (more than the number of elements currently contained by the ArrayList).

If you try to compile the `ListOfNumbers` class, the compiler prints an error message about the exception thrown by the [FileWriter](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/io/FilterWriter.html) constructor. Howevery, it does not display an error message about the exception thrown by `get()`. The reason is that the exception thrown by the constructor, [IOException](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/io/IOException.html), is a check exception, and the one thrown by the `get()` method, [IndexOutOfBoundsException](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/lang/IndexOutOfBoundsException.html), is an uncheck exception.

Now let's write an exception handlers to catch and handle those exceptions.


### The Try Block

The first step in constructing an exception handler is to enclose the code that might throw an exception within a `try` block.

In general, a `try` block looks like the following:

```java
try {
    codes
} catch and finally blocks ...
```

The construct an exception handler for the `writeList()` method from the `ListOfNumbers` class, enclose the exception-throwing statements of the `writeList()` method within a `try` block. There is more than one way to do this. You can put each of line of code that might throw an exception within its own try block and provide separate exception handlers for each. Or, you can put all the `writeList()` code within a single `try` block and associate mulitple handlers with it.

The following listing uses one `try` block for the entire method because the code in question is very short:

```java
private List<Integer> list;
private static final int SIZE = 10;

public void writeList() {
    PrintWriter out = null;
    try {
        System.out.println("Entered try statement");
        out = new PrintWriter(new FileWriter("OutFile.txt"));
        for (int i = 0; i < SIZE; i++) {
            out.println("Value at: " + i + " = " + list.get(i));
        }
    }
    catch and finally blocks  . . .
}

```

If an exception occurs within the `try` block, that exception is handled by an exception handler associated with it. To assotiate an exception handler with a `try` block, you must put a `catch` block after it.


### The catch Blocks

You associate exception hanlers with a `try` block by providing one or more catch blocks diretly after the `try` block. No code can be between the end of the `try` block and the beginning of the first `catch` block.

```java
try {

} catch (ExceptionType name) {

} catch (ExceptionType name) {

}

```

Each `catch` block is an exception handler that handlers the type of exception indicated by its argument. The argument type, `ExceptionType`, declares the type of exception that the handler can handle and must be the name of a class that inherits from the [Throwable](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/lang/Throwable.html) class. The handler can refer to the exception with name.

The `catch` block contains code that is executed if and when  the exception handler is invoked. The runtime system invokes the exception handler when the handler is the first one in the call stack whose `ExceptionType` matches the type of the exception thrown. The system considers it a match if the thrown object can legally be assigned to the exception handler's argument.

The following are two exception handlers for the `writeList()` method:

```java
try {

} catch (IndexOutOfBoundsException e) {
    System.err.println("IndexOutOfBoundsException: " + e.getMessage());
} catch (IOException e) {
    System.err.println("Caught IOException: " + e.getMessage());
}

```

Exception handles can do more than just print error message or halt the program. They can do error recovery, prompt the user to make a decision, or propagate the error up to a higher-level handler using chained exceptions, as described in the Chained Exceptions section.


### Multi-Catching Exceptions

[<<< Exceptions](README.md) | [Home](../README.md) | [Throwing Exceptions](103-throwing-exceptions)