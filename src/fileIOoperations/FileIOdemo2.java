package fileIOoperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;

//read content from file to console
//FileReader read() reads char by char
public class FileIOdemo2 {

	public static void main(String[] args) throws IOException, FileNotFoundException, InterruptedException {
		File f = new File("C:\\Users\\padma\\Documents\\VyshwaSir\\FileIODemoFolder\\firstFile.txt");
		FileReader fr = new FileReader(f);// InputStreamReader lo unna methods ni use chesthundhi
		// while using createNewFile(),creating object for FileReader,using read() we
		// have to throws IOexception
		int i = fr.read();// reads the char and returns ascii value
		while (i != -1) {
			System.out.print((char) i + "");
			// Thread.sleep(1000);
			i = fr.read();
		}

		FileWriter fw = new FileWriter("C:\\Users\\padma\\Documents\\VyshwaSir\\FileIODemoFolder\\scondFile.txt", true);
		fw.write(65);// integer,string,char are only acceptable and also it considers integer as
						// String
		fw.write('B');
		fw.write('\n');
		fw.write('6');
		fw.write("hello");
		fw.write("hello world");
		fw.flush();
		// fw.close();
		// BufferedReader reads single line,introduced in 1.1
		// bufferedWriter writeLine() for next line
		// before using BufferedReader we have to create FileReader object .
		BufferedReader br = new BufferedReader(fr);// reads the Filereader not file or string ,has only two constructors
		// only advantage is BufferedReader has readLine().
		String s = br.readLine();// throws IOException
		while (s != null) {
			System.out.println(s);
			s = br.readLine();
		}

		// before using BufferedWriter we have to create object for FileWriter
		// content replace avuthundhi append avvakunda
		// append avvali ante FileWriter ki path,true ivvali
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.write('A');
		bw.write('A');
		bw.write('A');
		bw.write('A');
		// to overcome the disadvantage of BufferedWriter that it considers integer as
		// character we use PrintWriter
		PrintWriter pw = new PrintWriter(f);
		pw.print("hello");
		pw.print(true);

		pw.print(100);
		pw.print(354654165);

		pw.println(105);
		pw.flush();

		bw.flush();

		fr.close();

	}

}
