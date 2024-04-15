# ArtOfJava

Learn Java

Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.

### Compiling and Executing Java Code

There are several steps that you need to follow to create a Java application.

If you need to create an enterprise application, the creation process is more complex but at its core you will find these simple steps.

The first of these steps is to write some Java code in a test editor.

Then this code has to be transformed to another format, which can be executed by your computer. This transformation is conducted by a special piece of software called a *compiler*.

The file produced by a compiler is often called a binary file or an executable file.

This code contains special binary codes called byte code.

----------

Bytecode is computer object code that an interpretor converts into binary machine code so it can be read by a computer's hardare processor. Ther interpretor is typically implemented as a virtual machine (VM) that translate the bytecode for the target platform.

-------


### Creating a First Java Class

All the code must be held in a Java class.

A Java class is created by a special declaration in a text file.

```java
public class MyFirstClass {
}
```

The name of this Java class is `MyFirstClass`. You need to save this text file in a file named `MyFirstClass.java`. A Java class must be saved in a file that has the same name as your class with the extension `.java`. This is mandatory and is in fact very convenient because you do not need to open a file to know what class is written to it.

The name of a Java class starts with a capital letter.


### Setting up a Java Development Kit

You can download the JDK from different places. There is a one-stop page that always refers to the latest version of the JDK: [https://jdk.java.net/](https://jdk.java.net/). Selecting the latest "Ready for use" JDK version takes you to a page where you can download the version of the JDK you need.


#### Setting up a JDK for Linux/x64

To install it on Linux follow the following link: [Setting up JDK](https://dev.java/learn/getting-started/#setting-up-jdk)

### Compiling your First class

Once you have properly set up your JDK; the `JAVA_HOME` variable and the `PATH` variable, you are ready to compile your first class.

**Compiling and Running Your First Java Program**:

Check that your compiler is accessible:

```bash
$ java -version
```

Now you are all set to compile you first code. You can type the following:

```bash
$ javac MyFirstClass.java
```

If the compiler remains silent and does not complain about anything. It means that your Java code has been properly compiled.

Checking the content of the directory again should show a new file in it: `MyFirstClass.class`

[Variables](101-basics/101-variables.md)
[Exceptions](101-exceptions/README.md)

Hot Topcis:
- [static keyword](100-topics/101-static.md)