package miit;

import java.io.File;
import java.io.FileReader;

public class ReaddatafromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\Devan\\eclipse-workspace\\maven1\\src\\main\\java\\miit\\non_exit_file.txt");
		try {
			FileReader fr = new FileReader(f);
			int character;
			while ((character = fr.read()) != -1) {
				System.out.print((char)character);

			}
			System.out.println("");

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		System.out.println("exception is handled");
	}

}
