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
           else {
               NodoD aux = primero;
               while ((aux.info<=x)&&(aux!=ultimo))
                   aux=aux.sig;
               aux.ant.sig=temp;
               temp.ant=aux.ant;
               aux.ant=temp;
               temp.sig=aux;
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
        //System.out.print(raiz.info + " ");
    }

    public void recorrerIzquierda(){
       NodoD aux = raiz;
       aux = raiz.ant;
       raiz = aux;
      // System.out.print(aux.info + " ");

    }

    public void eliminar(int y){
        NodoD aux;
        //aux = primero;
        if (primero.info == y){
            primero=primero.sig;
            primero.ant=ultimo;
            ultimo.sig=primero;
            return;
        }



        if(ultimo.info==y){
            ultimo=ultimo.ant;
            ultimo.sig=primero;
            primero.ant=ultimo;
            return;
        }

        aux = primero.sig;
        while (aux != ultimo){
            if (y==aux.info){
                aux.ant.sig=aux.sig;
                aux.sig.ant=aux.ant;
                aux.ant=null;
                aux.sig=null;
                return;
            }
            aux=aux.sig;
        }
        System.out.println("El dato no existe");
    }

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

    public void mostrarRaiz(){
        NodoD aux = raiz;
        System.out.println("Esta es la raiz de la cola: "+ raiz.info);
        //System.out.println(raiz.info);
    }

    public void  prueba(){
        NodoD aux = raiz;
        System.out.println("datos de raiz: "+aux.info);
        aux = raiz.sig;
        System.out.println("Datos despues de raiz: "+aux.info);
        aux = raiz.sig.sig;
        System.out.println("Dos veces de raiz: "+ aux.info);
    }
}
