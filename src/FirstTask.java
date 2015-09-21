import java.util.Scanner;

import static java.lang.Character.isDigit;

/**
 * Created by Jenejkee on 21.09.15.
 */
public class FirstTask {

    public static int calc() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String firstNum = "";
        String secondNum = "";
        int answer = 0;
        int a = 0;
        int k = 0;
        char chr = ' ';

        for (int i = 0; i<str.length(); i++) {
            if (!isDigit(str.charAt(i))) {
                chr = str.charAt(i);
                a = i;
                k++;
            }
        }

        if (k > 1)
            return calc();

        firstNum = str.substring(0, a);
        secondNum = str.substring(a+1, str.length());

        switch (chr) {
            case '+':
                answer = Integer.parseInt(firstNum) + Integer.parseInt(secondNum);
                System.out.println(answer);
                break;
            case '-':
                answer = Integer.parseInt(firstNum) - Integer.parseInt(secondNum);
                System.out.println(answer);
                break;
            case '*':
                answer = Integer.parseInt(firstNum) * Integer.parseInt(secondNum);
                System.out.println(answer);
                break;
            case '/':
                answer = Integer.parseInt(firstNum) / Integer.parseInt(secondNum);
                System.out.println(answer);
                break;
            default: return calc();
        }
        return calc();
    }
}
