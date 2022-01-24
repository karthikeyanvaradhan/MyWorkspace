package ceiTrainingClass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.testng.annotations.Test;

import freemarker.template.Configuration;
import freemarker.template.Template;

@Test
public class HtmlWriterPgm {

	private static final Logger LOGGER = Logger.getLogger(HtmlWriterPgm.class.getName());

	ClassLoader classLoader = null;

	Writer fileWriter = null;
	String title = "Marksheet of Students";

	public void docReader() throws IOException {

		try {

			classLoader = getClass().getClassLoader();

			File file = new File(classLoader.getResource("resource/inputData.txt").getFile());

			FileReader fileReader = new FileReader(file);

			BufferedReader bufferReader = new BufferedReader(fileReader);

			String textReader = bufferReader.readLine();

			Map<String, Object> stdInfo = new HashMap<String, Object>();

			List<GetterSetterHtml> getterSetterHtmllist = new ArrayList<GetterSetterHtml>();
			GetterSetterHtml getterSetterHtml = null;

			while (textReader != null) {

				String text = textReader.replaceAll(",", " ");
				String[] text1 = text.split(" ");
				System.out.println(text1.length);

				// System.out.println(text);

				// for (int i = 0; i < text1.length; i++) {

				int i = 0;

				int total = Integer.parseInt(text1[i + 3]) + Integer.parseInt(text1[i + 4])
						+ Integer.parseInt(text1[i + 5]) + Integer.parseInt(text1[i + 6])
						+ Integer.parseInt(text1[i + 7]);

				getterSetterHtml = new GetterSetterHtml(text1[i], text1[i + 1], text1[i + 2],
						Integer.parseInt(text1[i + 3]), Integer.parseInt(text1[i + 4]), Integer.parseInt(text1[i + 5]),
						Integer.parseInt(text1[i + 6]), Integer.parseInt(text1[i + 7]), total);
				getterSetterHtmllist.add(getterSetterHtml);

				LOGGER.info(textReader);
				// break;

				textReader = bufferReader.readLine();

			}
			stdInfo.put("students", getterSetterHtmllist);

			// Object object = stdInfo.get("students");

			stdInfo.put("title", title);

			Configuration cfg = new Configuration();

			// Where do we load the templates from:
			// cfg.setClassForTemplateLoading(this.getClass(), "/");

			cfg.setDirectoryForTemplateLoading(
					new File("C:\\Users\\vkarthikeyan\\workspace\\ceiTrainingClass\\src\\resource"));

			/*
			 * "C:\\Users\\vkarthikeyan\\workspace\\ceiTrainingClass\\src\\resource"
			 * ));
			 */
			// Some other recommended settings:
			/*
			 * cfg.setIncompatibleImprovements(new Version(2, 3, 20));
			 * cfg.setDefaultEncoding("UTF-8"); cfg.setLocale(Locale.US);
			 * cfg.setTemplateExceptionHandler(TemplateExceptionHandler.
			 * RETHROW_HANDLER);
			 */

			Template template = cfg.getTemplate("htmlTemplate.ftl");

			// 2.3. Generate the output

			// Write output to the console
			Writer consoleWriter = new OutputStreamWriter(System.out);
			template.process(stdInfo, consoleWriter);

			// For the sake of example, also write output into a file:
			fileWriter = new FileWriter(new File("output.html"));

			template.process(stdInfo, fileWriter);

			bufferReader.close();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {

			fileWriter.close();

		}
	}
}