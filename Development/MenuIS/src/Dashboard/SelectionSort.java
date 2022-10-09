/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboard;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Dell
 */
public class SelectionSort {
    /**
     * the array value are swapped according to index
     * @param a
     * @param i 
     * @param j 
     */
    public static void swap(int[] a, int i, int j)
   {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
   }
   
    /**
     * 
     * @param a array t sort
     * @param array ArrayList to sort
     * minimumPosition method is called to find the minimum position
     * swap method is also called
     * Collections.swap is also called to sort ArrayList
     * 
     */
public static void sortArray(int [] a,ArrayList array)
   {  
      for (int i = 0; i < a.length-1; i++)
      {  
         int minPos = minimumPosition(a, i);
         swap(a, minPos, i);
         Collections.swap(array,minPos,i);
      }
       
   }
   
/**
 * finding the minimum position of the array
 * @param a
 * @param from
 * @return 
 */
   public static int minimumPosition(int[] a, int from)
   {  
      int minPos = from;
      for (int i = from + 1; i < a.length; i++)
      {
         if (a[i] < a[minPos]) { 
             minPos = i; 
         }
      }
      return minPos;
   }
   
}
