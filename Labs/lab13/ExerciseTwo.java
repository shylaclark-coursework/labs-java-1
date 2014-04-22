import java.util.*;
import java.io.*;

public class ExerciseTwo {
	
	public static void main( String[] args) throws Exception {
		
		String string1 = "This is a test string";
		System.out.println( string1);
		stringModifier( string1);
		System.out.println( string1);
		
		StringBuilder awesome = new StringBuilder( string1);
		System.out.println( awesome);
		stringModifier( awesome);
		System.out.println( awesome);
	}
	
	public static void stringModifier( String string1) {
		String string2 = " that has been modified.";
		System.out.println( string1.concat(string2));
	}
	
	public static void stringModifier( StringBuilder awesome) {
		String string2 = " that has been modified with StringBuilder";
		System.out.println( awesome.append(string2));
	}
	
}
	