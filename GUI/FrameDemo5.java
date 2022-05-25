import java.lang.*;
import java.awt.*;
import java.awt.event.*;


class MarvellousFrame extends WindowsAdapter
{
    public Frame fobj;
    

    public MarvellousFrame(String name)
    {
        fobj = new Frame(name);
        fobj.setSize(600,600);
        fobj.setVisible(true);

        //event Driven architecture
        fobj.addWindowListener(this);


   
    }

    public void windowClosing(WindowEvent obj) 
    {

        System.out.println("inside window closing");
        System.exit(0);

    }

}


class FrameDemo5
{
    public static void main(String [] args) 
    {
        System.out.println("Print the data on console");

        MarvellousFrame mobj = new MarvellousFrame("PPA");
    }
}