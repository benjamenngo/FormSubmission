package actions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport  {
	private Person personBean;
	private String message;
	
	public String getMessage(){
		return message;
	}
	public String execute() throws Exception{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","test_user","test_password");
			
			Statement stmt=con.createStatement();
			
			int rs=stmt.executeUpdate("insert into users (FirstName, LastName, Email, Address, City) Values ('" + personBean.getFirstName()
					+"','" + personBean.getLastName()
					+"','" + personBean.getEmail()
					+"','" + personBean.getAddress()
					+"','" + personBean.getCity()
					+"')");
			
			
			con.close();
		}catch(Exception e){ System.out.println(e);}
	return SUCCESS;
	}
	
	public Person getPersonBean(){
		return personBean;
	}
	public void setPersonBean(Person person) {
		personBean = person;
		
	}
	
}
