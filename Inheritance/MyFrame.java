package Portfolio2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Portfolio.PanelAboutme;
import Portfolio.PanelContact;
import Portfolio.PanelHome;


public class MyFrame extends JFrame implements ContentPaneProvider {
	
	private ImageIcon homeIcon = new ImageIcon(
			new ImageIcon( "D:\\Games\\eclipse\\Portolio\\src\\Assets\\home.png")
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	private ImageIcon aboutmeicon = new ImageIcon(
			new ImageIcon("D:\\Games\\eclipse\\Portolio\\src\\Assets\\information-button.png")
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	private ImageIcon contacticon = new ImageIcon(
			new ImageIcon("D:\\Games\\eclipse\\Portolio\\src\\Assets\\call.png")
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	private ImageIcon skillsicon = new ImageIcon(
			new ImageIcon("D:\\Games\\eclipse\\Portolio\\src\\Assets\\solution.png")
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));

	private ImageIcon userIcon = new ImageIcon(
			new ImageIcon("D:\\Games\\eclipse\\Portolio\\src\\Assets\\rainerheaders.png")
					.getImage().getScaledInstance(166, 111, Image.SCALE_DEFAULT));

	private JPanel contentPane;
	private ContentPaneProvider contentPaneProvider;
	 public static PanelHome panelHome;
	 public static PanelAboutme panelAboutme;
	 public static PanelContact panelContact;
	 public static PanelSkills panelSkills;

	 public MyFrame() {
	        
	        setBackground(new Color(255, 255, 255));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 1280, 720);
//			setIconImage(windowIcon.getImage());
			setLocationRelativeTo(null);
			setUndecorated(true);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(255, 255, 255));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
		//==================Create an instance PANEL CLASS ============================
			
			panelHome = new PanelHome();
			panelHome.setBackground(new Color(255, 255, 255));
			panelAboutme = new PanelAboutme();
			panelAboutme.setBackground(new Color(255, 255, 255));
			panelContact = new PanelContact();
			panelContact.setBackground(new Color(255, 255, 255));
			panelSkills = new PanelSkills();
			panelSkills.setBackground(new Color(255, 255, 255));
			
			
			
		 // Add the panelHome instance to the content pane of the DashboardFrame
		    contentPane.add(panelHome);
		    contentPane.add(panelAboutme);
		    contentPane.add(panelContact);
		    contentPane.add(panelSkills);
		    
		 // Call revalidate() and repaint() to update the frame
		    contentPane.revalidate();
		    contentPane.repaint();
			
		  // set the bounds of the panels
	        panelHome.setBounds(196, 0, 1084, 732);
	        panelAboutme.setBounds(196, 0, 1084, 732);
	        panelContact.setBounds(196, 0, 1084, 732);
	        panelSkills.setBounds(196, 0, 1084, 732);
		//==========End  Header Panel =============================
			
			
			
			
		//========== leftSide Panell================================
			
			
	        JPanel LeftsidePanel = new JPanel();
			LeftsidePanel.setBackground(new Color(255, 128, 192));
			LeftsidePanel.setBounds(0, 0, 197, 763);
			contentPane.add(LeftsidePanel);
			LeftsidePanel.setLayout(null);
			
			JPanel UserIconPanel = new JPanel();
			UserIconPanel.addMouseListener(new PanelButtonMouseAdapter(UserIconPanel) {
			    public void mouseClicked(MouseEvent e) {
			    }
			});
			UserIconPanel.setBackground(new Color(255, 128, 192));
			UserIconPanel.setBounds(10, 21, 166, 147);
			LeftsidePanel.add(UserIconPanel);
			UserIconPanel.setLayout(null);
			
			JLabel UserIconLbl = 	new JLabel("");
			UserIconLbl.setIcon(userIcon);
			UserIconLbl.setBounds(0, 0, 166, 147);
			UserIconPanel.add(UserIconLbl);
			
			
			JPanel HomePanel = new JPanel();
			HomePanel.addMouseListener(new PanelButtonMouseAdapter(HomePanel){
			    public void mouseClicked(MouseEvent e) {
			        menuClicked(HomePanel);
			        panelHome.setVisible(true);// for home panel
		            panelAboutme.setVisible(false);
		            panelContact.setVisible(false);
		            panelSkills.setVisible(false);
			    }
			});
			HomePanel.setBackground(new Color(255, 128, 192));
			HomePanel.setBounds(0, 228, 197, 58);
			LeftsidePanel.add(HomePanel);
			HomePanel.setLayout(null);
			
			JLabel Homelbl = new JLabel("HOME");
			Homelbl.setFont(new Font("Dialog", Font.BOLD, 14));
			Homelbl.setIcon(homeIcon);
			Homelbl.setBounds(22, 0, 197, 58);
			HomePanel.add(Homelbl);
			
			JPanel aboutmepanel = new JPanel();
			aboutmepanel.addMouseListener(new PanelButtonMouseAdapter(aboutmepanel){
				public void mouseClicked(MouseEvent e) {
					menuClicked(aboutmepanel);
					panelHome.setVisible(false);
		            panelAboutme.setVisible(true);// for panel about me panel
		            panelContact.setVisible(false);
		            panelSkills.setVisible(false);			}
				});
			aboutmepanel.setBackground(new Color(255, 128, 192));
			aboutmepanel.setBounds(0, 286, 197, 58);
			LeftsidePanel.add(aboutmepanel);
			aboutmepanel.setLayout(null);
			
			JLabel Aboutme = new JLabel("About me");
			Aboutme.setFont(new Font("Dialog", Font.BOLD, 14));
			Aboutme.setIcon(aboutmeicon);
			Aboutme.setBounds(23, 0, 197, 58);
			aboutmepanel.add(Aboutme);
			
			JPanel contactpanel = new JPanel();
			contactpanel.addMouseListener(new PanelButtonMouseAdapter(contactpanel) {
				public void mouseClicked(MouseEvent e) {
					menuClicked(contactpanel);
					panelHome.setVisible(false);
		            panelAboutme.setVisible(false);// for  panel
		            panelContact.setVisible(true);// for panel contact  panel
		            panelSkills.setVisible(false);
				}
				});
			contactpanel.setLayout(null);
			contactpanel.setBackground(new Color(255, 128, 192));
			contactpanel.setBounds(0, 402, 197, 58);
			LeftsidePanel.add(contactpanel);
			
			JLabel signoutLbl = new JLabel("Contact");
			signoutLbl.setFont(new Font("Dialog", Font.BOLD, 14));
			signoutLbl.setIcon(contacticon);
			signoutLbl.setBounds(22, 0, 197, 58);
			contactpanel.add(signoutLbl);
			
			JPanel skillsPanel = new JPanel();
			skillsPanel.setLayout(null);
			skillsPanel.setBackground(new Color(255, 128, 192));
			skillsPanel.addMouseListener(new PanelButtonMouseAdapter(skillsPanel) {
				public void mouseClicked(MouseEvent e) {
					menuClicked(skillsPanel);
					panelHome.setVisible(false);
		            panelAboutme.setVisible(false);// for  panel
		            panelContact.setVisible(false);// for panel contact  panel
		            panelSkills.setVisible(true);
				}
				});
			skillsPanel.setBounds(0, 343, 197, 58);
			LeftsidePanel.add(skillsPanel);
			
			JLabel skillslbl = new JLabel("Skills");
			skillslbl.setIcon(skillsicon);
			skillslbl.setFont(new Font("Dialog", Font.BOLD, 14));
			skillslbl.setBounds(22, 0, 197, 58);
			skillsPanel.add(skillslbl);

	    //=================End  leftSide Panell================================
			
			JPanel mainPanelcontentpane = new JPanel();
			mainPanelcontentpane.setBackground(new Color(255, 255, 255));
			mainPanelcontentpane.setBounds(196, 0, 1084, 732);
			contentPane.add(mainPanelcontentpane);
			mainPanelcontentpane.setLayout(null);
			
			

		}

	@Override
	public JPanel getContentPane() {
		return contentPane;
	}
	
	// create new method for JPanel class
		public void menuClicked(JPanel selectedPanel){
		    panelHome.setVisible(false);
		    panelAboutme.setVisible(false);
		    panelContact.setVisible(false);
		    selectedPanel.setVisible(true);
		}
				
		 // ================== JPANEL NAMING ACTION LISTENER ===================== 
		private class PanelButtonMouseAdapter extends MouseAdapter{
			
			JPanel panel;
			public PanelButtonMouseAdapter(JPanel panel) {
				this.panel = panel;
			}
			public void mouseEntered(MouseEvent e){
				
				panel.setBackground(new Color(250,  246, 110));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBackground(new Color(255, 128, 192));
			}
			
			@Override
			public void mousePressed(MouseEvent e){
				panel.setBackground(new Color(250,  246, 110));
			} 
			
			@Override
			public void mouseReleased(MouseEvent e){
				panel.setBackground(new Color(250,  246, 110));
			}
		}	
		
	}

