class Demo
{

}
class ObjectClass1    //extend object
{
  public static void main(String[] args)
    {
     Demo dobj = new Demo();
     System.out.println(dobj.hashCode());
     System.out.println(dobj.getClass());
    }
}