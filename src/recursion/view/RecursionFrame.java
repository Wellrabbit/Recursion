package recursion.view;
import javax.swing.*;
import recursion.controller.Controller;

public class RecursionFrame extends JFrame
{
	private Controller baseController;
	private RecursionPanel basePanel;
	public RecursionFrame (Controller baseController)
	{
		this.baseController = baseController;
		basePanel = new RecursionPanel(baseController);
		setFrame();
	}
	private void setFrame()
	{
		this.setContentPane(basePanel);
		 this.setTitle("Recursion");
		 this.setResizable(false);
		 this.setSize(600,600);
		 this.setVisible(true);

	}
	
}
