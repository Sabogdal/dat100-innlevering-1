//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class OppgO1 {
    public static void main(String[] args) {

        //Oppretter scanner for å kunne skrive inn inntekt
        Scanner input = new Scanner(System.in);
                System.out.print("Skriv din inntekt: ");
                double tall = input.nextDouble();

                if (tall == 0 && tall <= 217400) {
                    System.out.println("Du betaler 0 kr i skatt");
                }
                    else if(tall >= 217401 && tall <= 306050) {
                        System.out.println("Din trinnskatt er 1,7%, og du betaler" + tall*0.017 + "kr. i trinnskatt");
                        }
                    else if (tall >= 306051 && tall <= 697150) {
                            System.out.println("Din trinnskatt er 4,0%, og du betaler" + tall*0.04 +"kr. i trinnskatt");
                        }
                    else if (tall >= 697151 && tall <= 942400) {
                            System.out.println("Din trinnskatt er 13,7%, og du betaler" + tall*0.137 + "kr. i trinnskatt");
                        }
                    else if (tall >= 942401 && tall <= 1410750) {
                            System.out.println("Din trinnskatt er 16,7%, og du betaler" + tall*0.167 + " kr. i trinnskatt");
                        }
                    else if (tall >= 1410751 && tall <= 10000000) {
                            System.out.println("Din trinnskatt er 17,7%, og du betaler" + tall*0.177 + "kr. i trinnskatt");
                        }
                    else {
                        System.out.println("Du må skrive tall");
                }
        input.close();

                }
        }

