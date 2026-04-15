import java.util.Scanner; 

public class Example1 { //class declaration
    public static void main(String[] args) { //main program entry point
        
        Scanner sc = new Scanner(System.in);
        int x, y, ans;
        System.out.print("Enter the first number: ");
        x = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        y = sc.nextInt();
        
        ans = x / y;
        System.out.println("The result is: " + ans);
    }
}