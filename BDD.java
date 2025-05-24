public class Reverse_String 
{
// vijayalaxmi
	
	public static void main(String[] args) 
	{
	 String str = "vijayalaxmi";
	 String rev = "";
	 char ch ;
	 
	 for(int i=0; i<str.length(); i++)
	 {
		 ch = str.charAt(i);
		 System.out.println(ch);
		 
		rev = ch + rev;
		 
	 }
	 System.out.println("============================================");
	System.out.println(rev);
	}
	
}
