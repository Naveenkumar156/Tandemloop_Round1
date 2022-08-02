import java.util.*;
public class App 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        input.hasNext();
        String operation = input.next();
        input.close();
        switch(operation){
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            default:
                System.out.println("Select correct operation");
        }
    }
}
