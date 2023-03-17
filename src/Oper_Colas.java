import java.util.Scanner;

public class Oper_Colas {
    Scanner sc=new Scanner(System.in);
    int t=5;
    int inicio=0;
    int fin=-1;
    Colas[] arr=new Colas[t];
    int ContadorColas=0;

    public void altaCola(int NumCuenta, String nombre, int deposito, int movimiento){
        if (fin==t-1){
            System.out.println("La cola esta llena");
            return;
        }
        Colas nuevCola = new Colas(NumCuenta,deposito,nombre, movimiento);
        arr[++fin]=nuevCola;
        ContadorColas++;
    }
    public void clientEncola(){
        for (int i = 0; i < ContadorColas; i++) {
            switch (arr[i].getMovimiento()) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println(arr[i].getNombre() + " -- " + "Deposito");
                break;
                case 2:
                    System.out.println(arr[i].getNombre() + " -- " + "Retiro");
                    break;
                case 3:
                    System.out.println(arr[i].getNombre() + " -- " + "Cambio de cheque");
                    break;
            }
        }
    }   public Colas eliminarCliente() {
        if (ContadorColas == 0) {
            System.out.println("No hay clientes en la cola");
            return null;
        } else {
            Colas num = arr[inicio];
            inicio++;
            ContadorColas--;
            return num;
        }
    }


    public void Deposito(int numcuenta, int impor) {
        for (int i = 0; i < ContadorColas; i++) {
            if (arr[i] != null && arr[i].getNumCliente() == numcuenta) {
                arr[i].setSaldo(arr[i].getSaldo() + impor);
                break;
            }
        }
    }


    public void retiro(int Pos, int retiro){
        for (int i = 0; i < ContadorColas; i++) {

            if (arr[i].getNumCliente() == Pos && arr[Pos].getSaldo()<retiro){
                System.out.println("Saldo insuficiente");
            }else {

                arr[Pos].setSaldo(arr[Pos].getSaldo()-retiro);
            }
        }
    }
    public void CambioCheque(int Pos, int cheque){
        for (int i = 0; i <ContadorColas; i++) {
            if (arr[i].getNumCliente()==Pos && arr[Pos].getSaldo()<cheque){
                System.out.println("Saldo insuficiente");
                System.out.println("Se aplico una multa de 500 pesos");
                arr[Pos].setSaldo(arr[Pos].getSaldo()-500);
            }else {

                arr[Pos].setSaldo(arr[Pos].getSaldo()-cheque);
            }
        }
    }
    int pos(int m){
        int p=-1;
        for (int i = 0; i <ContadorColas; i++) {
            if (arr[i].getNumCliente()==m){
                p=i;
            }
        }
        return p;
    }

}
