import java.util.Scanner;

public class Solution {
    
    public static void main( String[ ] args ) {
        Scanner in = new Scanner( System.in );

        double meal_cost = in.nextDouble( );
        int tip_percent = in.nextInt( );
        int tax_percent = in.nextInt( );
        in.close( );

        double tip = meal_cost * ( ( double )tip_percent / 100 );
        double tax = meal_cost * ( ( double )tax_percent / 100 );
        double totalCost = meal_cost + tip + tax;

        System.out.printf( "The total meal cost is %d dollars.", Math.round( totalCost ) );
    }
}