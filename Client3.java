import java.io.*;
import java.net.*;
import java.util.*;
class Client3
{
	public static void main(String[] args)throws Exception
	{
		Socket sock=new Socket("localhost",5000);
		BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
		OutputStream ostream = sock.getOutputStream();
		PrintWriter pwrite = new PrintWriter(ostream,true);
		InputStream istream = sock.getInputStream();
		BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
		System.out.println("Client Ready");
		String receiveMessage,sendMessage,temp;
		{
			System.out.println("Enter first parameter: ");
			sendMessage =keyRead.readLine();
			pwrite.println(sendMessage);
			System.out.flush();
		}
	}
}