package array.view;

import java.awt.Dimension;

import javax.swing.*;

import array.controller.ArrayController;

public class HipsterFrame extends JFrame
{
	private HipsterPanel appPanel;
	private ArrayController baseController;
	
	public HipsterFrame(ArrayController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new HipsterPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Array window");
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
	}
}
