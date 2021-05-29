import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingListOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> li=new ArrayList<String>();
		li.add("nirmala");
		li.add("Prabha");
		li.add("arul");
		li.add("kumarae");
		//li.forEach(str-> str.toLowerCase());
		System.out.println(li);
		
		for (int i=0;i<li.size();i++) {
			String temp=li.get(i);
			if(!temp.equals(temp.toLowerCase()))
				System.out.println("inside if");
				//li.get(i).replace(temp, temp).toLowerCase();
				li.remove(i);
				li.add(i, temp.toLowerCase());
		}
		
		
		
		Collections.sort(li);
		System.out.println(li);
		Collections.sort(li,Collections.reverseOrder());
		System.out.println(li);

	

	}

}
