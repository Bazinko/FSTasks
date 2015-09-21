import java.util.Scanner;

public class Main extends FirstTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FirstTask ft = new FirstTask();
        SecondTask st = new SecondTask();

        System.out.println("1. FirstTask");
        System.out.println("2. SecondTask");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                ft.calc();
                break;
            case 2:
                st.fizzBuzz();
                break;
        }

    }
}
