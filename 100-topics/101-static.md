# Java "static" Keyword

- [Why Static](#why-static)
- [Static Variables](#static-variables)
- [Static Methods](#static-methods)
- [Static Blocks](#static-blocks)

### Why Static?

When you declare a variable or a method as static, it belongs to the class, rather than a specific instance. This means that only one instance of a static member exists, even if you create multiple objects of the class, or if you don't create any. It will be shared by all objects.

The static keywords can be used with variables, methods, code blocks and nested classes.


### Static Variables

```java
public class Counter {
  public static int COUNT = 0;
  Counter() {
    COUNT++;
  }
}
```

The `COUNT` variable will be shared by all objects of that class. When we create objects of our Counter class in main, and access the static variable.

```java
public class MyClass {
  public static void main(String[] args) {
    Counter c1 = new Counter();
    Counter c2 = new Counter();
    System.out.println(Counter.COUNT);
  }
}
// Outputs "2"
```

The output is 2, because the `COUNT` variable is static and gets incremented by one each time a new object of the Counter class is created. You can also access the static variable using any object of that class, such as `c1.COUNT`.


### Static Methods

A static method belongs to the class rather than instances. Thus, it can called without creating instance of class. It is used for altering static contents of the class. There are some restriction of static methods:

1. Static methods can not use non-statis members (variables or functions) of the class.
2. Static method can not use `this` or `super` keywords.

```java
public class Counter {
  public static int COUNT = 0;
  Counter() {
    COUNT++;
  }

  public static void increment(){
    COUNT++;
  }
}
```

Static methods can also be called from instance of the class.

```java
public class MyClass {
  public static void main(String[] args) {
    Counter.increment();
    Counter.increment();
    System.out.println(Counter.COUNT);
  }
}
// Outputs "2"
```
The output is 2 because it gets incremented by static methods `increment()`. Similar to static variables, static methods can also be access using instance variables.

### Static Blocks

A class can have static nested class which can be accessed by using outer class name.

```java
public class Outer {

  public Outer() {
  }

  public static class Inner {
    public Inner() {
    }
  }
}
```

In above example, class `Inner` can be directly accessd as a static member of class `Outer`.


```java
public class Main {
  public static void main(String[] args) {
    Outer.Inner inner = new Outer.Inner();
  }
}
```

One of the use case of static nested classes in [Builder Pattern](https://en.wikipedia.org/wiki/Builder_pattern#Java) popularly used in java.