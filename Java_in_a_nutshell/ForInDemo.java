package Java_in_a_nutshell;

import java.util.*;

public class ForInDemo {
     public static void main(String[] args) {
         // This is a collection we'll iterate over below.
         Set<String> wordset = new HashSet<String>();

         // We start with a basic loop over the elements of an array.
         // The body of the loop is executed once for each element of args[].
         // Each time through one element is assigned to the variable word.
         for(String word : args) {
             System.out.print(word + " ");
             wordset.add(word);
         }
         System.out.println();

         // Now iterate through the elements of the Set.
         for(String word : wordset) System.out.print(word + " ");
     }
}
