# Operators in Java

Operators are special symbols that perform specific operations on one, two or three operands, and them return a result.

The operators in the following tables are listed according to precedence order. 

- The closer to the top of the table an operator appears, the higher its precedence. Operators with higher precedence are evaluated before operators with relatively lower precedence. 

- Operators on the same line have equal precedence. 

- When operators of equal precedence appear in the same expression, a rule must govern which is evaluated first. All binary operators except for the assignment operators are evaluted from left to right; assignment operators are evaluated right to left.

<table>
<thead>
<tr>
<th>Operators</th>
<th>Precedence</th>
</tr>
</thead>
<tbody><tr>
<td>postfix</td>
<td><code>expr++</code> <code>expr--</code></td>
</tr>
<tr>
<td>unary</td>
<td><code>++expr</code> <code>--expr</code> <code>+expr</code> <code>-expr</code> <code>~</code> <code>!</code></td>
</tr>
<tr>
<td>multiplicative</td>
<td><code>*</code> <code>/</code> <code>%</code></td>
</tr>
<tr>
<td>additive</td>
<td><code>+</code> <code>-</code></td>
</tr>
<tr>
<td>shift</td>
<td><code>&lt;&lt;</code> <code>&gt;&gt;</code> <code>&gt;&gt;&gt;</code></td>
</tr>
<tr>
<td>relational</td>
<td><code>&lt;</code> <code>&gt;</code> <code>&lt;=</code> <code>&gt;=</code> <code>instanceof</code></td>
</tr>
<tr>
<td>equality</td>
<td><code>==</code> <code>!=</code></td>
</tr>
<tr>
<td>bitwise AND</td>
<td><code>&amp;</code></td>
</tr>
<tr>
<td>bitwise exclusive OR</td>
<td><code>^</code></td>
</tr>
<tr>
<td>bitwise inclusive OR</td>
<td><code>|</code></td>
</tr>
<tr>
<td>logical AND</td>
<td><code>&amp;&amp;</code></td>
</tr>
<tr>
<td>logical OR</td>
<td><code>||</code></td>
</tr>
<tr>
<td>ternary</td>
<td><code>? :</code></td>
</tr>
<tr>
<td>assignment</td>
<td><code>=</code> <code>+=</code> <code>-=</code> <code>*=</code> <code>/=</code> <code>%=</code> <code>&amp;=</code> <code>^=</code> <code>|=</code> <code>&lt;&lt;=</code> <code>&gt;&gt;=</code> <code>&gt;&gt;&gt;=</code></td>
</tr>
</tbody></table>


### The Simple Assignment Operator

One of the most common operators that is used is assignment operator `=`.

```java
int cadence = 0;
int speed = 0;
int gear = 1;

```


### The Arithmetic Operators

Java programming language provides operators that perform addition, subtraction, multiplication, and division.

<table>
<thead>
<tr>
<th>Operator</th>
<th>Description</th>
</tr>
</thead>
<tbody><tr>
<td><code>+</code></td>
<td>Additive operator (also used for String concatenation)</td>
</tr>
<tr>
<td><code>-</code></td>
<td>Subtraction operator</td>
</tr>
<tr>
<td><code>*</code></td>
<td>Multiplication operator</td>
</tr>
<tr>
<td><code>/</code></td>
<td>Division operator</td>
</tr>
<tr>
<td><code>%</code></td>
<td>Remainder operator</td>
</tr>
</tbody></table>


The following programming, `ArithmeticDemo`, tests the arithmetic operators:

```java
class ArithmeticDemo {

    public static void main (String[] args) {

        int result = 1 + 2;
        // result is now 3
        System.out.println("1 + 2 = " + result);
        int original_result = result;

        result = result - 1;
        // result is now 2
        System.out.println(original_result + " - 1 = " + result);
        original_result = result;

        result = result * 2;
        // result is now 4
        System.out.println(original_result + " * 2 = " + result);
        original_result = result;

        result = result / 2;
        // result is now 2
        System.out.println(original_result + " / 2 = " + result);
        original_result = result;

        result = result + 8;
        // result is now 10
        System.out.println(original_result + " + 8 = " + result);
        original_result = result;

        result = result % 7;
        // result is now 3
        System.out.println(original_result + " % 7 = " + result);
    }
}

```

The program prints t he following output:

```bash
1 + 2 = 3
3 - 1 = 2
2 * 2 = 4
4 / 2 = 2
2 + 8 = 10
10 % 7 = 3

```