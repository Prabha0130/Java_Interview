import java.text.DecimalFormat;

public class RoundOffFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String actualValue="15.38";
		int a=2;
		int b=13;
		if(a%b==0){
			//System.out.println(true);
			int c=(a/b)*100;
			System.out.println(c);
			
		}
		else{
			
			double c= ((double)a/(double)b)*100;	
			DecimalFormat f=new DecimalFormat("##.00");
		     System.out.println(f.format(c));
		}
		
		
		
		

	}

}
