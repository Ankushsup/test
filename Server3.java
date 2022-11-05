import java.io.*;
import java.net.*;
import java.util.*;

class Server3
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket ss=new ServerSocket(5000);
		System.out.println("Server Ready");
		Socket s=ss.accept();
		BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));
		OutputStream dos=s.getOutputStream() ;
		PrintWriter pw =new PrintWriter(dos,true);
		InputStream istream=s.getInputStream();
		BufferedReader receive =new BufferedReader(new InputStreamReader(istream));
		String receiveMessage,sendMessage,fun;
		int a;
		{
			a=Integer.parseInt(receive.readLine());
			System.out.println("Paratmeter 1:"+a);
			if(a%2==0)
			{
				System.out.println("It is an even number");
				pw.println("It is an even number");
			}
			else
			{
				System.out.println("It is an odd number");
				pw.println("It is an odd number");
			}
			System.out.flush();		
		}
		
	}
}
