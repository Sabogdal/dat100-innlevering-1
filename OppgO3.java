import java.util.Scanner;
public class OppgO3 {
    //Lag et program som leser inn et heltall n > 0,
    // beregner verdien n! (n fakultet) og skriver verdien til n! ut på skjermen,
    // der n! = 1*2*3* … *(n-1)*n.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Skriv et tall: ");
        int n = input.nextInt();

        int x = n;

        for(int i = 1; i < n-1;) {
            x = (x * (n - 1));
            n--;

        }
        System.out.println("Verdien er " + x);
input.close();


    }
    }

