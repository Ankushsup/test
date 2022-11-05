import java.rmi.*;
import java.rmi.server.*;
import java.util.*;

public class DateServerImpl extends UnicastRemoteObject implements DateServerIntf{
	public DateServerImpl() throws RemoteException{}
	public String GetDateTime() throws RemoteException{
		Date d = new Date();
		return " "+d;
	}
}