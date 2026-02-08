
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main{
	public static void main(String[] args) throws FileNotFoundException{

     readFile("SUE.txt");
	}


	public static void readFile(String filename) throws FileNotFoundException {

		FileReader reader = new FileReader(filename);
	}
}
// this is an compile time exception so throws work