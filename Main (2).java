import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Əməliyyatı daxil edin: ");
        String s = scan.nextLine();
        System.out.println("Ədədləri daxil edin: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        if(s.equalsIgnoreCase("cəm")){
            System.out.println(a + b);
        }else if(s.equalsIgnoreCase("fərq")){
            System.out.println(a - b);
        }else if(s.equalsIgnoreCase("hasil")){
            System.out.println(a * b);
        }else if(s.equalsIgnoreCase("bölmə")){
            System.out.println(a / b);
        }
    }
}