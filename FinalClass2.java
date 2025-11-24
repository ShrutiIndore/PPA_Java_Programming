
final class Base
{
   public void fun()
   {
     System.out.println("Inside Base fun");
   }

}
class Derived 
{
    public Base bobj ;    //compositon

    public Derived()
    {
     bobj = new Base();
    }
;}





class FinalClass1
{
     public static void main (String A[])
     {
          Derived dobj = new Derived();

          dobj.bobj.fun();
        
     }
}
