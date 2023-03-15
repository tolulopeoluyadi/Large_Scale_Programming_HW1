

package org.howard.edu.lsp.assignment4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.File;


public class Driver{
public static void main(String[] args) throws IntegerSetException {
    IntegerSet set1 = new IntegerSet();
    set1.add(1);
    set1.add(2);
    set1.add(3);
    
    IntegerSet set4 = new IntegerSet();
    set4.add(1);
    set4.add(2);
    set4.add(3);
    
    System.out.println("Value of Set1 is: " + set1.toString());
    System.out.println("Smallest value in Set1 is: " + set1.smallest());
    System.out.println("Largest value in Set1 is: " + set1.largest());
    
    System.out.println("set1 contains 2? " + set1.contains(2));
    System.out.println("set1 contains 4? " + set1.contains(4));

    IntegerSet set2 = new IntegerSet();
    set2.add(2);
    set2.add(4);
    set2.add(5);
    
    IntegerSet set3 = new IntegerSet();
    set3.add(1);
    set3.add(2);
    set3.add(3);
    
    
    System.out.println("set1 equals set4? " + set1.equals(set4)); // expected output: true
    System.out.println("set1 equals set3? " + set1.equals(set3)); 

    System.out.println("Union of Set1 and Set2");
    System.out.println("Value of Set1 is: " + set1.toString());
    System.out.println("Value of Set2 is: " + set2.toString());
    set1.union(set2);
    System.out.println("Result of union of Set1 and Set2");
    System.out.println(set1.toString());
    
    System.out.println("Intersection of Set1 and Set2");
    System.out.println("Value of Set1 is: " + set1.toString());
    System.out.println("Value of Set3 is: " + set3.toString());
    set1.intersect(set3);
    System.out.println("Result of intersection of Set1 and Set3");
    System.out.println(set1.toString());

    System.out.println("Difference of Set1 and Set3");
    System.out.println("Value of Set1 is: " + set1.toString());
    System.out.println("Value of Set3 is: " + set3.toString());
    set1.diff(set3);
    System.out.println("Result of difference of Set1 and Set3");
    System.out.println(set1.toString());
    
    System.out.println("clear Set1");
    set1.clear(); 
    System.out.println("Value of Set1 is: " + set1.toString());
    System.out.println("Is Set1 empty? " + set1.isEmpty()); 
    
	set2.remove(2);
    System.out.println("set2 after removing 2: " + set2.toString());
}
}

