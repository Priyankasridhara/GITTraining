class Ovwels
{
	public static void main(String[] args) 
	{
		String str = "mutyala nani";
		String rev = "";
		String ovw = "aeiou";

		char[] ch1 = str.toCharArray();
		char[] ch2 = ovw.toCharArray();

		//System.out.println(ch[0]);

		for(int i=0; i<ch1.length; i++){

			if(ch1[i] != ch2[0] && ch1[i] != ch2[1] && ch1[i] != ch2[2] && ch1[i] != ch2[3] && ch1[i] != ch2[4]){
			
				rev = rev+ch1[i];
	
			}
		}
		System.out.println(rev);
	}
	
}
