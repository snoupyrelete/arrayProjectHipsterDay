package array.view;

import javax.swing.*;
import array.controller.ArrayController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HipsterPanel extends JPanel
{
	private SpringLayout baseLayout;
	private JComboBox<?> dropDown;
	private JLabel infoLabel;
	private JButton myButton;
	private ArrayController baseController;
	
	public HipsterPanel(ArrayController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.myButton = new JButton("Click me");
		this.infoLabel = new JLabel("WOW words!");
		this.dropDown = new JComboBox(baseController.getHipsters());
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.ORANGE);
		this.setLayout(baseLayout);
		this.add(dropDown);
		this.add(infoLabel);
		this.add(myButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, myButton, 85, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, myButton, 140, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, dropDown, 14, SpringLayout.SOUTH, myButton);
		baseLayout.putConstraint(SpringLayout.WEST, dropDown, 161, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, infoLabel, 0, SpringLayout.WEST, myButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, infoLabel, -21, SpringLayout.NORTH, myButton);
	}
	
	private void setupListeners()
	{
		dropDown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				// toString() of the selected Hipster
				infoLabel.setText(dropDown.getSelectedItem().toString());
			}
		});
		
		myButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				// toString() of the selected Hipster
				baseController.impactHipsters();
				repaint();
			}
		});
	}
}
