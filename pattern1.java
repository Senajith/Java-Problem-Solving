/* 
       * 
      ***
     *****
    *******
    Print this pattern
*/

public class pattern1 {
    public static void main(String[] args) {
        
        int n = 4;

        int trows = n;

        int spaces = n-1; // decrease 
        int stars = 1; // intially set 1

        for(int row = 1; row <= trows; row++){

            // woork for current row

                // spaces
                for(int csp = 1; csp <= spaces; csp++){
                    System.out.print(" ");
                }
                // stars
                for(int cst = 1; cst <= stars; cst++){
                    System.out.print("*");
                }

                System.out.println(" ");
                spaces--;
                stars+=2;
        }
    }      
}
