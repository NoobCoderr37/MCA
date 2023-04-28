package FileIOExample;
import java.io.*;
public class FileIOExample {
public static void main(String[] args)throws FileNotFoundException,IOException {
FileInputStream in = new FileInputStream(new File("C:\\Users\\Admin\\Desktop\\Java\\Ass3SetBQ1\\InFile.txt"));
FileOutputStream out = new FileOutputStream(new File("C:\\Users\\Admin\\Desktop\\Java\\Ass3SetBQ1\\OutFile.txt"));
DataInputStream din=null;
DataOutputStream dout = null;
try {
din = new DataInputStream(in);
dout = new DataOutputStream(out);
int c;
while ((c = din.read()) != -1) {
dout.write(c);
}
System.out.println("Successfully done");
} catch(Exception e){
e.printStackTrace();
}
finally {
}
if (din != null) {
din.close();
}
if (dout != null) {
dout.close();
}
}
}



/*
import java.io.*;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileIOExample {
    public static void main(String[] args) {
        try {
            // Create a file input stream to read the contents of InFile.txt
            FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\Java\\Ass3SetBQ1\\InFile.txt");
            DataInputStream dis = new DataInputStream(fis);

            // Create a file output stream to write the contents to OutFile.txt
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\Java\\Ass3SetBQ1\\OutFile.txt");
            DataOutputStream dos = new DataOutputStream(fos);

            // Read the contents of InFile.txt and write them to OutFile.txt
            while (dis.available() > 0) {
                String name = dis.readUTF();
                String phone = dis.readUTF();
                dos.writeUTF(name);
                dos.writeUTF(phone);
            }

            // Close the input and output streams
            dis.close();
            dos.close();

            System.out.println("File contents copied successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("Error: InFile.txt not found");
            e.printStackTrace();
        } catch (EOFException e) {
            System.out.println("Error: End of file reached unexpectedly");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}




*/