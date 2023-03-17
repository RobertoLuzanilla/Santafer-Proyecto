public class Oper_Pilas {
    int cdp =-1,t=5;
    Clientes pila[]= new Clientes[t];

    public void apilar(Clientes clientes){
        if (cdp== t-1){
            System.out.println("La pila esta llena");
        }
        pila[++cdp]=clientes;
    }
    public void mostrarPila() {
        System.out.println("Clientes en la pila:");
        for (int i = 0; i <= cdp; i++) {
            Clientes cliente = pila[i];
            System.out.println(cliente.getNumCuenta() + " - " + cliente.getNombre() + " - " + cliente.getSaldo());
        }
    }
    public void mostrarUltimo(){
        System.out.println(pila[cdp].getNombre());

    }
}
