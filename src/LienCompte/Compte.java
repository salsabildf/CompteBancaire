package LienCompte;

public class Compte {

	private int solde;
	
	public Compte(int solde) {
		 if (solde<0) throw new IllegalArgumentException (" solde négatif ");
		      this.solde = solde;	}

	public Compte() {
	      this.solde = 0; }
	
	public int getSolde() {
	      return solde;}
	
	public void debit (int res) {
	       if ( (solde - res) < 0)  throw new IllegalArgumentException("Solde insuffisant pour débiter ");
		   if ( res < 0)  throw new IllegalArgumentException ("debit d'une somme negative");
	       solde = solde - res;
	      }
	public void credit (int res) {
		    if (res < 0) throw new IllegalArgumentException("vous creditez le compte négativement");
		    solde = solde + res;
		    }
	public void virement (Compte cb, int res) {
		this.debit(res);
		cb.credit(res);
	}
}
