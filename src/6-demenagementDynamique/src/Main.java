import java.util.Scanner;

/**
 * Classe main pour la gestion du nombre de livraison par cartons/capacité du camion
 * @author Killian
 * @version 1.0
 */
public class Main {
    // Variables globales (static)
    static int cartons = 0;
    static int capaciteCamion = 0;

    public static void main(String[] args) {
        /**
         * Récupération des données utilisateur avec la fonction
         */
        getQuantityInfo();

        int nbVoyage = 0;

        /**
         * Boucle qui calcul le nombre de voyage
         */
        while (cartons > 0) {
            nbVoyage++;

            if (cartons >= capaciteCamion) {
                cartons = cartons - capaciteCamion;
                System.out.println("Voyage " + nbVoyage + ": " + capaciteCamion + " cartons transportés. Reste: " + cartons);
            } else {
                System.out.println("Voyage " + nbVoyage + ": " + cartons + " cartons transportés. Reste: 0");
                cartons = 0;
            }
        }

        System.out.println("Nombre total de voyages : " + nbVoyage);
    }

    /**
     * Saisie du nombre de cartons et de la capacité du camion
     */
    public static void getQuantityInfo() {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Nombres de carton à déménager ? : ");
        cartons = clavier.nextInt();

        System.out.println("Capacité du camions ? : ");
        capaciteCamion = clavier.nextInt();

        clavier.close();
    }
}
