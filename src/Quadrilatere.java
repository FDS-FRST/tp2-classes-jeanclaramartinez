public class Quadrilatere {

    private double cote1;
    private double cote2;
    private double cote3;
    private double cote4;

    // Constructeur par defaut
    public Quadrilatere() {
        this.cote1 = 1;
        this.cote2 = 1;
        this.cote3 = 1;
        this.cote4 = 1;
    }

    // Constructeur avec parametres
    public Quadrilatere(double c1, double c2, double c3, double c4) {
        this.cote1 = c1;
        this.cote2 = c2;
        this.cote3 = c3;
        this.cote4 = c4;
    }

    // Methode Perimetre
    public double perimetre() {
        return cote1 + cote2 + cote3 + cote4;
    }

    // Methode Surface
    public double surface() {
        return 0;
    }

    // Methode Affichage
    public void afficher() {
        System.out.println("Cotes du quadrilatere : " + cote1 + ", " + cote2 + ", " + cote3 + ", " + cote4);
}
}