public class TestGestionBanque {
    public static void main(final String[] args) {
        final Compte compte = new Compte("salah", 1500);

        try {
            Compte.debiter(1200.0);
            System.out.println("Le retrait a été effectué avec succès.");
        } catch (final SoldeInsuffisantException e) {
            System.out.println("Solde insuffisant : " + e.getMessage());
        }

        System.out.println("Solde après le retrait : " + compte.getSolde());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

    @Override
    public String toString() {
        return "TestGestionBanque []";
    }

}
