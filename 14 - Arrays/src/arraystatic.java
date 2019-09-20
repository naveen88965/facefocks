import java.util.Scanner;
public class arraystatic {
	    public static void main(String[] args) {
	         System.out.print("Enter the array size");
	         Scanner obj=new Scanner(System.in);
	         int n=obj.nextInt();
	    	
	         
	         int[] values=new int [n];
	    	        
	     
	         
	        values[2] = 10;
	        values[3] = 20;
	        values[4] = 30;
	        values[5]=  45;
	        values[8]=  50;
	        System.out.println(values[2]);
	        System.out.println(values[3]);
	        System.out.println(values[4]);
	        System.out.println(values[5]);
	        System.out.println(values[8]);
	   obj.close();
	    }
}
