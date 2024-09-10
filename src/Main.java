import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre del titular de la cuenta: ");
        String titular = scanner.nextLine();
        System.out.println("Ingrese el numero de cuenta: ");
        String numeroCuenta = scanner.nextLine();

        //objetos de tipo Operaciones
        Operaciones cuenta = new Operaciones(titular, numeroCuenta);
        while (true) {
            System.out.println("¿Que desea realizar? ");
            System.out.println("1.Depositar");
            System.out.println("2.Retirar");
            System.out.println("3.Mostrar Informacion");
            System.out.println("4.Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el valor a depositar: ");
                    double deposito = scanner.nextDouble();
                    cuenta.depositar(deposito);
                    System.out.println("Saldo actual: " + cuenta.saldo);
                    break;
                case 2:
                    System.out.println("Ingrese el valor a retirar: ");
                    double retiro = scanner.nextDouble();
                    cuenta.retirar(retiro);
                    System.out.println("Saldo actual: " + cuenta.saldo);
                    break;
                case 3:
                    cuenta.mostrar();
                    break;
                case 4:
                    System.out.println("Saliendo....");
                    return;
                default:
                    System.out.println("Opcion Invalida");

            }
        }

    }

}