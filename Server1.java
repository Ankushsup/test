import java.io.*;
import java.net.*;
import java.util.*;
class Server1
{
	public static void main(String[] args)throws Exception
	{
		ServerSocket ss=new ServerSocket(5000);
		Socket s =ss.accept();
		BufferedReader dis=new BufferedReader(new InputStreamReader(s.getInputStream()));
		DataOutputStream dos= new DataOutputStream(s.getOutputStream());
		PrintWriter pw =new PrintWriter(dos,true);
		int n1,n2,mul;
		while(true)
		{
			n1=Integer.parseInt(dis.readLine());
			n2=Integer.parseInt(dis.readLine());
			mul=n1*n2;
			pw.println(mul);
		}
		
	}
	
}