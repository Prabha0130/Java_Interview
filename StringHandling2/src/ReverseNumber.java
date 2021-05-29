
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1234;
		String num = String.valueOf(a);
		String reverse = "";
		System.out.println(num);
		for (int i = num.length() - 1; i >= 0; i--) {
			System.out.print(num.charAt(i));

			reverse = reverse.concat(String.valueOf(num.charAt(i)));
		}
		System.out.println();
		System.out.println(reverse);
	}

}
