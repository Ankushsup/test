import java.io.*;
import java.net.*;
import java.util.*;
class Client2
{
	public static void main(String[] args)throws Exception
	{
		Socket s =new Socket("localhost",5000);
		BufferedReader dis =new BufferedReader(new InputStreamReader(s.getInputStream()));
		DataOutputStream dos =new DataOutputStream(s.getOutputStream());
		PrintWriter pw =new PrintWriter(dos,true);
		Scanner sc =new Scanner(System.in);
		String name;
		while(true)
		{
			System.out.print("Enter Name:-"); 
			name=sc.nextLine();
			pw.println(name); 
			String reverse_name=dis.readLine(); 
			if(name.equals(reverse_name)) 
			{
				System.out.println("name is palindrome");
			} 
			else{
				System.out.println("name is not palindrome");
				}
		} 
		
	}
}