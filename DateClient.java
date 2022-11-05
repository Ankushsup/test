import java.rmi.*;
public class DateClient
{
	public static void main(String arg[]){
		try{
			String DateUrl = "rmi://localhost/DateServer";
			DateServerIntf dsin = (DateServerIntf)Naming.lookup(DateUrl);
			System.out.println("The current date & time are: "+dsin.GetDateTime());
		}
		catch(Exception e){
			System.out.println("Exception : "+e);
		}
	}
}