import java.net.*;
import java.rmi.*;

public class DateServer
{
	public static void main(String arg[]){
		try{
			DateServerImpl dsi = new DateServerImpl();
			Naming.rebind("DateServer", dsi);
		}
		catch (Exception e){
			System.out.println("Exception:" +e);
		}
	}
}