# Creating Primitive Types Variables in Your Programs

[Variables](101-variables.md) | [Arrays](103-arrays/101-arrays.md)

----------


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


### Initializing a Variable with a Default Value

It is not always necessary to assign a value when a field is declared. Fields that are declared but not initialized will be set to a reasonable default by the compiler. Generally speaking, this default will be zero or null, depending on the data type. Relying on such default values, however, is generally considered bad programming style.

The following table summarizes the default values for the above data types.

<table>
<thead>
<tr>
<th>Data Type</th>
<th>Default Value (for fields)</th>
</tr>
</thead>
<tbody><tr>
<td>byte</td>
<td>0</td>
</tr>
<tr>
<td>short</td>
<td>0</td>
</tr>
<tr>
<td>int</td>
<td>0</td>
</tr>
<tr>
<td>long</td>
<td>0L</td>
</tr>
<tr>
<td>float</td>
<td>0.0f</td>
</tr>
<tr>
<td>double</td>
<td>0.0d</td>
</tr>
<tr>
<td>char</td>
<td><code>\u0000</code></td>
</tr>
<tr>
<td>String (or any object)</td>
<td>null</td>
</tr>
<tr>
<td>boolean</td>
<td><code>false</code></td>
</tr>
</tbody></table>

----------

**Local variable initialization**

Local variables are slightly different; the compiler never assigns a default value to an uninitialized local variable. If you cannot initialize your local variable where it is declared, make sure to assign it a value before you attempt to use it. Accessing an uninitialized local variable will result in a compile-time error.

### Creating Values with Literals

You may have noticed that the new keyword is not used when initializing a variable of a primitive type. Primitive types are special data types built into the language; they are not objects created from a class. A literal is the source code representation of a fixed value; literals are represented directly in your code without requiring computation. As shown below, it is possible to assign a literal to a variable of a primitive type:

```java
boolean result = true;
char capitalC = 'C';
byte b = 100;
short s = 10000;
int i = 100000;
```

### Integer Literals

An integer literal is of type long if it ends with the letter `L` or `l`; otherwise it is of type int.

Values of the integral types `byte`, `short`, `int`, and `long` can be created from `int` literals. Values of type `long` that exceed the range of `int` can be created from literals. Integers literals can be expressed by these number systems:

- Decimals: Base 10, whose digit consists of the numbers 0 through 9; this is the number system you use every day.
- Hexadecimal: Base 16, whose digits consist of the numbers 0 through 9 and the letters A through F
- Binary: Base 2, whose digits consists of the numbers 0 and 

For general-purpose programming, the decimal system is likely to be the only number system you will ever use. However, if you need to use another number system, the following example shows the correct syntax. The prefix 0x indicates hexadecimal and 0b indicates binary:

```java
// The number 26, in decimal
int decimalValue = 26;

//  The number 26, in hexadecimal
int hexadecimalValue = 0x1a;

// The number 26, in binary
int binaryValue = 0b11010;
```

### Floating-Point Literals

A floating-point literal is of type float if it ends with the letter `F` or `f`; otherwise its type is double and it can optionally end with the letter `D` or `d`.

The floating point types (`float` and `double`) can also be expressed using `E` or `e` (for scientific notation), `F` or `f` (32-bit float literal) and `D` or `d` (64-bit double literal; this is the default and by convention is omitted).

```java
double d1 = 123.4;

// same value as d1, but in scientific notation
double d2 = 1.234e2;
float f1  = 123.4f;

```


### Character and String Literals

Always use 'single quotes' for char literals and "double quotes" for String literals.

The Java programming language also supports a few special escape sequences for char and String literals: `\b` (backspace), `\t` (tab), `\n` (line feed), `\f` (form feed), `\r` (carriage return), `\"` (double quote), `\'` (single quote), and `\\` (backslash).

There is also a special `null` literal that can be used as a value for any reference type. The null literal may be assigned to any variable, except variables of primitive types.


### Using Underscore Characters in Numerical Literals

any number of underscore characters (_) can appear anywhere between digits in a numerical literal. This feature enables you, for example. to separate groups of digits in numeric literals, which can improve the readability of your code.

For instance, if your code contains numbers with many digits, you can use an underscore character to separate digits in groups of three, similar to how you would use a punctuation mark like a comma, or a space, as a separator.

The following example shows other ways you can use the underscore in numeric literals:

```java
long creditCardNumber = 1234_5678_9012_3456L;
long socialSecurityNumber = 999_99_9999L;
float pi =  3.14_15F;
long hexBytes = 0xFF_EC_DE_5E;
long hexWords = 0xCAFE_BABE;
long maxLong = 0x7fff_ffff_ffff_ffffL;
byte nybbles = 0b0010_0101;
long bytes = 0b11010010_01101001_10010100_10010010;

```

You can place underscores only between digits; you cannot place underscores in the following places:

- At the begining or end of a number
- Adjacent to a decimal point int a floating point literal
- Prior to an `F` or `L` suffix
- In positions where a string of digits is expected

The following examples demonstratge valid and invalid underscore placements in numeric literals:

```java
// Invalid: cannot put underscores
// adjacent to a decimal point
float pi1 = 3_.1415F;
// Invalid: cannot put underscores
// adjacent to a decimal point
float pi2 = 3._1415F;
// Invalid: cannot put underscores
// prior to an L suffix
long socialSecurityNumber1 = 999_99_9999_L;

// OK (decimal literal)
int x1 = 5_2;
// Invalid: cannot put underscores
// At the end of a literal
int x2 = 52_;
// OK (decimal literal)
int x3 = 5_______2;

// Invalid: cannot put underscores
// in the 0x radix prefix
int x4 = 0_x52;
// Invalid: cannot put underscores
// at the beginning of a number
int x5 = 0x_52;
// OK (hexadecimal literal)
int x6 = 0x5_2;
// Invalid: cannot put underscores
// at the end of a number
int x7 = 0x52_;

```

[Variables](101-variables.md) | [Arrays](103-arrays/101-arrays.md)