import java.util.Scanner;
public class OppgO2b {

    public static void main(String[] args) {

        //Oppretter scanner for at bruker skal kunne skrive poengsum
        Scanner input = new Scanner(System.in);

        //oppretter for-løkke som gjentas ti ganger
        for(int i = 1; i<= 10; i++ ) {

            //For hver oppdatering vil man kunne skrive inn ny poengsum
            // +i gir elevnummeret for hver "runde"
            System.out.print("Elev " + i + " sin poengsum: ");
            int poeng = input.nextInt();

            //bruker if og else if for å deklarere


            if (poeng >= 0 && poeng <= 39) {
                System.out.println("Elev " + i +" sin karakter ble F");
            } else if (poeng >= 40 && poeng <= 49) {
                System.out.println("Elev " + i + " sin karakter ble E");
            } else if (poeng >= 50 && poeng <= 59) {
                System.out.println("Elev " + i + " sin karakter ble D");
            } else if (poeng >= 60 && poeng <= 79) {
                System.out.println("Elev " + i + " sin karakter ble C");
            } else if (poeng >= 80 && poeng <= 89) {
                System.out.println("Elev " + i + " sin karakter ble B");
            } else if (poeng >= 90 && poeng <= 100) {
                System.out.println("Elev " + i + " sin karakter ble A");
            } else {
                System.out.println("Ugyldig verdi.");
            }
        }
        input.close();
    }
}



