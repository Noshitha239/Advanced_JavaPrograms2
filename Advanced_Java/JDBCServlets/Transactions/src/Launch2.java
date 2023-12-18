import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Launch2{

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
        Connection con=null;
        PreparedStatement pstmt=null;
        try {
        	Scanner sc=new Scanner(System.in);
        	DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        	con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gqt1","root","root");
        	
        	con.setAutoCommit(false);
        	String s="update student set Stud_name=? where Stud_id=?";
        	pstmt=con.prepareStatement(s);
        	System.out.println("Enter the id");
        	int id1=sc.nextInt();
        	System.out.println("enter the updated name:");
        	String name1=sc.next();
        	
        	pstmt.setString(1, name1);
        	pstmt.setInt(2, id1);
        	
        	pstmt.executeUpdate();
        	
        	String s1="update student set Stud_name=? where Stud_id=?";
        	pstmt=con.prepareStatement(s1);
        	System.out.println("Enter the id");
        	int id2=sc.nextInt();
        	System.out.println("enter the updated name:");
        	String name2=sc.next();
        	
        	pstmt.setString(1, name2);
        	pstmt.setInt(2, id2);
        	
        	pstmt.executeUpdate();
        	
        	
        	String s2="update student set Stud_name=? where Stud_id=?";
        	pstmt=con.prepareStatement(s2);
        	System.out.println("Enter the id");
        	int id3=sc.nextInt();
        	System.out.println("enter the updated name:");
        	String name3=sc.next();
        	
        	pstmt.setString(1, name3);
        	pstmt.setInt(2, id3);
        	
        	pstmt.executeUpdate();
        	
        	con.commit();
        	
        }
        catch(Exception e) {
        	con.rollback();
        	e.printStackTrace();
        }
	}

}
