import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class dataAnalyzer {
	static double data[];
	
	
	public static double[] readFile(String filename) throws IOException{
		File inFile = new File(filename);
		try(Scanner in = new Scanner(inFile)){
			readData(in);
			return data;
			
			}
		}
	
	private static void readData(Scanner in) throws BadDataException{
		if(!in.hasNextInt()) {
			throw new BadDataException("Length expected");
		}
		int numberOfValues = in.nextInt();
		//System.out.println(numberOfValues);
		data = new double[numberOfValues];
		
		for(int i = 0; i < numberOfValues; i++) {
			readValue(in,i);
		}
		
		if(in.hasNext()) {
			throw new BadDataException("End of file expected");
		}
	}
	
	public static void readValue(Scanner in, int i) throws BadDataException{
		if(!in.hasNextDouble()) {
			throw new BadDataException("Data value expected");
		}
		data[i] = in.nextDouble();
	}
	
	public static void main(String[] args) throws IOException {
		readFile("float.txt");
		System.out.println(Arrays.toString(data));
	}
	

}
