package recursion.controller;

import recursion.model.*;
import recursion.view.*;

public class Controller
{
	private RecursionFrame baseFrame;
	private RecursionTool mathTool;
	private String calculatedValue;

	public Controller()
	{
		mathTool = new RecursionTool();
		baseFrame = new RecursionFrame(this);
		calculatedValue = "";
	}

	public void start()
	{
		
	}

	public String doFib(String input)
	{
		calculatedValue = "The Fibonaci sequence at "
				+ input
				+ " is "
				+ Double.toString(mathTool.fibonacciNumber(Double
						.parseDouble(input)));

		return calculatedValue;

	}
	public String doFact(String input)
	{
		calculatedValue = input + "! is "
				+ Double.toString(mathTool.factNumber(Double.parseDouble(input)));
		return calculatedValue;
	}
}
