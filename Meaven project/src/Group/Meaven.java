package Group;
import java.util.ResourceBundle;

public class Meaven {
	public int userLogin(String in_user,String in_pwd)
	{
		ResourceBundle rb=ResourceBundle.getBundle("config.properties");
		String username=rb.getString("Username");
		String Password=rb.getString("Password");
		if(in_user.equals(username) && in_pwd.equals(password))
	return 1;
	else 
		return 0;
	}

}
