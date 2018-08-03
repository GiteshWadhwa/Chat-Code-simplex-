import java.io.*;
import java.net.*;
class client{

public static void main(String args[])
    {
	try{
  Socket s=new Socket("127.0.0.1",1234);
  DataOutputStream dos=new DataOutputStream(s.getOutputStream());
  dos.writeUTF("Hello sardana");
  dos.close();
  s.close();
   }
   catch(Exception e){
   
   }
   }
}