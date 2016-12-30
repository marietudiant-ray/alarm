package date_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlarmThread  extends Thread{
	
	private int time;
	
	public AlarmThread(int time)
	{
		this.time=time;
	}
    
	public void run()
	{
		int newtime=time*1000;
		try {
			sleep(newtime);
			new Runtime_test();
			/*Process p=null;
			String cmd="./test.sh";
			System.out.println(newtime +"   "+cmd);
		    p=Runtime.getRuntime().exec(cmd);
		    BufferedReader  input=new BufferedReader(new InputStreamReader(p.getInputStream(),"utf8"));
			String line=null;
			
			while((line=input.readLine())!=null)
			{
				System.out.println(line);
			}
			
			int exitVal=p.waitFor();
			System.out.println("exited with error code"+ exitVal);*/
			
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}  
