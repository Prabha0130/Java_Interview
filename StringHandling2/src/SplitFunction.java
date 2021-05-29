
public class SplitFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Prabhakaran purushothaman";
		String[] a = new String[10];

		a = str.split(" ");
		System.out.println(a.length);
		
		for(int i= a.length-1;i>=0;i--)
			System.out.print(a[i].toUpperCase()+ " ");
	}

}
