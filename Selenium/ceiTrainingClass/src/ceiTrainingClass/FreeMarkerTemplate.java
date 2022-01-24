package ceiTrainingClass;
	import java.io.File;
	import java.io.IOException;
	import java.io.OutputStreamWriter;
	import java.io.Writer;
	import java.util.HashMap;
	import java.util.Map;

	import freemarker.template.Configuration;
	import freemarker.template.Template;
	import freemarker.template.TemplateException;

	public class FreeMarkerTemplate {
		
		
		public static void main(String[] args) {
			Configuration config = new Configuration();
			try {
				//Directory to which the template is available
				config.setDirectoryForTemplateLoading(new File("C:\\Users\\vkarthikeyan\\workspace\\ceiTrainingClass\\src\\resource"));
				//tempalte name
				Template template = config.getTemplate("test.ftl");
				//data
				Map<String, String> data = new HashMap<String, String>();
				data.put("name", "kathir");
				data.put("header", "Welcom to freemarker");
				data.put("integer", "80");
				//Console writer
				Writer consoleWriter = new OutputStreamWriter(System.out);
				template.process(data, consoleWriter);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (TemplateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

