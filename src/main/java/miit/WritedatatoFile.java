package miit;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritedatatoFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			String content = "this is the content i want to add into the file";
			File f = new File("C:\\Users\\Devan\\eclipse-workspace\\maven1\\src\\main\\java\\miit\\Wtiteintofile.txt");
			FileWriter fw = new FileWriter(f);
			fw.write(content);
			fw.flush();

		} catch (IOException e) {
			System.out.println(e.getMessage());

		}
		System.out.println("exception is handled");

	}
}
