/**
 * This programs calculates the cost to park at a parking lot for x hours.
 * Lucy Matulis
 *October 2, 2017
 */
package parkingchargesexercise;
import java.util.Scanner;
import java.text.*;

/**
 *
 * @author lumat8093
 */
public class ParkingChargesExercise {

    /**
     * Method returns double that is the cost of parking for inputted number of
     * hours. Method parameter is one double that is the inputted hours.
    */
    public static double CostCalculator (double hours){
        
        double cost = 2.0;
        if(hours>3){
             for(int i=0;i<hours-3;i++){
                if(cost<10){
                cost=cost+ 0.50;
                }
             }
      } 
        return cost;
    }
    public static void main(String[] args) {
       System.out.println("Input hours: ");
       Scanner h = new Scanner (System.in);
       double hours = h.nextDouble();
       h.close();
       DecimalFormat x = new DecimalFormat("$###.00"); 
       double output = CostCalculator(hours);       
       
       System.out.println("The cost to park will be "+ x.format(output)+".");
    }
    
}
