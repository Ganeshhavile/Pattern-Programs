package Pattern;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int star=1;
		int spaces =6;
       for (int i=1;i<=10;i++) {
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
       
        
     
       
	}

}
