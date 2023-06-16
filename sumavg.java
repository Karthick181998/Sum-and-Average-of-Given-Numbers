import java.util.Scanner;
public class sumavg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number limit");
        int limit = sc.nextInt();
        int result=0;
        float avg;
        for(int i=1; i<=limit; i++){
            System.out.println("Enter the "+i+" Number");
            int number = sc.nextInt();
            result=result+number;
        }
        avg=result/limit;
        System.out.println("The sum of given numbers is "+result+" and average is "+avg);

    }
}
