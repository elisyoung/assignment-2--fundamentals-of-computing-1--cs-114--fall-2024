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

    for(int spaces = (userInput / 2); spaces>0; spaces--){
      System.out.println("*");
    }


  }
}
