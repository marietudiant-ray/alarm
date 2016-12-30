package date_test;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		ImageIcon iamge=new ImageIcon("//Users/marui/Pictures/桌面/青云志2.jpg");
		g.drawImage(iamge.getImage(),0,0,this.getWidth(),this.getHeight(),this);
	}
}
