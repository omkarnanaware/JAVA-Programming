package DS;

public class LL
{   
    //Head and Tail 
    private Node Head;
    private Node Tail;
    private int iSize;

    public LL()
    {
        this.iSize = 0;
    }


    //Node Creation
    private class Node
    {
        private int data;
        private Node next;

        public Node(int Data)
        {
            this.data = Data;
        }

        public Node(int Data, Node Next)
        {
            this.data = Data;
            this.next = Next;
        }


    }


    public void InsertFirst(int Data)
    {
        Node newn = new Node(Data);
        newn.next = null;
        
        if(Head == null)
        {
            Head = newn;
            Tail = Head;
            //System.out.println(Head.data);
            
        }

        else
        {
            newn.next = Head;
            Head = newn;
            //System.out.println(Head.data);
        }
        
        iSize++;

    }

    public void InsertLast(int Data)
    {
        Node newn = new Node(Data);
        newn.next = null;

        if(Head == null)
        {
            InsertFirst(Data);
            return;
        }
        else
        {
            //With Tail
            //Tail.next = newn;

            //Without Tail
            Node Temp;
            Temp = Head;

            while(Temp.next != null)
            {
                Temp = Temp.next;
            }

            Temp.next = newn;

            iSize++;
        }
        
        return;

    }

 //   public InsetAtPos(int Data)
    public void InsetAtPos(int Data,int ipos)
    {
        int iCnt = 0;
        Node newn = new Node(Data);
        newn.next = null;

        if((iSize + 1) < ipos || ipos < 1)
        {
            System.out.println("Invalid position");
        }

        else if(ipos == 1)
        {
            InsertFirst(Data);
        }

        else if(ipos == (iSize+1))
        {
            InsertLast(Data);
        }
        
        else
        {
            Node temp  = Head;
            for(iCnt = 1; iCnt <(ipos - 1); iCnt++)
            {
            temp = temp.next;
            }

            newn.next = temp.next;
            temp.next = newn;
            iSize++;
        }
        return;
    }
    


    public void DeleteFirst()
    {
        if(Head == null)
        {
            System.out.println("LL is empty\n");
        }

        else
        {
            Head = Head.next;
        }
        iSize--;
    }

    public void DeleteLast()
    {
        Node temp = Head;

        while(temp.next.next != null)
        {
            temp = temp.next;
        }

        temp.next = null;
        iSize--;
    }

    public void DeleteAtPos(int ipos)
    {
        
        int iCnt = 0;

        if(ipos < 1 || ipos > iSize)
        {
            System.out.println("Invalid postion");

        }

        else if(ipos == 1)
        {
            DeleteFirst();
        }

        else if(ipos == iSize)
        {
            DeleteLast();
        }

        else
        {
            Node temp = Head;
            for(iCnt = 1; iCnt < (ipos-1); iCnt++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }



    public void Display()
    {
        Node temp = Head;

        while(temp != null)
        {
            System.out.println(temp.data);

            temp = temp.next;
        }

        System.out.println("Size of LL:"+iSize);
    }

}