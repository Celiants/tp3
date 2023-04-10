<<<<<<< HEAD
public class Portefeuille 
{
  private Cryptomonnaie monnaie;
  private double montant; // Soit le nombre de jetons
  private String proprietaire;

  public Portefeuille(Cryptomonnaie monnaie, double montant, String proprietaire)
  {
      this.monnaie      = monnaie;
      this.montant      = montant;
      this.proprietaire = proprietaire;
  }

  /**
   * Cette fonction vous permet de transfÃ©rer des devises du portefeuille actuel 
   * vers le portefeuille de destination pour le montant indiquÃ©. Le type de devise 
   * (nom du Jeton) doit Ãªtre le mÃªme entre les deux portefeuilles et le montant 
   * du portefeuille actuel doit Ãªtre supÃ©rieur ou Ã©gal Ã  celui indiquÃ©.
   * @param destination 
   * @param montantJetons
   * @return Vrai si la transaction a Ã©tÃ© effectuÃ©e, faux sinon.  
   */
  public boolean transfertDevise (Portefeuille destination, double montantJetons)
  {
      /**
           FONCTION Ã€ IMPLEMENTER
	  **/
      return false;
  }

  /**
   * Cette fonction vous permet d'acheter des jetons de la 
   * crypto-devise en fonction de leur valeur en euros. 
   * Le rÃ©sultat est l'augmentation des jetons de la crypto-monnaie.
   * @param montantEuros Valeur d'achat en euros 
   * @return true si le montant en euros est supÃ©rieur ou Ã©gal Ã  0 
   */
  public boolean achatDevise (double montantEuros)
  {
=======
public class Portefeuille {
	private Cryptomonnaie monnaie;
	private double montant; // Soit le nombre de jetons
	private String proprietaire;

	public Portefeuille(Cryptomonnaie monnaie, double montant, String proprietaire)
	{
		this.monnaie      = monnaie;
		this.montant      = montant;
		this.proprietaire = proprietaire;
	}

>>>>>>> 6f8b8f644671585dbf0bdef9a8901a4205b2c69a
	/**
	 * Cette fonction vous permet de transférer des devises du portefeuille actuel 
	 * vers le portefeuille de destination pour le montant indiqué. Le type de devise 
	 * (nom du Jeton) doit être le même entre les deux portefeuilles et le montant 
	 * du portefeuille actuel doit être supérieur ou égal à celui indiqué.
	 * @param destination 
	 * @param montantJetons
	 * @return Vrai si la transaction a été effectuée, faux sinon.  
	 */
	public boolean transfertDevise (Portefeuille destination, double montantJetons)
	{
		if (destination.monnaie.getNom().equals(this.monnaie.getNom()) && this.montant >= montantJetons)
		{
			this.montant        -= montantJetons;
			destination.montant += montantJetons;
			return true;
		}

<<<<<<< HEAD
  /**
   * Valide si le proprietaire passÃ© en parametre est celui
   * qui as le portefeuille
   * @param proprietaire
   * @return true si les nom du propriÃ©taire est correct
   */
  public boolean estProprietaire (String proprietaire)
  {
        return (proprietaire.equals(this.proprietaire))?true:false;
  }

  /**
   * 
   * @return La valeur en euros du Portefeuille. 
   * Autrement dit, le monant de jetons multipliÃ© par la valeur des jetons. 
   */
  public double valeurEnEuros()
  {
      return this.montant * this.monnaie.getValeurDeJeton();
  }

  public String getProprietaire() 
  {
      return proprietaire;
  }

  public Cryptomonnaie getMonnaie() 
  {
      return monnaie;
  }

  public double getMontant() 
  {
      return montant;
  }

  @Override
  public String toString() 
  {
      return String.format("%10s",proprietaire) + " : "
           + String.format("%10.1f", montant)   + " x " 
           + this.monnaie.toString()            + " = "
           + String.format("%10.1f", valeurEnEuros());
  }
=======
		return false;
	}

	/**
	 * Cette fonction vous permet d'acheter des jetons de la 
	 * crypto-devise en fonction de leur valeur en euros. 
	 * Le résultat est l'augmentation des jetons de la crypto-monnaie.
	 * @param montantEuros Valeur d'achat en euros 
	 * @return true si le montant en euros est supérieur ou égal à 0 
	 */
	public boolean achatDevise (double montantEuros)
	{
		if (montantEuros < 0) return false;

		this.montant += (double)(montantEuros/this.monnaie.getValeurDeJeton());
		return true;
	}

	/**
	 * Valide si le proprietaire passé en parametre est celui
	 * qui as le portefeuille
	 * @param proprietaire
	 * @return true si les nom du propriétaire est correct
	 */
	public boolean estProprietaire (String proprietaire){
		return (proprietaire.equals(this.proprietaire))?true:false;
	}

	/**
	 * 
	 * @return La valeur en euros du Portefeuille. 
	 * Autrement dit, le monant de jetons multiplié par la valeur des jetons. 
	 */
	public double valeurEnEuros(){
		return this.montant * this.monnaie.getValeurDeJeton();
	}

	public String getProprietaire() {
		return proprietaire;
	}
>>>>>>> 6f8b8f644671585dbf0bdef9a8901a4205b2c69a

	public Cryptomonnaie getMonnaie() {
		return monnaie;
	}

	public double getMontant() {
		return montant;
	}

	@Override
	public String toString() {
		return String.format("%10s",proprietaire) + " : "
			 + String.format("%10.1f", montant)   + " x " 
			 + this.monnaie.toString()            + " = "
			 + String.format("%10.1f", valeurEnEuros());
	}

}
