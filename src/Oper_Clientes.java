public class Oper_Clientes {
    Clientes arr[] = new Clientes[5];
    int contadorClientes=0;

    public void altaClientes(int nCuenta, String Nombre, int saldo){
    arr[contadorClientes++]= new Clientes(nCuenta,Nombre,saldo);
    }

    public void Nombre(){

    }
    int pos(int m){
        int p=-1;
        for (int i = 0; i <contadorClientes; i++) {
            if (arr[i].getNumCuenta()==m){
                p=i;
            }
        }
        return p;
    }
    public void mostrar(int pos){
        System.out.println("Los datos del cliente son");
        System.out.println(arr[pos].toString());
    }
    public void MostrarTodos(){
        for (int i = 0; i <contadorClientes; i++) {
            System.out.println(arr[i].toString());
        }
    }
}
