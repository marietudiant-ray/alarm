package date_test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class alarm extends JFrame{
	
	public  static JTextField second;
	public alarm()
	{
		setTitle("alarm");
		MyPanel mp=new MyPanel();
		mp.setLayout(null);
		
		JLabel jLabel1=new JLabel();
		jLabel1.setText("要睡多久啊");
		jLabel1.setFont(new Font("楷体",Font.PLAIN,16));
		jLabel1.setForeground(Color.CYAN);
		jLabel1.setBounds(new Rectangle(50,50,250,100));
		
		JLabel jLabel2=new JLabel();
		jLabel2.setText("秒:");
		jLabel2.setFont(new Font("楷体",Font.PLAIN,16));
		jLabel2.setForeground(Color.CYAN);
		jLabel2.setBounds(new Rectangle(50,100,250,100));
		
		/*JLabel jLabel3=new JLabel();
		jLabel3.setText("分：");
		jLabel3.setFont(new Font("楷体",))*/
		
		JButton  jButton=new JButton("start");
		jButton.setFont(new Font("楷体",Font.PLAIN,10));
		jButton.setForeground(Color.gray);
		jButton.setBounds(new Rectangle(50, 200, 100, 30));
		
		second=new JTextField();
		second.setBounds(100, 135, 30, 30);
	
		mp.add(jLabel1);
		mp.add(jLabel2);
		mp.add(second);
		mp.add(jButton);
	    jButton.addActionListener(new AlarmListener(this));
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(mp);
		this.setBounds(200, 200, 300, 300);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	
	public  void jButton_actionPerformed(ActionEvent actionevent) throws ParseException
	{
		String sec=second.getText().trim();
        int second=Integer.parseInt(sec);
        AlarmThread alarmthread=new AlarmThread(second);
        alarmthread.start();
	}
    public static void main(String[] args)
    {
    	alarm al=new alarm();
    	String sec=second.getText().trim();
    	System.out.println(sec);
    }
}
