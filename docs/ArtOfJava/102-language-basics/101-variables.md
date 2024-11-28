# Variables


[<<< HOME](../README.md) | [Creating Primitive types](102-creating-primitives-types.md)

----------



An object stores its state in *fields*.

```java
int cadence = 0;
int speed = 0;
int gear = 1;
```

In the Java programming language, the terms "fields" and "variable" are both used.

The Java programming languages defines the following kinds of variables:

- **Instance Variables (Non Static Fields)**: Technically speaking, objects store their individual states in *non-static fields*, that is, fields declared without the `static` keyword. Non-static fields are also known as instance variables because their values are unique to each instance of a class (to each object); the `currentSpeed` of one bicycle is independent from the `currentSpeed` of another.

- **Class Variables (Static Fields)**: 
    1. A class variable is any field declared with the `static` modifier, this tells the compiler that there is exactly one copy of this variable in existence, regardless of how many times the class has been instantiated. 
    2. A field defining the number of gears for a particular kind of bicycle could be marked as `static` since comceptually the same number of gears will apply to all instances. The code `static int numGears = 6;` would create such a `static` field. 
    3. Additionally, the keyword `final` could be added to indicate that the number of gears will never change.

- **Local Variables**: Similar to how an object stores its statie in fields, a method will often store its temporary state in local variables. The syntax for declaring a local variable is similar to declaring a field (for example, `int count = 0;`). Local variables are only visible to the methods in which they are declared; they are not accessible from the rest of the class.

- **Parameters**: Variables that are used by function to take input on function calls are called parameters. Such as in `public static void main(String[] args)`. Here, the `args` variable is the parameter to this method. 

A type's fields, methods, and nested types are collectively called its *members*.

### Naming Variables

The rules and conventions for naming your variables can be summarized as follows:

- Variable names are case-sensitive. A variable's name can be any legal identifier — an unlimited-length sequence of Unicode letters and digits, beginning with a letter, the dollar sign "$", or the underscore character "_".
- When choosing a name for your variables, use full words instead of cryptic abbreviations.
- If the name you choose consists of only one word, spell that word in all lowercase letters. If it consists of more than one word, capitalize the first letter of each subsequent word. The names `gearRatio` and `currentGear` are prime examples of this convention. 
- If your variable stores a constant value, such as static final int `NUM_GEARS = 6`, the convention changes slightly, capitalizing every letter and separating subsequent words with the underscore character. 

[<<< HOME](../README.md) | [Home](../README.md) | [Creating Primitive types](102-creating-primitives-types.md)