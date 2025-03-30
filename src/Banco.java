import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dias;
        double capital, ganancia, interes;

        System.out.println("Teclea la capital:");
        capital = entrada.nextDouble();
        System.out.println("Teclea dias mes:");
        dias = entrada.nextInt();
        interes = 0.02;
        ganancia = capital * dias * interes;
        System.out.println("La ganancia es: "+ ganancia);
    }
}
