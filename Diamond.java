import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int userInput;
    boolean valueIsOdd;

    //get a value from the user
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    userInput = input.nextInt();
    System.out.println();

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

        for(int spaces = 1; spaces <= spacesInThisRow; spaces++){
          System.out.print(" ");
        }

        for(int asterisks = 1; asterisks <= asterisksInThisRow; asterisks++){
          System.out.print("*");
        };

        System.out.println();
      }

      //print bottom half of odd diamond
      for(int currentRow = (userInput / 2 + 1); currentRow <= (userInput - 1); currentRow++){

        int spacesInThisRow = currentRow - (userInput / 2);
        int asterisksInThisRow = userInput - (2 * (currentRow - (userInput / 2)));

        for(int spaces = 1; spaces <= spacesInThisRow; spaces++){
          System.out.print(" ");
        }

        for(int asterisks = 1; asterisks <= asterisksInThisRow; asterisks++){
          System.out.print("*");
        };

        System.out.println();
      }

    } else {
      //print the first asterisk of even diamond
      for(int spacesInTheFirstLine = 1; spacesInTheFirstLine < userInput; spacesInTheFirstLine++){
        System.out.print(" ");
      }
      System.out.println("*");

      //print top half of even diamond
      for(int currentRow = 1; currentRow <= userInput / 2; currentRow++){

        int spacesInThisRow = ((userInput / 2) - currentRow) * 2;
        int asterisksInThisRow = currentRow * 2;

        for(int spaces = 1; spaces <= spacesInThisRow; spaces++){
          System.out.print(" ");
        }

        for(int asterisks = 1; asterisks <= asterisksInThisRow; asterisks++){
          System.out.print("* ");
        }

        System.out.println();
      }

      //print bottom half of even diamond
      for(int currentRow = ((userInput / 2) + 1); currentRow < userInput; currentRow++){
        int spacesInThisRow = 2 * (currentRow - (userInput / 2));
        int asterisksInThisRow = 2 * (userInput - currentRow);

        for(int spaces = 1; spaces <= spacesInThisRow; spaces++){
          System.out.print(" ");
        }

        for(int asterisks = 1; asterisks <= asterisksInThisRow; asterisks++){
          System.out.print("* ");
        }

        System.out.println();
      }

      //print the last asterisk of even diamond
      for(int spacesInTheLastLine = 1; spacesInTheLastLine < userInput; spacesInTheLastLine++){
        System.out.print(" ");
      }

      System.out.println("*");
    }
  }
}
