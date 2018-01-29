/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraymanipulation;

/**
 *
 * @author cswan
 */
public class ArrayManipulation
{

    /**
     * @param args the command line arguments
     */
    static int[] array = new int[]{8,7,4,3,2,1,9};
    static int max = array.length;
    
    public static void main(String[] args)
    { 
//        ex1();
//        ex2();
//        ex3();
//        ex4();
//        ex5();
//        ex6()
//        ex7();
//        ex8();
//        ex9();
    }

    private static void ex1()
    {
        System.out.println("Ex1 - Scan array from left to right");
        for (int i = 0; i < max; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void ex2()
    {
        System.out.println("Ex2 - Scan array from right to left");
        for (int i = max - 1; i >= 0; i--)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void ex3()
    {
        System.out.println("Ex3 - Scan array from left to centre, then right to centre");
        for (int i = 0; i < max / 2; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = max - 1; i >= (max / 2); i--)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void ex4()
    {
        System.out.println("Ex4 - Scan array from centre to left, then centre to right");
        for (int i = max / 2; i >= 0; i--)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = max / 2 + 1; i < max; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void ex5()
    {
        System.out.println("Ex5 - Scan array left to right then right to left");
        for (int i = 0; i < max; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = max - 1; i >= 0; i--)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void ex6()
    {
        System.out.println("Scan an array from left to right, then right to left, as many times as there are items");
        for (int i = 0; i < max; i++)
        {
            for (int j = 0; j < max; j++)
            {
                System.out.print(array[j] + " ");
            }
            System.out.println();
            for (int j = max - 1; j >= 0; j--)
            {
                System.out.print(array[j] + " ");
            }
            System.out.println("\n");
        }
    }

    private static void ex7()
    {
        System.out.println("Scan an array from left to right, then right to left, as many times as there are items");
        System.out.println("But drop one cell off the right end each pass");
        for (int i = max; i >= 0 ; i--)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(array[j] + " ");
            }
            System.out.println();
            for (int j = i - 1; j >= 0; j--)
            {
                System.out.print(array[j] + " ");
            }
            System.out.println("\n");
        }
    }

    private static void ex8()
    {
        System.out.println("Scan an array from left to right, then right to left, as many times as there are items");
        System.out.println("But drop one cell off the left end each pass");
        for (int i = 0; i < max ; i++)
        {
            for (int j = i; j < max; j++)
            {
                System.out.print(array[j] + " ");
            }
            System.out.println();
            for (int j = max - 1; j >= i; j--)
            {
                System.out.print(array[j] + " ");
            }
            System.out.println("\n");
        }
    }

    private static void ex9()
    {
        System.out.println("Scan an array from left to right, then right to left, as many times as there are items");
        System.out.println("But drop one cell off each end each pass");
        for (int i = 0; i < max / 2 + 1; i++)
        {
            for (int j = i; j < max - i; j++)
            {
                System.out.print(array[j] + " ");
            }
            System.out.println();
            for (int j = max - i - 1; j >= i; j--)
            {
                System.out.print(array[j] + " ");
            }
            System.out.println("\n");
        }
    }
    
}
