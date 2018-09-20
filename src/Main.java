import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("Indtast første tal");
        int intInput1= input1.nextInt();
        System.out.println("Indtast næste tal");
        int intInput2= input2.nextInt();
        int sum= (intInput1+intInput2)/2;

        System.out.println("Gennemsnittet er : " +sum);
    }
}
