
public class TrimAllSpaceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=" A Word with space ";
		System.out.println(str.trim());
		String ar[]=str.split(" ");
		
		for(int i=0;i<ar.length;i++){
		System.out.print(ar[i]);
		}
	}

}
