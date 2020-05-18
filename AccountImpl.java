import java.rmi.*;
import java.rmi.server.*;
public class AccountImpl extends UnicastRemoteObject implements BankIntf
{
public AccountImpl()throws RemoteException
{}
public int withdraw(int a,int amt)throws RemoteException
{
amt=amt-a;
return(amt);
}

public int deposit(int b,int amt)throws RemoteException
{
amt=amt+b;
return(amt);
}
public int balance(int amt)throws RemoteException
{
return(amt);
}
}