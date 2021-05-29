import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FindLongestSubStringWithOutDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "Nirmala is a beautifull girl Nirmala";
		String subStr[]=str.split(" ");
		int count = 0;
		System.out.println(count);
		System.out.println(subStr.length);

		for(int i=0;i<subStr.length;i++)
		{
			String temp= subStr[i];
			System.out.println(temp);
			for(int j=1;j<temp.length();j++){
				if(temp.charAt(0)==temp.charAt(j)){
					count++;
				}System.out.println("count afte for"+count);
				if(count>0){
					System.out.println(temp+ " has dupicate value");
				}count=0;

				
			
			}
		}

	}

}
