# Creating Primitive Types Variables in Your Programs

### Primitive Types

The Java programming language is statically-typed, which means that all variables must first be declared before they can be used.

```java
int gear = 1;
```

Doing so tells your program that a fields named `gear` exists, hold numerical data, and has a  initial value of `1`.

In addition to `int` Java programming language support seven other primitive data types. A primitive type is predefiend by the language and is named by a reserved keyword. Primitive value do not share state with other predefined values.

The eight primitive data types supported by the Java programming language are:

- `byte`: 
    - The byte data type is an 8-bit signed two's complement integer. It has a minimum value of 128 and a maximum value of 127 (inclusive).
    - The byte data type can be useful for saving memory in large arrays, where the memory savings actually matters.

- `short`:
    - The `short` data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).
    - You can use a short to save memory in large arrays, in situations where the memory savings actually matters.

- `long`:
    - The `long` data type is a 64-bit two's complement integer.
    - The signed long has a minimum value of -2<sup>63</sup> and a maximum value of 2<sup>63</sup>-1.
    - You can use the long data type to represent an unsigned 64-bit long, which has a minimum value of 0 and a maximum value of 2<sup>64</sup>-1.

- `float`:
    - The `float` data type is a single-precision 32-bit IEEE 754 floating point.

- `double`:
    - The `double` data type is a double precision 64-bit IEEE 754 floating point.
    - For decimal values, this data type is generally the default choice.

- `boolean`: 
    - The boolean data type has only two possible values: `true` and `false`. Use this data type for simple flags that track true/false conditions.

- `char`:
    - The `char` data type is a single 16-bit Unicode character.
    - It as a minimum value of `\u0000` (or 0) and maximum value of `\uffff` (or 65535) inclusive.

----------

Java programming language also provides special support for character strings via the `java.lang.String` class. Enclosing your character string within double quotes will automatically create a new `String` object:

```java
String s = "this is a string";
```

`string` objects are immutable, which means that one created, their values cannot be changed.