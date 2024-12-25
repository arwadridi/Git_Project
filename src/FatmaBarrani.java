public class FatmaBarrani {
        public void nombrePaire(int nombrePaire) {
            if (nombrePaire % 2 == 0) {
                System.out.println("le nombre est paire ");
            } else {
                System.out.println("le nombre est impaire ");
            }
        }

        public void checkNombrePremier(int nombreP) {
            if (nombreP <= 1) {
                System.out.println("Le nombre n'est pas premier.");
                return;
            }

            boolean estPremier = true;

            for (int i = 2; i <= Math.sqrt(nombreP); i++) {
                if (nombreP % i == 0) {
                    estPremier = false;
                    break; // Stop checking once a divisor is found
                }
            }

            if (estPremier) {
                System.out.println("Le nombre est premier.");
            } else {
                System.out.println("Le nombre n'est pas premier.");
            }
        }

    }


