import java.io.*;
import java.util.*;

public class CountWords {
	public int getTotalNumberOfWords(String str) {
		return str.split(" ").length;
	}

	public int getTotalNumberOfUniqueWords(String str) {
		HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
	}
}
