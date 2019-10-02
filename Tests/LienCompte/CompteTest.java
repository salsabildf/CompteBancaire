package LienCompte;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class CompteTest {
	
	private Compte cb;
	
	@Before
	public void init (){ cb = new Compte(100);}
	
	@Test
	public void initialisationCompteTest() {
		assertEquals(100, cb.getSolde());
	}
	
	
	
	
	@Test 
	public void initialisationCompteNull() {
		 cb = new Compte();
		assertEquals(0, cb.getSolde());
	}
	
	
	
	@Test (expected = IllegalArgumentException.class)
	public void initialisationCompteNegatif() {
		cb = new Compte();
		Compte cb = new Compte(-9);
		
	}
	
	
	
	@Test 
	public void creditCompte() {
		cb.credit(100);
		assertEquals(200,cb.getSolde());
	}
	

	
	@Test (expected = IllegalArgumentException.class)
	public void creditCompteSommeNegative() {
		cb.credit(-100);
	
	}
	

	
	@Test 
	public void debitCompte() {
		cb.debit(50);
		assertEquals(50,cb.getSolde());
	}
	
	

	
	@Test (expected = IllegalArgumentException.class)
	public void debitCompteSommeNegative() {
		cb = new Compte(100);
		cb.credit(-50);
	
	}
	
	

	@Test 
	public void VirementCompte() {
		Compte c2 = new Compte(100);
		c2.virement(cb, 50);
		
		assertEquals(150,cb.getSolde());
		assertEquals(50,c2.getSolde());
	}
	
	

}
