package DS;

public class CLL
{
    private class Node
    {
       private int data;
       private Node next;

        public Node(int Data)
        {   
            this.data = Data;
            Node next = null;
        }

    }

    private Node Head;
    private Node Tail;
    private int iSize;

    //Constructor for CLL 

    public CLL()
    {
        this.Head = null;
        this.Head = null;
        this.iSize = 0;
    }

    public void InsertFirst(int data)
    {
        Node newn = new Node(data);

        if(Head == null)
        {
            Head = newn;
            Tail = newn;
        }

        else
        {
            newn.next = Head;
            Head = newn;
        
        }
        Tail.next = Head;
        iSize++;
    }


    public void InsertLast(int data)
    {
        Node newn = new Node(data);

        if(Head == null)
        {
            Head = newn;
            Tail = newn;
        }
        
        else
        {
            Tail.next = newn;
            Tail = newn;

        }
        Tail.next = Head;
        iSize++;
    }

    public void InsertAtPos(int data, int pos)
    {
        if(pos < 1 || pos > (iSize+1))
        {
            System.out.println("Invalid Position");
        }

        else if(pos == 1)
        {
            InsertFirst(data);
        }

        else if(pos == (iSize + 1) )
        {
            InsertLast(data);
        }

        else
        {
            Node newn = new Node(data);
            Node Temp = Head;


            for(int iCnt = 1; iCnt < (pos - 1); iCnt++ )
            {
                Temp = Temp.next;
            }

            newn.next = Temp.next;
            Temp.next = newn;
            iSize++;
        }

    }


    public void DeleteFirst()
    {
        if(Head == null)
        {
            System.out.println("LL is Empty");
        }

        else
        {
            Head = Head.next;
            iSize--;
        }
        Tail.next = Head;
    }


    public void DeleteLast()
    {
        if(Head == null)
        {
            System.out.println("LL is Empty");
        }

        else
        {
            Node Temp = Head;

            while(Temp.next != Tail)
            {
                Temp = Temp.next;
            }
            
            Tail = Temp;
            iSize--;
        }
        Tail.next = Head;

    }

    public void DeleteAtPos(int pos)
    {
        if(pos < 1 || pos > (iSize))
        {
            System.out.println("Invalid Position");
        }

        else if(pos == 1)
        {
            DeleteFirst();
        }

        else if(pos == (iSize) )
        {
            DeleteLast();
        }

        else
        {
            Node Temp = Head;

            for(int iCnt = 1 ; iCnt < (pos - 1); iCnt++)
            {
                Temp = Temp.next;
            }

            Temp.next = Temp.next.next;
            iSize--;
        }    


    }

    //Display
    public void Display()
    {
        Node Temp = Head;
        do
        {
            System.out.println(Temp.data);
            Temp = Temp.next;
        }
        while(Temp != Head);

        System.out.println("Size of CLL:"+iSize);

    }



}