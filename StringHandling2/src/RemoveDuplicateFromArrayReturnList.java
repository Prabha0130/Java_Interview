import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromArrayReturnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ar[]= {"nirmala","prabha","dinosur","nirmala"};
		//Set<String> s=new HashSet<String>();
		List<String> list=new ArrayList<String>(); 
		for(int i=0;i<ar.length;i++)
			list.add(ar[i]);
		
		for(int i=0;i<list.size();i++){
			//s.add(ar[i]);
			String temp= list.get(i);
			
			for(int j=i+1;j<list.size();j++){
				if(list.get(j).equals(temp))
					list.remove(j);
				
			}
		}
		//System.out.println(s);
		//s.forEach(str->list.add(str));
		
		System.out.println(list);
		
		

	}

}
