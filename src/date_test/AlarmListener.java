package date_test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;


public class AlarmListener implements ActionListener {
	
	private alarm adapter;
	AlarmListener(alarm adapter)
	{
		this.adapter=adapter;
	}
	
	public void actionPerformed(ActionEvent actionEvent)
	{
		try {
			adapter.jButton_actionPerformed(actionEvent);;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
