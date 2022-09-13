# Lab 02

## Task 1

1. **Question Discription:**

    The arrays list1 and list2 are equal if they have the same elements in the same order. Write a method that returns true if list1 and list2 are equal, using the following header:

    ```java
    public static boolean equals(int[] list1, int[] list2)
    ```

    Write a test program that prompts the user to enter two lists of integers and displays whether the two are identical.

    > **Note**: the first number in the input for each list indicates the number of the elements in the list. This number is not part of the list.
2. **Sample Runs** (user input is in bold):

    Enter list1 size<br>
    **5**<br>
    Enter list1<br>
    **2 5 6 6 1**<br>
    Enter list2 size<br>
    **5**<br>
    Enter list2<br>
    **2 5 6 6 1**<br>
    list1 and list2 are equal

    ---
    Enter list1 size<br>
    **5**<br>
    Enter list1<br>
    **5 5 6 6 1**<br>
    Enter list2 size<br>
    **5**<br>
    Enter list2<br>
    **5 6 1 6 5**<br>
    list1 and list2 are not equal

    ---
    Enter list1 size<br>
    **4**<br>
    Enter list1<br>
    **5 5 6 6**<br>
    Enter list2 size<br>
    **5**<br>
    Enter list2<br>
    **5 5 6 6 1**<br>
    list1 and list2 are not equal

**My Solution**: [Task.java](Task.java)
