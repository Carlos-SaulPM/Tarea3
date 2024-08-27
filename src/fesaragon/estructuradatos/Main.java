package fesaragon.estructuradatos;

public class Main {
    public static void main(String[] args) {
        Nodo<Integer> head = new Nodo<>();
        head.setDato(100);
        head.setSiguiente(new Nodo<>(200,
                            new Nodo<>(300,
                                new Nodo<>(400,
                                    new Nodo<>(600)))));

        //Imprimir valores
        System.out.println("Nodo original: ");
        imprimir(head);

        //Cambiando el valor del tercer nodo de 300 a 333
        head.getSiguiente().getSiguiente().setDato(333);
        System.out.println("\n\nCambiando el nodo de valor 300 a 333: ");
        //Imprimir valores después de remplazar el nodo 300
        imprimir(head);

        //Insertar un nodo 700 después del 600
        head.getSiguiente().getSiguiente().getSiguiente().getSiguiente().setSiguiente(new Nodo<>(700));
        System.out.println("\n\nInsertando nodo de 700 despúes del 600: ");
        imprimir(head);

        //Insertar un nodo con valor 50 al principio
        Nodo<Integer> nuevoHead = new Nodo<>(50);
        nuevoHead.setSiguiente(head);
        System.out.println("\n\nInsertando nodo de 50 antes del 100: ");
        head= nuevoHead;
        imprimir(head);
    }

    private static void imprimir(Nodo h){
        Nodo<Integer> aux = h;
        System.out.print("|");
        while (aux != null){
            System.out.print(aux.getDato() + "| -> |");
            aux = aux.getSiguiente();
        }
        System.out.print("null|");
    }
}
