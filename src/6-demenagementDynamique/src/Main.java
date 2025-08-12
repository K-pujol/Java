import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cartons = 0;
        int capaciteCamion = 0;
        int nbVoyage = 0;
        Scanner clavier = new Scanner(System.in);
        System.out.println("Nombres de carton à déménager ? : ");
        cartons = clavier.nextInt();

        System.out.println("Capacité du camions ? : ");
        capaciteCamion = clavier.nextInt();
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
}
