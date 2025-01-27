package one.circular;

public class Main {
    public static void main(String[] args) {
        ListaCirculo<String> lista = new ListaCirculo<>();

        lista.add("c0");
        System.out.println(lista); // Saída: [c0]
        lista.remove(0);
        System.out.println(lista); // Saída: []
        lista.add("c1");
        System.out.println(lista); // Saída: [c1]
        lista.add("c2");
        lista.add("c3");
        System.out.println(lista); // Saída: [c1, c2, c3]

    }
}
