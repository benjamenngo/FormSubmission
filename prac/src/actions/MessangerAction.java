package actions;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;





import com.opensymphony.xwork2.ActionSupport;

public class MessangerAction extends ActionSupport {

	
	private String message;
	private Person personBean;
	private String name;
    public String getMessage() {
    	
        return message;
    }
    @Override
    public String execute() throws Exception {
    	try{  
			Class.forName("com.mysql.jdbc.Driver");  
			  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/testdb","test_user","test_password");  
			  
			  
			Statement stmt=con.createStatement();  
  
			ResultSet rs=stmt.executeQuery("select * from users where email='"+personBean.getEmail()+"'");
			//while(rs.next())  
			if(rs.next()){
				if(rs.getString("Email")==(personBean.getEmail()));{
					message="welcome "+rs.getString("FirstName");
				}
			}
				//System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"	"+rs.getString(4)+"	"+rs.getString(5));  
			 
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