package LienCompte;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompteTest {
	
	private Compte cb;
	
/*	@Before
	public void 
	c = new Compte (100);
*/
	
	// @org.junit.Test
	@Test
	public void initialisationCompteTest() {
		cb = new Compte (100);
		assertEquals(100, cb.getSolde());
	}
	
	
	@Test 
	public void initialisationCompteNull() {
		cb = new Compte();
		assertEquals(0, cb.getSolde());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void initialisationCompteNegatif() {
		Compte cb = new Compte(-9);
		
	}
	
	@Test 
	public void creditCompte() {
		cb = new Compte(100);
		cb.credit(100);
		assertEquals(200,cb.getSolde());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void creditCompteSommeNegative() {
		cb = new Compte(100);
		cb.credit(-100);
	
	}
	
	@Test 
	public void debitCompte() {
		cb = new Compte(100);
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
		cb = new Compte(100);
		Compte c2 = new Compte(100);
		c2.virement(cb, 50);
		
		assertEquals(150,cb.getSolde());
		assertEquals(50,c2.getSolde());
	}
	
	

}
