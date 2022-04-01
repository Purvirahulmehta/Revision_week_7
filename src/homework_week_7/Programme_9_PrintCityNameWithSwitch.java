package homework_week_7;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Locale;
import java.util.Scanner;

/**
 * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry USING SWITCH STATEMENT
 */

public class Programme_9_PrintCityNameWithSwitch {
    public static void main(String[] args) {
        //Scanner declaration for reading the input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enther the alphabet between A to F :");
        String city = scanner.next().toUpperCase(Locale.ROOT);
        //create object and call instance method
        Programme_9_PrintCityNameWithSwitch cityname = new Programme_9_PrintCityNameWithSwitch();
        cityname.printCityName(city);
        //clossing scanner object
        scanner.close();
    }
    //Printing city name
    public void printCityName(String city){
        switch(city){
            case "A":
                System.out.println("Aberdeen");
                break;
            case "B":
                System.out.println("Belfast");
                break;
            case "C":
                System.out.println("Cambridge");
                break;
            case "D":
                System.out.println("Derby");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("Faltham");
                break;
            default:
                System.out.println("The alphabet you enter is not between A to F");


        }
    }

}
