package Pattern;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int star=1;
		int spaces =4;
       for (int i=1;i<=5;i++) {
    	   for (int j=1;j<=spaces;j++) {
    		   System.out.print(" ");
    	   }
    	   for (int k=1;k<=star;k++) {
    		   System.out.print("*");
    	   }
    	   
    	   System.out.println();
    	   star=star+2;
	       spaces--;
	}
       star =7;
       spaces=1;
       for (int i=1;i<=6;i++) {
    	   for (int j=1;j<=spaces;j++) {
    		   System.out.print(" ");   
    	   }
    	   for (int k=1;k<=star;k++) {
    		   System.out.print("*");
    	   }
    	   System.out.println();
    	   star--;
    	   star--;
    	   spaces++;
       }
}
	}
