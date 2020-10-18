package mysql;
import java.sql.*;
import java.util.Scanner;
public class prepared_statement {
	public static void main(String[] args) {
		try {
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost/mysql","root","raghu2000");
	
		System.out.println("enter the lastname where  the firstname to be changed ");
		Scanner in=new Scanner(System.in);
		String  lastname=in.next();
		System.out.println("Enter the name to be changed to");
		String firstname=in.next();
		PreparedStatement pstm=null;
		String s4="update student set firstname= ? where lastname= ?";
		pstm=c.prepareStatement(s4);
		pstm.setString(1,lastname);
		pstm.setString(2, firstname);
		//System.out.println(s4); 
		pstm.executeUpdate();
		System.out.println(s4);
		
		c.close();
		System.out.println("record updated sucessfully");
		
		}
		catch(Exception k) {
			System.out.println("connection not established");
		}
	}

}
