package actions;

import com.opensymphony.xwork2.ActionSupport;

public class WelcomeAction extends ActionSupport {
	 private String message;
	    public String getMessage() {
	        return message;
	    }
	    @Override
	    public String execute() throws Exception {
	        message = "This is WelcomeAction";
	        return SUCCESS;
	    }
}
