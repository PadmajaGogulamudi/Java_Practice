package fileIOoperations;

import java.io.File;
import java.io.IOException;

public class FileIOdemo1 {

	public static void main(String[] args) throws IOException {
		/* canRead(),canWrite(),canExecute()  boolean return type file permissions
		 * to modify prmissions : boolean setReadable(boolean readable) */
		File f = new File("C:\\Users\\padma\\Documents\\VyshwaSir\\FileIODemoFolder");
		f.mkdir();// creates the folder make the directory
		File f1 = new File(f, "ThirdFile.txt");// parent file object,file name to be created
		boolean isCreated = false;
		// in real time by using port numbers we will create files in another systems.
		if (!(f1.exists()))
			isCreated = f1.createNewFile();// boolean return type
		if (isCreated)
			System.out.println("file created successfully");

		// exists() boolean return type
		else
			System.out.println("already created");
		File f2 = new File(f, "innerFolder");

		System.out.println(f2.mkdir() ? "innerfolder created successfully" : "already existed folder");

		// count of files in a given folder and print the names.

		// list() returns the array of Strings.
		String[] fileNames = f.list();
		System.out.println("*************************");
		for (String name : fileNames) {
			System.out.println(name);
		}
		System.out.println("*************************");
		System.out.println("total space in bytes: " + f.getTotalSpace());
		System.out.println("free space  in bytes: " + f.getFreeSpace());
		System.out.println("absoute path of given file : " + f.getAbsolutePath());
		System.out.println("canonical path of given file : " + f.getCanonicalPath());

		System.out.println("*************************");
		File[] AllFiles = f.listFiles();// get files with paths
		for (File i : AllFiles) {
			System.out.println(i);
		}
		System.out.println("*************************");

		System.out.println("main method ending.");

	}

}
