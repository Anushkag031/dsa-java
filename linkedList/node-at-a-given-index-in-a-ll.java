class GfG
{
   
    public static int getNth(Node node, int ind)
    {
       //Your code here
       Node temp=node;
       for(int i=1; i<ind; i++)
       {
           temp=temp.next;
           
       }
       return temp.data;
    }
}
