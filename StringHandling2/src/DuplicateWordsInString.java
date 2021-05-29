
public class DuplicateWordsInString {

	/**
	 * find the duplicate words and their number of occurrences in a string
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "happy day is like a day with happy day";

		String strSplit[] = str.split(" ");
		int count = 0;
		String Duplicate = null;
		for (int i = 0; i < strSplit.length-1; i++) {
			String temp = strSplit[i].toString();

			for (int j = i+1; j < strSplit.length; j++) {
				if (temp.equalsIgnoreCase(strSplit[j])&&i!=j) {
					count+=1;
					Duplicate = temp;
					//System.out.println("Dupliacte value="+ strSplit[j]);
					
				}	
			

			}
			if(count!=0)
			System.out.println("Duplicate Value :" + Duplicate + " Occourance:" + count);
			count = 0;
			

		}
		

	}

}
