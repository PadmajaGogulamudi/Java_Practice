package fileIOoperations;

import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		// File f = new
		// File("C:\\Users\\padma\\Documents\\VyshwaSir\\FileIODemoFolder\\demo.txt");
//		PrintWriter pw=new PrintWriter("C:\\Users\\padma\\Documents\\VyshwaSir\\FileIODemoFolder\\demo.txt");
//		pw.print(false);
//		pw.println(100);
//		pw.print("hello world");
//		pw.flush();
//		pw.print(false);
//		pw.println(100);
//		pw.print("hello world");
//		pw.flush();
		FileWriter fw = new FileWriter("C:\\Users\\padma\\Documents\\VyshwaSir\\FileIODemoFolder\\demo.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("hello world");
		bw.write(120);
		bw.flush();

		

	}

}
