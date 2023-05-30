package Portfolio2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelContact extends JPanel  {
	
	private ImageIcon facebook = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets\\facebook (1).png")
					.getImage().getScaledInstance(97, 94, Image.SCALE_DEFAULT));
	private ImageIcon instagram = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets\\instagram (1).png")
					.getImage().getScaledInstance(97, 94, Image.SCALE_DEFAULT));
	private ImageIcon telephone = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets\\contact-us.png")
					.getImage().getScaledInstance(97, 94, Image.SCALE_DEFAULT));
	/**
	 * Create the panel.
	 */
	public PanelContact() {
		setBackground(new Color(192, 192, 192));
		setBounds(196, 90, 1084, 628);
		setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(255, 255, 255));
		mainPanel.setBounds(0, 0, 1280, 732);
		add(mainPanel);
		mainPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Contact");
		lblNewLabel.setForeground(new Color(255, 128, 192));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(454, 81, 111, 94);
		mainPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("_________");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(457, 86, 111, 94);
		mainPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(facebook);
		lblNewLabel_2.setBounds(31, 179, 97, 94);
		mainPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(instagram);
		lblNewLabel_2_1.setBounds(31, 311, 97, 94);
		mainPanel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(telephone);
		lblNewLabel_2_2.setBounds(583, 311, 97, 94);
		mainPanel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setIcon(telephone);
		lblNewLabel_2_3.setBounds(583, 179, 97, 94);
		mainPanel.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3 = new JLabel("bossraine07");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 41));
		lblNewLabel_3.setBounds(138, 202, 304, 51);
		mainPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("raine_briones");
		lblNewLabel_3_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 41));
		lblNewLabel_3_1.setBounds(138, 326, 328, 51);
		mainPanel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("09560867528");
		lblNewLabel_3_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 41));
		lblNewLabel_3_1_1.setBounds(690, 199, 328, 51);
		mainPanel.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("09618362921");
		lblNewLabel_3_1_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 41));
		lblNewLabel_3_1_1_1.setBounds(690, 326, 328, 51);
		mainPanel.add(lblNewLabel_3_1_1_1);

	}
}