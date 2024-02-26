public class TestCompte {
    public static void main(String[] args) {
        Compte c1 = new Compte("salah", 1500);
        Compte c2 = new Compte("Fatma", 2000);

        System.out.println(c1);
        System.out.println(c2.getTitulaire());
        CompteEpargne c3 = new CompteEpargne("ali", 850, 0.05);
        System.out.println(c3);
    }
}
