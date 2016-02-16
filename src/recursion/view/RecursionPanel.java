package recursion.view;

import javax.swing.*;
import java.awt.event.*;

import recursion.controller.Controller;

public class RecursionPanel extends JPanel
{
	private Controller baseController;
	private JButton fibonacciButton;
	private JButton factorialButton;
	private JTextField inputField;
	private JTextArea resultsArea;
	private SpringLayout baseLayout;

	public RecursionPanel(Controller baseController)
	{
		this.baseController = baseController;
		fibonacciButton = new JButton("Calculate the Fib Number");
		factorialButton = new JButton("N!");
		baseLayout = new SpringLayout();
		inputField = new JTextField(5);
		resultsArea = new JTextArea(10, 15);
		setupPanel();
		setupLayout();
		setupListeners();

	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(fibonacciButton);
		this.add(factorialButton);
		this.add(inputField);
		this.add(resultsArea);
		resultsArea.setWrapStyleWord(true);
		resultsArea.setLineWrap(true);
		resultsArea.setEditable(false);

	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, factorialButton, 0, SpringLayout.NORTH, fibonacciButton);
		baseLayout.putConstraint(SpringLayout.EAST, factorialButton, -101, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, fibonacciButton, 35, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, fibonacciButton, -41, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, inputField, -216, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 30, SpringLayout.SOUTH, resultsArea);
		baseLayout.putConstraint(SpringLayout.NORTH, resultsArea, 35, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, resultsArea, -381, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, resultsArea, -136, SpringLayout.EAST, this);
	}

	private void setupListeners()
	{
		fibonacciButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String input = inputField.getText();
				if (checkInput(input))
				{
					resultsArea.setText(baseController.doFib(input));
				}
			}
		});
		factorialButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String input = inputField.getText();
				if (checkInput(input))
				{
					resultsArea.setText(baseController.doFact(input));
				}
			}
		});
	}

	private boolean checkInput(String input)
	{
		boolean isNumber = false;

		try
		{
			Double.parseDouble(input);
			isNumber = true;

		} catch (Exception numberException)
		{
			resultsArea.setText("Please enter number");
		}
		return isNumber;
	}
}
