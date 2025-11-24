class Demo
{
    public int i;
    public static int j;
    
    static
    {
        j =21;
    }

    public Demo()
    {
        System.out.println("Inside default");
        this.i = 11;         //First Use
    }

    public Demo(int a)
    {
       this();          //Second Use
       System.out.println("Inside Parametarised");
        
    }
    public void Display()
    {
        System.out.println("Inside Displaay"+this.i);   // Third use
    }

}

class ThisDemo
{
    public static void main(String[] args)
    {
        Demo dobj = new Demo(51);
        dobj.Display();
    }
}