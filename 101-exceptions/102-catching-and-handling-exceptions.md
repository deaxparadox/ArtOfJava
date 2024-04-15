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