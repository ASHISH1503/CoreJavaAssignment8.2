import java.util.Scanner;
class NegativeAge {

	static void validate(int age)throws NegativeAgeException{  
	     if(age<0)  
	      throw new NegativeAgeException("not valid");  
	     else  
	      System.out.println("Valid Age");  
	   }  
	     
	   public static void main(String args[]){  
		   
		   Scanner input = new Scanner(System.in);
	        System.out.println("Enter the numbers to be added:");
	        int age = input.nextInt();
	      try{  
	      validate(age);  
	      }catch(Exception m){System.out.println("Exception occured: "+m);}  
	  
	      System.out.println("rest of the code...");  
	  }  
	} 
