public class ListaD {
    NodoD raiz;
    NodoD primero;
    NodoD ultimo;
    //NodoD aux;
    public ListaD(){
        raiz = null;
        primero = null;
        ultimo = null;
    }

    public void insertar(int x){
        NodoD temp = new NodoD(x);
        if (raiz == null){
            raiz = temp;
            primero = temp;
            ultimo = temp;
           temp.sig = ultimo;
           temp.ant = primero;
        }
        else {
            if (x <=primero.info){
                temp.sig =primero;
                primero.ant = temp;
                primero = temp;
                primero.ant = ultimo;
                ultimo.sig = primero;
               // ultimo.sig = primero;
                //primero.ant = ultimo;
            } else if (x >= ultimo.info) {
                temp.ant = ultimo;// equivalente decir que ultimo.sig = temp;???
                ultimo.sig = temp;
                ultimo = temp;
                ultimo.sig = primero;
                primero.ant = ultimo;
            }
           /* else {
                NodoD ant;
                NodoD aux;
                aux =primero;
                ant = null;
                while (aux!=null && aux.info <x){
                    ant =aux;
                    aux=aux.liga;
                }
                ant.liga =temp;
                temp.liga = aux;
            }*/
        }
    }

    public void  recorrerDerecha(){
        NodoD aux = raiz;
        aux = raiz.sig;
        raiz = aux;
        System.out.print(raiz.info + " ");
    }

    public void recorrerIzquierda(){
       NodoD aux = raiz;
       aux = raiz.ant;
       raiz = aux;
       System.out.print(aux.info + " ");

    }

    /*public int eliminar( int y ){
        NodoD aux = raiz;
        NodoD an = null;
        NodoD si = null;

    }*/

    public void mostrar(){
        raiz = primero;
        NodoD aux = raiz;
        while (aux!=ultimo){
            System.out.print(raiz.info + " ");
            aux = raiz.sig;
            raiz = aux;
        }
        System.out.println(raiz.info);
    }
}
