import java.rmi.*;
public interface DateServerIntf extends Remote{
	String GetDateTime() throws RemoteException;
}