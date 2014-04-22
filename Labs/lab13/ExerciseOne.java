import java.util.*;
import java.io.*;

public class ExerciseOne {
	public static void main( String[] args) throws Exception {
		Scanner input = new Scanner( new File( "declaration.txt"));
		
		String string = input.nextLine();
		
		Formatter output = new Formatter( "sentence.txt");
		output.format( string);
		input.close();
		output.close();
	}
}