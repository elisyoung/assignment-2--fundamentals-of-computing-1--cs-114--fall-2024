import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int userInput;
    boolean valueIsOdd;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number:");
    userInput = input.nextInt();

    //determine if even or odd
    if(userInput % 2 == 1){
      valueIsOdd = true;
    } else {
      valueIsOdd = false;
    }

    if(valueIsOdd){
    //print top half of odd diamond
      for(int currentRow = 0; currentRow <= userInput/2; currentRow++){

        int spacesInThisRow = (userInput / 2) - currentRow;
        int asterisksInThisRow = 1 + (2 * currentRow);

        for(int spaces = spacesInThisRow; spaces>0; spaces--){
          System.out.print(" ");
        }

        for(int asterisks = 1; asterisks <= asterisksInThisRow; asterisks++){
          System.out.print("*");
        };

        System.out.println();
      }
    } else {
      System.out.println("this value is even");
    }


  }
}
