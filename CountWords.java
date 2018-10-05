import java.io.*;
import java.util.*;

public class CountWords {
	public int getTotalNumberOfWords(String str) {
		// parse the text
		String text = parseBookIntoString();
		// return the length of the string array after spliting by whitespace
		return str.split(" ").length;
	}

	public int getTotalNumberOfUniqueWords(String str) {
		// parse the text
		String text = parseBookIntoString();
		// store all words into a String array
		String[] words = text.split(" ");
		// create a hashmap with the words as both  key and value
		HashMap<String, String> wordMap = new HashMap<String, String>();
		int numberOfUniqueWords = 0;
		// iterate through the words array and remove the punctuation
		// before adding to the hashmap



		// return the count of keys

		return numberOfUniqueWords;

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
