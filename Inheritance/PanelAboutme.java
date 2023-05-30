package Portfolio2;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelAboutme extends JPanel {
	
	private ImageIcon rainepic = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets\\raine2.jpeg")
					.getImage().getScaledInstance(447, 541, Image.SCALE_DEFAULT));
	
    public JPanel getPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(new Color(192, 192, 192));
        panel.setBounds(196, 90, 1084, 628);
        panel.setLayout(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setBounds(-20, 0, 1150, 628);
        panel.add(mainPanel);
        mainPanel.setLayout(null);

        return panel;
    }
}
