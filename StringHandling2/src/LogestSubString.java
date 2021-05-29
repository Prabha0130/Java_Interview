
public class LogestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Nirmala Nirul Nimmi dinosur";
		System.out.println("Maximum SubString of String " + MaximunString(name));

	}

	public static String MaximunString(String name) {
		String listName[] = name.split(" ");
		String Maximum = listName[0];
		int count=0;

		for (int i = 0; i < listName.length; i++) {
			String temp = listName[i];
			System.out.println("temp"+temp);
			//System.out.println(count);
			
			for (int j = 0; j < temp.length(); j++) {
				for(int k=i+1;k<temp.length();k++){
				if (temp.charAt(j) == temp.charAt(k)&&j!=k) {
					count++;

				}
			}}
			if (temp.length() > Maximum.length()&&count==0) {
				Maximum = listName[i];

			}
			
				count=0;

			
		}
		return Maximum;
	}

}
