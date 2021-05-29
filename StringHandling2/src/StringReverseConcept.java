import java.security.PublicKey;

public class StringReverseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Prabhakaran Purushothaman";
		System.out.println(StringReverseCharAt(str));
		System.out.println(StringReverseBuffer(str));

	}
	
	public static String StringReverseCharAt(String str){
		
		int length=str.length();
		String temp="";
		for(int i=length-1;i>=0;i--){
			temp=temp.concat(String.valueOf(str.charAt(i)));
		}
		return temp;
	}
	
	
	public static StringBuffer StringReverseBuffer(String str){
		StringBuffer buf=new StringBuffer(str);
		return buf.reverse();
	}

}
