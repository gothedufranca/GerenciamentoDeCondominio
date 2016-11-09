package br.com.cotemig.classesbase;

public class Usuario {
	private String user = null;
	private String pass = null;
	
	/**
	 * @return the password for database login
	 */
	public String getPassword() {
		return pass;
	}
	
	/**
	 * @param pass the password to set
	 */
	public void setPassword(String pass) {
		this.pass = pass;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return user;
	}

	/**
	 * @param user the username to set
	 */
	public void setUsername(String user) {
		this.user = user;
	}
	
	
}
