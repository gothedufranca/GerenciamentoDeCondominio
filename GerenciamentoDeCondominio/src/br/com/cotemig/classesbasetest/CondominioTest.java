package br.com.cotemig.classesbasetest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.cotemig.classesbase.Condominio;


@SuppressWarnings("unused")
public class CondominioTest extends Condominio{

	String testString;
	int testInt;
	
	@Before
	public void startTest(){
		setNome("nome");
		setCnpj("cnpj");
		setRua("rua");
		setNumero(10);
		setBairro("bairro");
		setCidade("cidade");
	}
	
	
	@Test
	public void testaGetNome(){
		testString = getNome();
		Assert.assertEquals("nome", testString);
	}
	@Test
	public void testaGetCnpj(){
		testString = getCnpj();
		Assert.assertEquals("cnpj", testString);
	}
	@Test
	public void testaGetRua(){
		testString = getRua();
		Assert.assertEquals("rua", testString);
	}
	@Test
	public void testaGetNumero(){
		testInt = getNumero();
		Assert.assertEquals(10, testInt);
	}
	@Test
	public void testaGetBairro(){
		testString = getBairro();
		Assert.assertEquals("bairro", testString);
	}
	@Test
	public void testaGetCidade(){
		testString = getCidade();
		Assert.assertEquals("cidade", testString);
	}

}
