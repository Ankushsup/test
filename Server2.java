import java.io.*;
import java.net.*;
import java.util.*;

class Server2{
	public static void main(String args[]) throws Exception
	{
		ServerSocket ss=new ServerSocket(5000);
		Socket s=ss.accept();
		BufferedReader dis = new BufferedReader(new InputStreamReader(s.getInputStream()));
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		PrintWriter pw =new PrintWriter(dos,true);
		String name;
		while(true){
			name=dis.readLine(); 
			String reverse_name=""; 
			for(int i=name.length()-1;i>=0;i--)			 
			{
				reverse_name+=name.charAt(i); 
			} 
			pw.println(reverse_name); 
			
			
			
		}
		
	}
}
