package one.circular;

public class Main {
    public static void main(String[] args) {
        ListaCirculo<String> lista = new ListaCirculo<>();
        lista.add("c0");
        System.out.println(lista);
        lista.remove(0);
        System.out.println(lista);
        lista.add("c1");
        System.out.println(lista);
        lista.add("c2");
        lista.add("c3");
        System.out.println(lista);
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
        System.out.println(lista.get(3));
    }
}
