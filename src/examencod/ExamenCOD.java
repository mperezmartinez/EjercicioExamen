package examencod;

public class ExamenCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iN = 11;
        if (calcprimo(iN)) {
            System.out.println("Es numero primo");
        } else {
            System.out.println("NO es numero primo");
        }

        for (int x = 2; x < 1000; x++) {
            if (calcprimo(x)) {
                System.out.print(x + " ");
            }
        }
    }

    public static boolean calcprimo(int num1) {
        int i = 2;
        boolean aux = true;
        while ((aux) && (i != num1)) {
            if (num1 % i == 0) {
                aux = false;
            }
            i++;
        }
        return aux;
    }

}
