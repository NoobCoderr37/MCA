package FileInOut;
import java.io.*;
public class FileInOut {
       public static void main(String args[]) throws FileNotFoundException,IOException{
    	   FileInputStream in = new FileInputStream(new File("E:\\Download\\InFile.txt"));
    	   FileOutputStream out = new FileOutputStream(new File("E:\\Download\\OutFile.txt"));
    	   DataInputStream din = null;
    	   DataOutputStream dout = null;
    	   
    	   din=  new DataInputStream(in);
    	   dout =new DataOutputStream(out);
    	   
    	   int c;
    	   
    	   while((c=din.read())!=-1) {
    		   dout.write(c);
    	   }
    	   System.out.println("File successfully");
    	   
       }
}
