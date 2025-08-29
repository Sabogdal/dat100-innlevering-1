import java.util.Scanner;
public class OppgO2a {

    public static void main(String[] args) {

        //Oppretter scanner for å kunne skrive poengsum
        Scanner input = new Scanner(System.in);
        System.out.print("Din poengsum: ");
        int poeng = input.nextInt();

        //bruker if og else if for å

        if (poeng >= 0 && poeng <= 39) {
            System.out.println("Din karakter ble F");
        }
        else if (poeng >= 40 && poeng <= 49) {
            System.out.println("Din karakter ble E");
        }
        else if (poeng >= 50 && poeng <= 59) {
            System.out.println("Din karakter ble D");
        }
        else if (poeng >= 60 && poeng <= 79) {
            System.out.println("Din karakter ble C");
        }
        else if (poeng >= 80 && poeng <= 89) {
            System.out.println("Din karakter ble B");
        }
        else if (poeng >= 90 && poeng <= 100) {
            System.out.println("Din karakter ble A");
        }
        else {
            System.out.println("Ugyldig verdi");
        }
        input.close();
        }
    }
