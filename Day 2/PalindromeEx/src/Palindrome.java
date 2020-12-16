import java.util.Scanner;
public class Palindrome {
	
	int sum=0,r;
	int palindromeOrNot(int num)
	{
		if(num!=0)
		{
		r=num%10;
		sum=(sum*10)+r;
		num/=10;
		palindromeOrNot(num);
	    }
	    return sum;
	}

	public static void main(String[] args) {
		
		//Comparing int
	    int a,t,s;
	    Palindrome p=new Palindrome();
             	    Scanner ScannedInt=new Scanner(System.in);
	    System.out.print("Enter a number :");
                   a=ScannedInt.nextInt();
	    t=a;
	    s=p.palindromeOrNot(a);
	    if(s==t)
		System.out.println("Palindrome number ");
                   else
		System.out.println("Not a Palindrome number ");
	    
	    //Comparing String
	    String str,strrev="";
	    
	    Scanner Scannedstr=new Scanner(System.in);
	    System.out.print("Enter a string :");
	    
	    str=Scannedstr.next();
	    
	    for(int i=str.length()-1;i>=0;i--) {
	    	strrev=strrev+str.charAt(i);
	    }
	    
	    System.out.println("Reverse of a string is : "+strrev);
	    if(strrev.equalsIgnoreCase(str))
	    	System.out.println("Entered string is palindrome");
	    else
	    	System.out.println("Entered string is not a palindrome number "); 
	}
}
