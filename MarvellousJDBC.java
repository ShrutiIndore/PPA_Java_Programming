import java.sql.*;

class MarvellousJDBC
{
    public static void main(String[] args)
    {
        try
        {
            //step 1: Load the Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Step 2: Connect the Driver with Database
            Connection cobj = DriverManager.getConnection("jdbc:mysql://localhost:3306/PPA53","root","");

            //Step 3: Create statement class object
            Statement sobj = cobj.createStatement();

            //Step 4: Execute the Query
            ResultSet robj = sobj.executeQuery("select * from student");

            //Step 5: Display the Result
            while(robj.next())
            {
                System.out.println("Roll no:"+robj.getInt("Rno"));
                System.out.println("Name:"+robj.getString("Name"));
                System.out.println("City:"+robj.getString("City"));
                System.out.println("Marks:"+robj.getInt("Marks"));
                System.out.println("--------------------------------------------");
            } 

            robj.close();
            sobj.close();
            cobj.close();
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occured:"+eobj);
        }
    }   
}