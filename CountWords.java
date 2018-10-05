import java.io.*;
import java.util.*;

public class CountWords {
	public int getTotalNumberOfWords(String str) {
		String text = parseBookIntoString();
		return str.split(" ").length;
	}

	public int getTotalNumberOfUniqueWords(String str) {
		HashMap<String, Integer> wordMap = new HashMap<String, Integer>();

	}

	public static String parseBookIntoString() {
		BufferedReader br = null;

		String text = "";

		try {
			br = new BufferedReader(new FileReader("/path/to/text/file"));

			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while( line != null) {
				sb.append(line);
				sb.append(System.lineSeperator());
				line = br.readLine();
			}
			text = sb.toString();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}

		return text;
	}

}
