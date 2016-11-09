package br.com.cotemig.classesbasetest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.cotemig.classesbase.Usuario;


public class UsuarioTest extends Usuario{
	
	String testString;
	@Before
	public void startTest(){
		setUsername("username");
		setPassword("password");
	
	}
	@Test
	public void testaGetUsername() {
		testString = getUsername();
		Assert.assertEquals("username", testString);
	}
	@Test
	public void testaGetPassword() {
		testString = getPassword();
		Assert.assertEquals("password", testString);
	}

}
