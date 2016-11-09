package br.com.cotemig.classesbasetest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cotemig.classesbase.Morador;
import junit.framework.Assert;

public class MoradorTest extends Morador{
	
	String testString;
	
	@Before
	public void startTest(){
		setNome("nome");
		setCpf("cpf");
		setCondominio("condominio");
		setApartamento("apartamento");
		
	}
	@Test
	public void testaGetNome() {
		testString = getNome();
		Assert.assertEquals("nome", testString);
	}
	@Test
	public void testaGetCpf(){
		testString = getCpf();
		Assert.assertEquals("cpf", testString);
	}
	@Test
	public void testaGetCondominio(){
		testString = getCondominio();
		Assert.assertEquals("condominio", testString);
	}
	@Test
	public void testaGetApartamento(){
		testString = getApartamento();
		Assert.assertEquals("apartamento", testString);
	}

}
