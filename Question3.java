class Question3
{
	public static boolean Love6(int a, int b)
	{
		boolean res=true;
		if (a==6 || b==6) 
		{
			res=true;
		}
		else if ((a+b)==6 || (a-b)==6 || (b-a)==6) 
		{
			res= true;
		}
		else
			res=false;

		return res;
	}
	public static void main(String[] args) 
	{
		boolean ans;
		ans=Love6(1,5);
		System.out.println(ans);
	}
}