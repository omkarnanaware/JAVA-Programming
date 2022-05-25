import java.lang.*;
import java.net.*;
import java.io.*;

class Client
{
    public static void main(String arg[]) throws Exception
    {
        System.out.println("Client applicaton is running...");
        String s1,s2;


        Socket s = new Socket("localhost",1100);


        BufferedReader brK = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        while(!(s1 = brK.readLine()).equals("gn"))
        {
            ps.println(s1);
            s2 = br.readLine();
            System.out.println("Server says" + s2);
            System.out.println("Enter message for server : ");
        }

    }

    
}
