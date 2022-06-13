import DS.LL;
import DS.CLL;
import java.lang.*;
class Main 
{
    public static void main(String[] args) {
        LL first = new LL();

        first.InsertFirst(101);
        first.InsertFirst(71);
        first.InsertFirst(51);
        first.InsertFirst(21);
        first.InsertFirst(11);
    
        first.InsertLast(151);
        
        first.InsetAtPos(40, 3);
        first.DeleteAtPos(3);
        first.DeleteFirst();
        first.DeleteLast();
        
        first.Display();


        System.out.println("CLL");

        CLL cll = new CLL();
        cll.InsertFirst(101);
        cll.InsertFirst(71);
        cll.InsertFirst(51);
        cll.InsertFirst(31);
        cll.InsertFirst(21);
        cll.InsertFirst(11);

        cll.Display();

        cll.InsertLast(500);
        cll.Display();

        cll.DeleteFirst();
        cll.DeleteLast();
        cll.DeleteAtPos(3);

        cll.Display();
    }


}
