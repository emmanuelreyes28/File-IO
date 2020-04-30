import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class textFiles {
	
	public static void main(String args[]) throws IOException {
		
		/*
		 * Reading from a text file 
		 */
		//construct a file object representing the input file 
		File inputFile = new File("test.txt");

		
		//Construct a scanner object 
		Scanner in = new Scanner(inputFile);
		//in.useDelimiter("");
	
		while(in.hasNext()) {
			//in.useDelimiter("i");
			//String input = in.next();
			System.out.println(in.next());
			
			//char ch = in.next().charAt(0);
			//System.out.println(ch);
		}
		
		System.out.println("-------------------------------------");
	
		
		/*
		 * Writing to a file 
		 */
		double total = 10.235;
		PrintWriter out = new PrintWriter("output.txt");
		out.println("hello, world");
		out.printf("Total: %-8.2f\n", total);
		out.close();
		
		File newFile = new File("test.txt");
		Scanner input = new Scanner(newFile);
		//String line = input.nextLine();
		int i = 0;
		//String line = input.nextLine();
		
		String line = null;
		while(input.hasNextLine()) {
			line = input.nextLine();
			System.out.println(line);
		}
		while(!Character.isDigit(line.charAt(i))) {
			i++;
		}
		String countryName = line.substring(0,i);
		String population = line.substring(i);
		countryName = countryName.trim(); //removes any leading or trailing white spaces 

		System.out.println(countryName);
		System.out.println(population);
		
		//Occasionally easier to construct a new Scanner object to read the characters 
		//from a string 
		
		Scanner lineScanner = new Scanner(line);
		
		String countryName1 = lineScanner.next();
		while(!lineScanner.hasNextInt()) {
			countryName1 = countryName1 + "" + lineScanner.next();
		}
		
		//int populationValue = lineScanner.nextInt();
		int populationValue = Integer.parseInt(population.trim()); 
		
		System.out.println(countryName1);
		System.out.println(populationValue);
		System.out.println();
		try {
			String fileName = "test.txt";
			Scanner s = new Scanner(new File(fileName));
			String it = s.next();
			while(s.hasNext()) {
				System.out.println(s.next());
			}
			//int value = Integer.parseInt(it);
		}
		catch(FileNotFoundException exception){
			System.out.println("File not found");
		}
		catch(IOException exception){
			exception.printStackTrace();
		}
		in.close();
		input.close();
		lineScanner.close();
		
	} 

	
	
	

}
