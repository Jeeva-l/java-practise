import java.util.Scanner;
public class UserInput {
    
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        int A=scanner.nextInt();
        scanner.nextLine();

        String B=scanner.nextLine();

        System.out.println("the value of a"+A+B);
        scanner.close();
        }
}
