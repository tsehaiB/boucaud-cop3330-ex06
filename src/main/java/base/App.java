package base;
import java.util.Scanner;
import java.time.Year;
public class App {
    Scanner inp = new Scanner(System.in);
    public static void main(String args[])
    {
        App myApp = new App();
        Year now = Year.now();

        int year = now.getValue();
        int age = myApp.readAge();
        int retire = myApp.readRetire();
        int difference = myApp.calcDiff(age, retire);
        System.out.println("You have " + difference + " years left until you can retire.");
        System.out.println("It's " + year + ", so you can retire in " + myApp.calcRet(year, difference));
    }
    private int calcDiff(int x, int y){
        return (y - x);
    }
    private int calcRet(int year, int difference){
        return year + difference;
    }
    private int readAge(){
        System.out.print("What is your current age? ");
        return Integer.parseInt(inp.nextLine());
    }
    private int readRetire(){
        System.out.print("At what age would you like to retire? ");
        return Integer.parseInt(inp.nextLine());
    }

}
