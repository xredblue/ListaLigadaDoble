public class ListaOrdenada {
    Nodo1 primero;
    Nodo1 ultimo;
    public ListaOrdenada(){
        primero = null;
        ultimo = null;
    }


    public void insertar(int valor)
    {
        Nodo1 temp = new Nodo1(valor);
        if (primero==null){
            primero = temp;
            ultimo = temp;
        }
        else {
            if (valor <=primero.info){
                temp.liga = primero;
                primero = temp;
            } else if (valor >= ultimo.info) {

                ultimo.liga =temp;
                ultimo = temp;
            }
            else {
                Nodo1 ant;
                Nodo1 aux;
                aux =primero;
                ant = null;
                while (aux!=null && aux.info <valor){
                    ant =aux;
                    aux=aux.liga;
                }
                ant.liga =temp;
                temp.liga = aux;
            }
        }

    }

    public void recorrer(){

    }
    public void mostrar(){
        for (int i= this.primero.info; i< this.ultimo.info; i ++){
            System.out.println(this.ultimo);
        }
    }
}
