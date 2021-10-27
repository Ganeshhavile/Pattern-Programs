package Pattern;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=5;
       for (int i=1;i<=n;i++) {
    	   char ch='a';
    	   for (int j=1;j<=n;j++) {
    		  if (i>=j) {
    			  System.out.print(ch++);
    			  System.out.print(" ");
    		  }
    	   }
    	   System.out.println();
       }
	}

}
