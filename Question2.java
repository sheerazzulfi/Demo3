class Question2
{
	public static int trti(int a, boolean s)
	{
		int ret=0;
		if (s==true) 
		{
			if (a<=65) 
			{
				ret= 0;
			}
			else if (66<a || a<86) 
			{
				ret= 1;
			}

			else
				ret= 2;
		}

		else if (s==false) 
		{
			if (a<=60) 
			{
				ret= 0;
				
			}
			
			else if (61<=a && a<=80) 
			{
				ret= 1;
			}

			else
				ret= 2;
		}

		return ret;

		
	}
	public static void main(String[] args) 
	{
		int ans;
		ans=trti(65,true);
		System.out.println(ans);


	}
}
