import java.io.*;
import java.net.*;
import java.util.*;

class Server{
	public static void main(String args[]) throws Exception
	{
		ServerSocket ss=new ServerSocket(5000);
		Socket s=ss.accept();
		BufferedReader dis = new BufferedReader(new InputStreamReader(s.getInputStream()));
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		PrintWriter pw =new PrintWriter(dos,true);
		int h1,h2,m1,m2,total_h,total_m,total_m1;
		while(true){
			h1=Integer.parseInt(dis.readLine());
			m1=Integer.parseInt(dis.readLine());
			h2=Integer.parseInt(dis.readLine());
			m2=Integer.parseInt(dis.readLine());
			total_h=h1+h2;
			total_m=m1+m2;
			
			if(total_m>60 && total_m<=120)
			{
				int rh = total_m/60;
				total_h +=rh;
				int rm =total_m%60;
				total_m=rm;
			}
			total_m1=((h1+h2)*60)+m1+m2;
			pw.println(total_h);
			pw.println(total_m);
			pw.println(total_m1);
			
			
		}
		
	}
}
