import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CountTheNumberOfWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Count of word in a string.

		String str = "Worls is  so  big";
		String split[] = str.split(" ");
		List<String> counterList=new ArrayList<String>();

		//System.out.println(split.length);
		for (int i = 0; i < split.length; i++) {
			String temp = split[i].trim();

			if (!temp.isEmpty()) {
			counterList.add(temp);

			}
		}
		
		System.out.println(counterList.size());

	}

}

