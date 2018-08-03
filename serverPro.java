import java.io.*;
import java.net.*;
class serverPro{

public static void main(String args[])
    {
	try{
  ServerSocket ss=new ServerSocket(1234);
Socket s=ss.accept();
  DataInputStream dis=new DataInputStream(s.getInputStream());
  System.out.println(dis.readUTF());
  dis.close();
  s.close();
  ss.close();
   }
   catch(Exception e){
   
   }
   }
}