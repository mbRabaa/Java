public class Compte {
    private String titulaire;
    private double solde;

    public Compte(String titulaire, double solde) {
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public Compte(String titulaire) {
        this.titulaire = titulaire;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "[Compte titulaire: " + titulaire + ", solde: " + solde + "]";
    }

    public static void debiter(double d) {
        throw new UnsupportedOperationException("Unimplemented method 'debiter'");
    }
}
