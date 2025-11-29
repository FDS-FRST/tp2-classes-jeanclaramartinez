public class Main {
public static void main(String[] args) {
    Quadrilatere q1 = new Quadrilatere();

    Quadrilatere q2 = new Quadrilatere(4, 6, 4, 6);

    //Affichage du Quadrilatere

    System.out.println("-----Quadrilatere 1 -----");
    q1.afficher();
    System.out.println(" Perimetre : " + q1.perimetre());
    System.out.println("Surface : " + q1.surface());

    System.out.println("-----Quadrilatere 2 -----");
    q2.afficher();
    System.out.println(" Perimetre : " + q2.perimetre());
    System.out.println("Surface : " + q2.surface());
}
}