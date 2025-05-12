package assignments;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
    System.out.println("enter the string:");
    
    
    String str=sc.next();
    String org_str=str;
    
    String rev="";
    
	int len=str.length();
	
	for(int i=len-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	if(org_str.equals(rev))
			{
		    System.out.println(org_str+" is palindrome string");
		    
			}
	else
	{
		 System.out.println(org_str+" is palindrome string");
	}
		
	
}
}


	}

}
