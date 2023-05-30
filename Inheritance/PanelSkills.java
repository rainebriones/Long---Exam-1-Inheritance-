package Portfolio2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelSkills extends JPanel {
	private ImageIcon pic1 = new ImageIcon(
			new ImageIcon( "D:\\Games\\eclipse\\Portolio\\src\\Assets\\html.jpg")
					.getImage().getScaledInstance(250, 265, Image.SCALE_DEFAULT));
	private ImageIcon pic2 = new ImageIcon(
			new ImageIcon( "D:\\Games\\eclipse\\Portolio\\src\\Assets\\baked.jpg")
					.getImage().getScaledInstance(250, 265, Image.SCALE_DEFAULT));
	private ImageIcon pic3 = new ImageIcon(
			new ImageIcon( "D:\\Games\\eclipse\\Portolio\\src\\Assets\\cooking.jpg")
					.getImage().getScaledInstance(250, 265, Image.SCALE_DEFAULT));
	
	
	public PanelSkills() {
		setBackground(new Color(240, 240, 240));
		setBounds(196, 90, 1084, 802);
		setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(0, 0, 1084, 819);
		add(mainPanel);
		mainPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Skills.");
		lblNewLabel_1.setBounds(10, 1, 321, 85);
		lblNewLabel_1.setForeground(new Color(255, 128, 192));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 60));
		lblNewLabel_1.setBackground(Color.BLACK);
		mainPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("_______");
		lblNewLabel_2.setBounds(1, 12, 330, 70);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 60));
		mainPanel.add(lblNewLabel_2);
		
		JPanel skills1panel = new JPanel();
		skills1panel.setBounds(25, 220, 250, 265);
		mainPanel.add(skills1panel);
		skills1panel.setLayout(null);
		
		JLabel lbl1 = new JLabel("");
		lbl1.setIcon(pic1);
		lbl1.setBounds(0, 0, 250, 265);
		skills1panel.add(lbl1);
		
		JPanel skills2panel = new JPanel();
		skills2panel.setBounds(411, 220, 250, 265);
		mainPanel.add(skills2panel);
		skills2panel.setLayout(null);
		
		JLabel lbl2 = new JLabel("");
		lbl2.setIcon(pic2);
		lbl2.setBounds(0, 0, 250, 265);
		skills2panel.add(lbl2);
		
		JPanel skills3panel = new JPanel();
		skills3panel.setBounds(795, 220, 250, 265);
		mainPanel.add(skills3panel);
		skills3panel.setLayout(null);
		
		JLabel lbl3 = new JLabel("");
		lbl3.setIcon(pic3);
		lbl3.setBounds(0, 0, 250, 265);
		skills3panel.add(lbl3);
		
		JPanel panel = new JPanel();
		panel.setBounds(202, 533, 672, 46);
		mainPanel.add(panel);
		panel.setLayout(null);
		
		JLabel notelbl = new JLabel("My mother forces me to be in IT, but my passion is to be a chef.");
		notelbl.setForeground(new Color(255, 128, 190));
		notelbl.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		notelbl.setBounds(0, -61, 672, 184);
		panel.add(notelbl);
		
		JLabel lblNewLabel_1_1 = new JLabel("HTML/CSS/PHP\r\n");
		lblNewLabel_1_1.setForeground(new Color(255, 128, 192));
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1.setBackground(Color.BLACK);
		lblNewLabel_1_1.setBounds(35, 457, 321, 85);
		mainPanel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("_____");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 60));
		lblNewLabel_2_1.setBounds(35, 452, 330, 70);
		mainPanel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Baked");
		lblNewLabel_1_1_1.setBounds(411, 457, 321, 85);
		mainPanel.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setForeground(new Color(255, 128, 190));
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1_1.setBackground(new Color(0, 0, 0));
		
		JLabel lblNewLabel_2_1_1 = new JLabel("__");
		lblNewLabel_2_1_1.setBounds(411, 452, 330, 70);
		mainPanel.add(lblNewLabel_2_1_1);
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 60));
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Cooking");
		lblNewLabel_1_1_1_1.setBounds(795, 457, 321, 85);
		mainPanel.add(lblNewLabel_1_1_1_1);
		lblNewLabel_1_1_1_1.setForeground(new Color(255, 128, 192));
		lblNewLabel_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1_1_1.setBackground(Color.BLACK);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("__");
		lblNewLabel_2_1_1_1.setBounds(795, 452, 330, 70);
		mainPanel.add(lblNewLabel_2_1_1_1);
		lblNewLabel_2_1_1_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 60));


	}
}
