public class Operaciones {

    //ATRIBUTOS
    private final String titular;
    double saldo;
    private final String numeroCuenta;

    //CONSTRUCTOR
    public Operaciones(String titular, String numeroCuenta){
        this.titular=titular;
        this.numeroCuenta=numeroCuenta;
        this.saldo=0;

    }
    //METODOS
    public void depositar(double cantidad){
        saldo+=cantidad;
    }
    public void retirar(double cantidad){
        if(cantidad>saldo){
            System.out.println("Saldo insuficiente");
        }
        else{
            saldo-=cantidad;
        }
    }
    public void mostrar(){
        System.out.println("Titular: "+titular);
        System.out.println("Numero de cuenta: "+numeroCuenta);
        System.out.println("Saldo: "+saldo);
    }
}
