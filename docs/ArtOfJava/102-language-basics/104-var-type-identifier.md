#  Using the Var Type Identifer

### The Var keyword

The `var` type identifier to declare a local variable. In doing so, you let the compiler decide what is the real type of variable you create. Once created, this type cannot be changed.


Consider the following example

```java
String message = "Hello world!";
Path path = Path.of("debug.log");
InputStream stream = Files.newInputStream(path);

```

With the var type identifier the previous code can be written as follow:

```java
var message = "Hello world!";
var path = Path.of("debug.log");
var stream = Files.newInputStream(path);
```


### Examples with Var


Here the `strings` variable is given the type `List<String>` and the `element` variable the type `String`.

```java
var list = List.of("one", "two", "three", "four");
for (var element: list) {
    System.out.println(element);
}

```

On this example, `path` variable is of type [Path](https://), and the `stream` variable is of type [InputStream](https://)

```java
var path = Path.of("debug.log");
try (var stream = Files.newInputStream(path)) {
    // process the file
}
```

### Restrictions on Using Var

There are restrictions on the use of the `var` type identifire.

1. You can only use to for *local variables* declared in methods, constructors and intializers blocks.
2. `var` cannot be used for fields, not for method or constructor parameters.
3. The compiler must be able to choose a type when the variable is declared. Since `null` has not type, the variable must have an initializer.


Following the these restriction, the following class does not compile, because using `var` as a type identifier is not possible for a field or a method parameter.

```java
public class User  {
    private var name = "Sue";

    public void setName(var name) {
        this.name = name;
    }
}

```



In that case, the compiler cannot guess the real type of `message` because is lacks an initializer.

```java
public String greetings(int message) {
    var greetings;
    if (message == 0) {
        greetings = "morning";
    } else {
        greetings = "afternoon";
    }
    return "Good " + greetings;
}
```

Above code fails because of `rule 3`, `var` type must have the initializer.

[<<< Creating, Initializatin and Accessing an array](103-arrays/102-creating-initializing-accessing.md) | [Home](../README.md) | [Operators in Java](105-java-operators.md)