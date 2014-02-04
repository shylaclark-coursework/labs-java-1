/** 
* Excercise One
* Lab Three
**/

import java.util.Scanner;

public class ExerciseOne { 

    public static void main( String[] argsv ) {

        // create a scanner object
        Scanner sc = new Scanner(System.in);

        // create a String variable to store the day of the week
        String input = "";
    
        // user enter day of week and store in string
        System.out.println( "Enter day of the week: " );
        input = sc.nextLine();
  
        // print "Before the If statement"
        System.out.println("Before the If statement");

        // if today is Monday, print "Damn, the week is just beginning"
        if ("Monday".equals(input)) {
            System.out.println("Damn, the week is just beginning");
        }

        // print "After the If statement"
        System.out.println("After the If statement");
        
    }
}

