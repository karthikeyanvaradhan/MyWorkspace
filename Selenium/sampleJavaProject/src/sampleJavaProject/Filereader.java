package sampleJavaProject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import org.apache.commons.io.IOUtils;

public class Filereader {

	public void fileReader() throws IOException {

		/*
		 * File f = new
		 * File(Filereader.class.getProtectionDomain().getCodeSource().
		 * getLocation().getPath()); System.out.println(f); // String path =
		 * System.getProperty("user.dir"); //
		 * System.out.println(System.getProperty("user.dir")); // File fl = new
		 * File(path+"\")
		 * 
		 * /*System.out.println(ClassLoader.class.getCanonicalName().getClass().
		 * getClassLoader().getSystemResource(""));
		 * System.out.println(ClassLoader.class.getClassLoader().
		 * getSystemResource(""));
		 * System.out.println(Filereader.class.getResource(""));
		 */
		/*
		 * System.out.println(ClassLoader.class.getName());
		 * System.out.println(ClassLoader.class.getSimpleName());
		 * System.out.println(ClassLoader.class.getCanonicalName());
		 */

		// File resourceparth =
		// ClassLoader.class.getClassLoader().getSystemResource("");

		
		InputStream stream = getClass().getClassLoader().getResourceAsStream("testdata.txt");
        System.out.println(stream != null);
        
        //BufferedReader bufferedFileReader =  new BufferedReader();
        
        
        StringWriter writer = new StringWriter();
        IOUtils.copy(stream, writer);
        System.out.println(writer.toString());
        System.out.println(writer.toString().length());
		
	}

	public static void main(String[] args) throws IOException {

		Filereader flr = new Filereader();
		flr.fileReader();

	}

}