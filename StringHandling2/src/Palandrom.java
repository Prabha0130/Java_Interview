
public class Palandrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String number="915190";
		StringBuffer n=new StringBuffer(number);
		String reverseNum=n.reverse().toString();
		
		if(number.equals(reverseNum))
		{
			System.out.println(number+" is a palindrom as "+reverseNum);
		}
		else
		{
			System.out.println(number+" is not a palindrom as "+reverseNum);

		}
	}

}
