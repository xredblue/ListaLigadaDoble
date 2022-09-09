public class TestPrueba {
    public static void main(String[] args) {
        ListaD l = new ListaD();
       l.insertar(3);
        l.insertar(2);
        l.insertar(6);
        l.insertar(5);
        l.insertar(100);
        l.eliminar(2);
       // l.eliminar(3);
        l.mostrar();
        l.mostrarRaiz();
    }
}
