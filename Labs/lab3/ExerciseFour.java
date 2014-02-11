/** 
* Excercise Four
* Lab Three
**/

import java.util.Scanner;

public class ExerciseFour {

    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);

        int gradeCounter; // number of grades
        int totalGrades; // sum of grades
        int grade; // user input grade
        int average; // average grade

        totalGrades = 0; // set total to 0
        gradeCounter = 1; // set grade counter to 1
        
        while ( gradeCounter <= 10 ) { // loop 10 times
            System.out.print( "Enter grade: " ); //prompt
            grade = input.nextInt(); // input next grade
            totalGrades = totalGrades + grade; // add grade to total
            gradeCounter = gradeCounter + 1; //increment counter by 1
            } // end while

            average = totalGrades / 10; // integer division

            // display total and average of grades
            System.out.printf( "\nTotal of all 10 grades is %d\n", totalGrades );
            System.out.printf( "Class average is %d\n", average );
        
    } // end main
} // end class ExerciseFour
