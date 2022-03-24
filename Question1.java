class Question1
{
	public static boolean Squir(int a, boolean s)
	{
		boolean res=false;
		if (s==true) 
		{
			if (a>60) 
			{
				res=true;
			}

			else
				res=false;

		}
		else if(s==false)
		{
			if (a<40) 
			{
				res=false;
			}
			else if(40<=a && a<=60)
			{
				res=true;

			}

		}
		return res;
	}

	public static void main(String[] args) 
	{
		boolean ans;
		ans=Squir(50,false);
		System.out.println(ans);
	}
}
