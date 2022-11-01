class IfStatement {
  public static void main(String[] args) {

    int number = 0;

    // checks if number is less than 0
    if (number < 0) {
      System.out.println("The number is negative.");
    }

    // execute this block
    // if number is not greater than 0
    else {
      System.out.println("The number is positive.");
    }

    System.out.println("Statement outside if...else block");
    //System.out.println("Statement outside if block");
  }
}
