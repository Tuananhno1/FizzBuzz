public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        int isBuzz = number % 5;
        if(isFizz && isBuzz == 0)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(isBuzz == 0)
            return "Buzz";

        return number + "";
    }
}
