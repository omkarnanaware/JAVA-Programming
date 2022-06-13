package DS;

public class DLL {
    // Node creation
    private class Node
    {
        private int data;
        private Node next;
        private Node prev;

        public Node(int Data)       //Constructor for Node 
        {
            this.data = Data;
            this.next = null;
            this.prev = null;
        }
    }

    //Head of the DLL
    private Node Head;
    //Size of linked list
    int iSize;

    public DLL()        //Constructor for DLL
    {   
        Head = null;
        iSize = 0;
    } 



    // DLL ADT methods

    public void InsertFirst(int Data)
    {   
        Node newn = new Node(Data);
        if(Head == null)
        {
            Head = newn;
        }

        else
        {
            newn.next = Head;
            Head.prev = newn;
            Head = newn;
        }
        iSize++;
        return;
    }


    public void InsertLast(int Data)
    {
        Node newn = new Node(Data);

        if(Head == null)
        {
            InsertFirst(Data);
        }

        else
        {
            Node Temp = Head;

            while(Temp.next != null)
            {
                Temp = Temp.next;
            }

            newn.prev = Temp;
            Temp.next = newn;

            iSize++;
        }
    }

    public void InsertAtPos(int iData,int iPos)
    {
        if(iPos < 1 || iPos > (iSize+1))
        {
            System.out.println("Invalid Position");
        }

        else if(iPos == 1)
        {
            InsertFirst(iData);
        }

        else if(iPos ==(iSize+1) )
        {
            InsertLast(iData);
        }

        else
        {
            int iCnt = 0;
            Node newn = new Node(iData);


            Node Temp = Head;

            for(iCnt= 1; iCnt <(iPos -1);iCnt++)
            {
                Temp = Temp.next;
            }

            newn.next = Temp.next;
            Temp.next.prev = newn;
            Temp.next = newn;
            newn.prev = Temp;

            iSize++;
        }
    }


    public void DeleteFirst()
    {
        if(Head == null)
        {
            System.out.println("LL is empty");
        }
        
        else
        {   
            Head = Head.next;
            Head.prev = null;
            iSize--;
        }
    }

    public void DeleteLast()
    {   
        if(Head == null)
        {
            System.out.println("LL is empty");
        }

        else
        {
            Node Temp = Head;

            while(Temp.next.next != null)
            {
                Temp = Temp.next;
            }
            Temp.next = null;

            iSize--;

        }    

    }

    public void DeleteAtPos(int iPos)
    {
        if(iPos < 1 || iPos > (iSize))
        {
            System.out.println("Invalid Position");
        }

        else if(iPos == 1)
        {
            DeleteFirst();
        }

        else if(iPos ==(iSize) )
        {
            DeleteLast();
        }


        else
        {
           int iCnt = 0;
            Node Temp = Head;

            for(iCnt= 1; iCnt <(iPos -1);iCnt++)
            {
                Temp = Temp.next;
            }
            Temp.next = Temp.next.next;
            Temp.next.prev = Temp;

            iSize--;
        }
    }



    public void Display()
    {
        Node Temp = Head;

        while(Temp != null)
        {
            System.out.println(Temp.data);

            Temp = Temp.next;
        }

        System.out.println("Size of DLL:"+iSize);


    }

}
