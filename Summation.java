public class Summation{
  public static void main(String[] args){
    NumAdd adder = (start, end) -> {
      int sum = 0;
      for(int i = start; i <= end; i++) {
        sum += i;
      }
      return sum;
    };

    int start = Integer.parseInt(args[0]);
    int end = Integer.parseInt(args[1]);

    System.out.println("Sum: " + adder.addNumbers(start, end));
  }
}
