package com.company;

public class Main {

    public static void main(String[] args) {
	    /*
        // Exercise 1

        1.1: 7
        1.2: 2
        2.  Binary search: 6 x comparison done
        int [] arr = {-4, 2, 16, 78, 165, 8885};
        int n = arr.length;
        int key = 16;
        int low = 0;
        int high = n - 1;
        boolean found = false;
        while (!found && low <= high)
        {
            int mid = (low + high) / 2;
            int v = arr [mid];
            if (key == v)
                found = true;
            else if (key < v)
                high = mid - 1;
            else
                low = mid + 1;
        }
        for (int i = 0; i < n; i++)
            if (arr[1] != key)
                System.out.println ("comparison done, key did not match yet.");
        System.out.println (found);

        2. Sequential search: 5 x comparison done
        final int [] numbers = {4, -5, 11, -3, 66};
        final int key = -3;
        boolean found = false;
        for (int index = 0; !found && index < numbers.length; index++)
            if (numbers [index] == key)
            {
                found = true;
                break;
            }
        for (int i = 0; i < numbers.length; i++)
            if (numbers [1] != key)
                System.out.println ("comparison done, key did not match yet.");
        System.out.println (found);
-----------------------------------------------------------------------------------------------
      // Exercise 2

        String [] students = {"Alissa", "Ben", "Charlie", "Dianna"};
        String [] grades = {"A", "B", "C", "D"};
        String key = "Charlie";

        boolean found = false;
        int index;
        for (index = 0; index < students.length; index++)
            if (students [index].equals(key))
        {
            found = true;
            break; // if you want to find it only once
        }
        if (!found)
            System.out.println (key + " not found");
        else
            System.out.println (key + " received the grade: " + grades [index]);

-----------------------------------------------------------------------------------------------
        // Exercise 3

        1.1 {-4, 11, 7, -12, 6, 1} (selection sort)
        -4, 11, 7, -12, 6, 1
        -4, 7, 11, -12, 6, 1
        -12, -4, 7, 11, 6, 1
        -12, -4, 6, 7, 11, 1
        -12, -4, 1, 6, 7, 11 -> 5 passes
        1. 2 {-4, 11, 7, -12, 6, 1} (bubble sort)
        pass 1
            -4, 11, 7, -12, 6, 1
            -4, 7, 11, -12, 6, 1
            -4, 7, -12, 11, 6, 1
            -4, 7, -12, 6, 11, 1
            -4, 7, -12, 6, 1, 11
       pass 2
            -4, 7, -12, 6, 1, 11
            -4, -12, 7, 6, 1, 11
            -4, -12, 6, 7, 1, 11
            -4, -12, 6, 1, 7, 11
            -4, -12, 6, 1, 7, 11
        pass 3
            -12, -4, 6, 1, 7, 11
            -12, -4, 6, 1, 7, 11
            -12, -4, 1, 6, 7, 11
            -12, -4, 1, 6, 7, 11
            -12, -4, 1, 6, 7, 11

        2. selection sort: 5 passes - hypothesis true
        int [] arr = {-4, 11, 7, -12, 6, 1};
        for (int i = 0; i < arr.length - 1; i++)
        {
            int indSmallest = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr [j] < arr [indSmallest])
                    indSmallest = j;
            swap (arr, i, indSmallest);
            if (!!!!something!!!!)
                System.out.println("after 1 pass the resulting array is: " + arr);
        }
        for (int a : arr)
            System.out.print (a + " ");
    }
    static void swap (int[] array, int ind1, int ind2)
    {
        int tmp = array [ind1];
        array [ind1] = array [ind2];
        array [ind2] = tmp;

        bubble sort: */
        int [] numbers = {-4, 11, 7, -12, 6, 1};
        final int n = numbers.length;
        boolean changed = true;
        while (changed)
        {
            changed = false;
            for (int i = 0; i <= n - 2; i++)
            {
                if (numbers [i] > numbers [i] + 1)
                {
                    swap (numbers, i, i + 1);
                    changed = true;
                }
            }
        }
        for (int a: numbers)
            System.out.print (a + " ");
    }
    static void swap (int [] array, int ind1, int ind2)
    {
        int tmp = array [ind1];
        array [ind1] = array [ind2];
        array [ind2] = tmp;
    }


}
