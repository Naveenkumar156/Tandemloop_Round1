import java.util.*;
public class App {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }
        input.close();
        int[] numberArray = new int[9];
        for(int i = 1; i <= 9; i++)
        {
            int count = 0;
            for(int j = 0; j < size; j++){
                if(arr[j] % i == 0){
                    count++;
                }
            }
            numberArray[i-1] = count;
        }
        System.out.print("{");
        for(int i = 1; i < 10; i++){
            System.out.print(i + ": " + numberArray[i-1]);
            if(i != 9)
                System.out.print(", ");
        }
        System.out.println("}");
    }
}
