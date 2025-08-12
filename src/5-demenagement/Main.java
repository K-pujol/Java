public class Main {
    public static void main(String[] args) {
        int cartons = 34;
        int nbVoyage = 0;

        System.out.println("Cartons initiaux : " + cartons);

        while (cartons > 0) {
            nbVoyage++;

            if (cartons >= 9) {
                cartons = cartons - 9;
                System.out.println("Voyage " + nbVoyage + ": 9 cartons transportés. Reste: " + cartons);
            } else {
                System.out.println("Voyage " + nbVoyage + ": " + cartons + " cartons transportés. Reste: 0");
                cartons = 0;
            }
        }

        System.out.println("Nombre total de voyages : " + nbVoyage);
    }
}
