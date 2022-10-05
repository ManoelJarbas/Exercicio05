import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de metros: ");
        double mt = sc.nextDouble();

        double cm = mt * 100;
        System.out.println("A quantidade de metros informadas corresponde a "+ cm + " centímetros");

    }
}
