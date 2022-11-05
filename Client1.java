import java.io.*;
import java.net.*;
import java.util.*;
class Client1
{
	public static void main(String[] args)throws Exception
	{
		Socket s =new Socket("localhost",5000);
		BufferedReader dis =new BufferedReader(new InputStreamReader(s.getInputStream()));
		DataOutputStream dos =new DataOutputStream(s.getOutputStream());
		PrintWriter pw =new PrintWriter(dos,true);
		Scanner sc =new Scanner(System.in);
		String n1,n2;
		while(true){
			System.out.println("Enter the nimber");
			n1=sc.nextLine();
			pw.println(n1);
			System.out.println("enter the number 2");
			n2=sc.nextLine();
			pw.println(n2);
			int mul = Integer.parseInt(dis.readLine());
			if(mul>250)
			{
				System.out.println("multiplication is greater than 250");
			}
			else
			{
				System.out.println("multiplication is not greater than 250");
			}
			
		}
		
	}
}