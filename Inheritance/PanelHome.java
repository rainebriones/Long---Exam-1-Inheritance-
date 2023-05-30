package Portfolio2;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelHome extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelHome() {

		setBackground(new Color(192, 192, 192));
		setBounds(196, 90, 1084, 628);
		setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(250, 250, 250));
		mainPanel.setBounds(0, 0, 1280, 732);
		add(mainPanel);
		mainPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hi, my name is");
		lblNewLabel.setFont(new Font("Arial Black", Font.ITALIC, 45));
		lblNewLabel.setBounds(208, 256, 405, 124);
		mainPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Rychelle.");
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setForeground(new Color(255, 128, 192));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 60));
		lblNewLabel_1.setBounds(577, 233, 422, 158);
		mainPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("__________");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 60));
		lblNewLabel_2.setBounds(577, 272, 348, 116);
		mainPanel.add(lblNewLabel_2);
		
		JLabel lblImA = new JLabel("I'm a");
		lblImA.setFont(new Font("Arial Black", Font.ITALIC, 45));
		lblImA.setBounds(128, 359, 154, 124);
		mainPanel.add(lblImA);
		
		JLabel lblNewLabel_1_1 = new JLabel("BS-Information Technology student.");
		lblNewLabel_1_1.setForeground(new Color(255, 128, 192));
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel_1_1.setBackground(Color.BLACK);
		lblNewLabel_1_1.setBounds(264, 344, 828, 158);
		mainPanel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("______________________");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 60));
		lblNewLabel_2_1.setBounds(265, 372, 734, 116);
		mainPanel.add(lblNewLabel_2_1);

	}
}
