package com.ceitraining.classFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.testng.annotations.Test;
import org.testng.internal.junit.ArrayAsserts;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.Version;

@Test
public class HtmlWriterPgm {

	String filePath = "C:\\Users\\vkarthikeyan\\workspace\\CEI Training Class\\src\\Resource\\inputData.txt";

	public void docReader() {

		try {
			// FileInputStream fileInput = new FileInputStream(new
			// File(filePath));

			FileReader fileReader = new FileReader(filePath);

			BufferedReader bufferReader = new BufferedReader(fileReader);

			String textReader = bufferReader.readLine();

			Map<String, String> stdInfo = new HashMap<>();

			while (textReader != null) {

				String text = textReader.replaceAll(",", " ");
				String[] text1 = text.split(" ");

				// System.out.println(text);

				for (int i = 0; i < text1.length; i++) {

					System.out.println(text1[i]);

					stdInfo.put("name", text1[i]);
					stdInfo.put("id", text1[i+1]);
					stdInfo.put("description", text1[i+2]);
					stdInfo.put("language", text1[i+3]);
					stdInfo.put("english", text1[i+4]);
					stdInfo.put("commerce", text1[i+5]);
					stdInfo.put("ecnomics", text1[i+6]);
					stdInfo.put("computerscience", text1[i+7]);
					break;
				}

				/*
				 * for(String i : text1){ System.out.println(i);
				 * System.out.println("Pass");
				 * 
				 * }
				 */
				textReader = bufferReader.readLine();

				Configuration cfg = new Configuration();

				// Where do we load the templates from:
				cfg.setClassForTemplateLoading(HtmlWriterPgm.class, "C:\\Users\\vkarthikeyan\\workspace\\CEI Training Class\\src\\Resource\\htmlTemplate.ftl");

				// Some other recommended settings:
				cfg.setIncompatibleImprovements(new Version(2, 3, 20));
				cfg.setDefaultEncoding("UTF-8");
				cfg.setLocale(Locale.US);
				cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

				
				Template template = cfg.getTemplate("C:\\Users\\vkarthikeyan\\workspace\\CEI Training Class\\src\\Resource\\htmlTemplate.ftl");

		        // 2.3. Generate the output

		        // Write output to the console
		        Writer consoleWriter = new OutputStreamWriter(System.out);
		        template.process(stdInfo, consoleWriter);

		        // For the sake of example, also write output into a file:
		        Writer fileWriter = new FileWriter(new File("output.html"));
		        try {
		            template.process(stdInfo, fileWriter);
		            
		        } 
		        
		        finally {
		            
		        	fileWriter.close();
		            
		        }
				
			}
			bufferReader.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
