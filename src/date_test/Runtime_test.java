package date_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Runtime_test {
	
	public Runtime_test() throws IOException, InterruptedException
	{
		Process p=null;
		String cmd="./test.sh";
		System.out.println(cmd);
		try {
			p=Runtime.getRuntime().exec(cmd);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader  input=new BufferedReader(new InputStreamReader(p.getInputStream(),"utf8"));
		String line=null;
		
		while((line=input.readLine())!=null)
		{
			System.out.println(line);
		}
		
		int exitVal=p.waitFor();
		System.out.println("exited with error code"+ exitVal);
	}
   /* public static void main(String[] args) throws IOException, InterruptedException
    {
    	Runtime_test rf=new Runtime_test();
    }*/
}
