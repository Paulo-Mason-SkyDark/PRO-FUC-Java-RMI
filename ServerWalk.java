import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

interface IfWalk extends Remote
{
void move(int n) throws RemoteException;// move n steps
String total() throws RemoteException;// number of steps walked
} // IfWalk


class Walk extends UnicastRemoteObject implements IfWalk
{
int nsteps = 0;
public Walk() throws RemoteException
{ //super() is allways called!
} // constructor
public void move(int n)// move n steps
{
System.out.println("One more movement ("+n+" steps)!");
nsteps += n;
} // move()
public String total()// number of steps walked
{
return("Have walked "+nsteps+" steps!");
} // total()
} // Walk





public class ServerWalk
{
public static void main(String[] args)
{
if (args.length != 1)
{
System.err.println("\nUsage:\t java ServerWalk objname\n");
System.exit(1);
} // if()
try
{
Walk awalk = new Walk();// create server object
String objname = "//localhost/"+args[0];// or String objname = args[0];
System.out.println("Registering " +objname+ "...");
Naming.rebind(objname, awalk);// rmiregistry must be running!
System.out.println("Registered!");
} // try()
catch (Exception e)//should be more specific!
{
System.err.println("Error in main()! " + e);
e.printStackTrace();
System.exit(2);
} // catch()

//for (;;) {}// server endless(?) cycle
//not necessary as long as there are references to objname in Registry!
System.out.println("Object waiting...");
} // main()
} // ServerWalk