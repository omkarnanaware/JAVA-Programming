import java.lang.*;
import java.net.*;
import java.io.*;

class Server
{
    public static void main(String arg[]) throws Exception
    {
        System.out.println("Server application is running...");
        String s1,s2;

        ServerSocket ss = new ServerSocket(1100);
        Socket s = ss.accept();

        System.out.println("Connection Sucessful");
        BufferedReader brK = new BufferedReader(new InputStreamReader(System.in)); //Canonical one in other
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        while((s1 = br.readLine())!= null)
        {
            System.out.println("Client says : "+s1);
            System.out.println("Enter message for client : ");
            s2.brK.readLine();
            ps.println(s2);
        }
        s.close();
        ss.close();
        br.close();
        brk.close();
        ps.close();
    }

    
}
