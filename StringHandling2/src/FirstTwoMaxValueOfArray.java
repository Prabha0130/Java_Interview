
public class FirstTwoMaxValueOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]={"abs","odds","wrong","Prabha","Arulprakash"};
		String temp1=str[0];
		String temp2=null;
		System.out.println(str.length);
		for(int i=1;i<str.length;i++){
			if(str[i].length()>temp1.length()){
				temp2=temp1;
				temp1=str[i];
				
			}
		}
		
		System.out.println("First largest value of array :"+temp1);
		System.out.println("Second larget value of array :"+temp2);
	}

}
