import java.util.*;
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();
        printOddNumber(limit);
        input.close();
    }

    public static void printOddNumber(int limit)
    {
        int count = 0;
        for(int i = 1; true; i++)
        {
            if(i % 2 != 0)
            {
                System.out.print(i);
                System.out.print(" ");
                count += 1;
            }

            if(limit % 2 == 0){
                if(count == limit -1){
                    break;
                }
            }
            else if(count == limit){
                break;
            }
        
        }
    }
}