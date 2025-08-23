package CaseStudy;

public class DatabaseAuthenticator implements Authenticator {

	@Override
	public boolean authenticate(String user, String password) {
		
		return user.equals("paddureddy123") && password.equals("Paddureddy@12");
	}

}
