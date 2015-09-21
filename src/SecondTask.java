/**
 * Created by Jenejkee on 21.09.15.
 */
public class SecondTask {
    public static void fizzBuzz() {
        for(int i= 1; i <= 100; i++){
            System.out.println(i % 15 != 0 ? i % 5 != 0 ? i % 3 != 0 ? i : "Fizz" : "Buzz" : "FizzBuzz");
        }
    }
}
