# Quiz 1

1. Write a method `contained` that recieves three string variables and return `true` if the first argument is a substring of the second argument, and second argument is a substring of the third argument.

    Example:

    - If you call `contained("A", "B", "C")` it returns `false`
    - If you call `contained("A", "AB", "ABC")` it returns `true`

    > **NOTE**: Assume that inputs are always uppercase strings, and there are no duplicates.

    ```java
    public class QuizOne {
        public static void main(String[] args) {
            if (contained("A", "AB", "ABC"))
                System.out.println("The strings are subset of each other");
            else
                System.out.println("The strings are NOT subset of each other");
        }

        // Your code
    }
    ```

2. If we have the following variable in our program:

    ```java
    char b = 'r';
    ```

    What is the correct way to the `isLetter` method from `Character` class on variable `b`?

    1. [ ] `isLetter(Character(b));`
    2. [ ] `Character.isLetter(b);`
    3. [ ] `Character a = new Character(b); a.isLetter;`
    4. [ ] `b.isLetter();`

3. What is the output of the following program?

    ```java
    public class SQ {
        public static void main(String[] args) {
            findSquere();
        }

        public static void findSquere() {
            int sum = 0;
            int squere = 0;

            for (int i = -1; i < 7; i += 2) {
                squere = i * i;
                sum += squere;
            }
            System.out.println(sum);
        }
    }
    ```

    1. [ ] 36
    2. [ ] 25
    3. [ ] 35
    4. [ ] 85

4. How to declare constant double variables in java?

    1. [ ] `final X = 4.0;`
    2. [ ] `double X = 4.0;`
    3. [ ] `private double CONSTANT = 4.0;`
    4. [x] `final double X = 4.0;`

5. What is the output of the following code?

    ```java
    public class M {
        public static char modify(char a) {
            a = 'z';
            return a;
        }

        public static void main(String[] args) {
            char a = 'h';
            modify(a);
            System.out.println(a);
        }
    }
    ```

    1. [ ] h
    2. [ ] Compilation error
    3. [ ] a
    4. [ ] z

6. What is the output of the following code?

    ```java
    public class SWC {
        public static void main(String[] args) {
            int k = 5;
            switch (k) {
                case 5:
                    System.out.print(k);
                case 4:
                    System.out.print(k);
                    k = k - 2;
                    break;
                case 3:
                    System.out.print(k);
                default:
                    System.out.print(0);
            }
        }
    }
    ```

    1. [ ] 553
    2. [ ] 55
    3. [ ] 54
    4. [ ] 543

7. What is the output of the following code?

    ```java
    public class St2 {
        public static void main(String[] args) {
            String s1 = "student";
            String s2 = "st";

            if (s1.substring(0, 2).equals(s2)) {
                System.out.println("b1");
                if (s1 == s2)
                    System.out.println("b2");
                else if (s1.equals(s2))
                    System.out.println("d2");
            } else {
                System.out.println("d2");
            }
        }
    }
    ```

    1. [ ] b1d2
    2. [ ] d2
    3. [ ] b1b2
    4. [ ] b1

8. What is the output of the following code?

    ```java
    public class Cond {
        public static void main(String[] args) {
            int x = 5;
            int y = 10;
            int z = 15;
            if (x > z && x < y)
                System.out.println(x);
            else if (x == y) {
                if (y > z && x > z)
                    System.out.println(y);
            }
            if (y > x || y > z)
                if (x == y)
                    System.out.println(z);
                else
                    System.out.println(x + z);
            else
                System.out.println(z + y);
        }
    }
    ```

    1. [ ] 520
    2. [ ] 5
    3. [ ] 25
    4. [ ] 20

9. Assume `a` and `b` are initialized integer variables, are we calculate `z` as follows:

    ```java
    double z = (double) a / b;
    ```

    Which expression is going to result in the same value of `z` as the one above?

    1. [ ] `double z = a / (1.0 * b)`
    2. [ ] `double z = a / b;`
    3. [ ] `double z = (1.0) * (a / b);`
    4. [ ] `double z = (double) (a / b);`

10. What is the output of the following code?

    ```java
    public class App {
        public static void main(String[] args) {
            int k;
            for (k = 11; k >= 7; k--) {
                k = k - 2;
                if (Math.pow((int) (Math.sqrt(k)), 2) == k)
                    System.out.println(k / 2 * 2);
                else if (k % 2 != 0)
                    System.out.println(k);
            }
        }
    }
    ```

    1. [ ] 8
    2. [ ] 87
    3. [ ] 9
    4. [ ] 97

11. What is the output of the following code?

    ```java
    public class St {
        public static void main(String[] args) {
            String c1 = "META123";
            String c2 = "MATH123";
            if (c1.compareTo(c2) > 0)
                System.out.println("b1");
            else if (c2.compareTo(c1) < 0)
                System.out.println("b2");
            else if (c1.compareTo(c2) < 1)
                System.out.println("b3");
            else
                System.out.println("b4");
        }
    }
    ```

    1. [ ] b4
    2. [ ] b2
    3. [ ] b1
    4. [ ] b3
