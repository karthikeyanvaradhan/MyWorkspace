package sampleJavaProject;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

import org.testng.annotations.Test;

public class LastModifiedItem {

	@Test

	public LastModifiedItem() {

		File Item = new File("C:\\Users\\vkarthikeyan\\Desktop\\FHLB\\DesMoines");

		File[] downloadedFiles = Item.listFiles();

		Arrays.sort(downloadedFiles, new Comparator<File>() {
			@Override
			public int compare(File fileOne, File fileTwo) {
				return Long.valueOf(fileOne.lastModified()).compareTo(fileTwo.lastModified());
			}
		});

		for (File file : downloadedFiles) {
			if (file.isFile()) {
				// upload file
			}
		}

	}

}
/*
 * long fileName = Item.lastModified(); String time = timeFormatter(fileName);
 * System.out.println("The File which was Modified at last is" + fileName +
 * "and Time which File was Altered is" + time);
 * 
 * 
 * System.out.println("Before Format : " + Item.lastModified());
 * 
 * SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
 * 
 * System.out.println("After Format : " + sdf.format(Item.lastModified()));
 * 
 * System.out.println("File Name which was updated: " + Item.getName());
 * Item.getAbsolutePath().
 * 
 * }
 * 
 * public static String timeFormatter(long listOfItems) {
 * 
 * SimpleDateFormat sdf = new SimpleDateFormat("YYYY:MM:DD HH:MM:SS");
 * 
 * return sdf.format(new Date(listOfItems));
 * 
 * }
 * 
 * 
 * 
 * 
 * }
 */