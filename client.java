import java.io.*;
import java.net.*;
class client{

public static void main(String args[])
    {
	try{
  Socket s=new Socket("192.127.0.2",1234);
  DataOutputStream dos=new DataOutputStream(s.getOutputStream());
  dos.writeUTF("Hello Alexa Bot");
  dos.close();
  s.close();
   }
   catch(Exception e){
   
   }
   }
}
