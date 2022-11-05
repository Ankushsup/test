import java.io.*;
import java.net.*;
import java.util.*;

class Client {
	public static void main(String[] args) throws Exception {
		Socket ss = new Socket("localhost", 5000);
		DataOutputStream dos = new DataOutputStream(ss.getOutputStream());
		PrintWriter pw = new PrintWriter(dos, true);
		BufferedReader dis = new BufferedReader(new InputStreamReader(ss.getInputStream()));
		Scanner sc = new Scanner(System.in);
		String h1, h2, m1, m2;
		while (true) {
			// sa
			// ah
			System.out.print("Enter hours h1 ");
			h1 = sc.nextLine();
			pw.println(h1);
			System.out.print("Enter minutes M1:-");
			m1 = sc.nextLine();
			pw.println(m1);
			System.out.print("Enter hours H2:-");
			h2 = sc.nextLine();
			pw.println(h2);
			System.out.print("Enter hours M2:-");
			m2 = sc.nextLine();
			pw.println(m2);
			String total_h, total_m;
			total_h = dis.readLine();
			total_m = dis.readLine();
			System.out.println("only in hours:-" + total_h + ":" + total_m + " Hrs");
			System.out.println("onlyin minutes:-" + (dis.readLine()));

		}

	}

}