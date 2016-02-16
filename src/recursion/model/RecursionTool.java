package recursion.model;

public class RecursionTool
{
	public double fibonacciNumber(double position)
	{
		//bounds
		if( position < 0)
		{
			return Integer.MIN_VALUE;
		}
		//base case
		if(position == 0 || position  == 1)
		{
			return 1.0;
		}
		//recursive
		else
		{
			return fibonacciNumber(position - 1) + fibonacciNumber(position -2);
		}
		
		
	}
	
 public double factNumber(double position)
{
	if( position < 0)
	{
		return Integer.MIN_VALUE;
	}
	
	if(position == 0)
	{
		return 1;
	}
	else
	{
		return position * factNumber(position - 1);
	}
}


}

