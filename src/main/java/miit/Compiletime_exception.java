package miit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Compiletime_exception {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try {
		File f = new File("C:\\Users\\Devan\\eclipse-workspace\\maven1\\src\\main\\java\\miit\\non_exit_file.txt");
		FileReader fr = new FileReader(f);
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	
		finally {
		System.out.println("this is always execute");
	}
		System.out.println("exception is not handled");
		
	}

	
}
