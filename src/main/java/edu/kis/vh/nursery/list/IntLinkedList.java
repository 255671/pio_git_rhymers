package edu.kis.vh.nursery.list;

/**
 * Klasa implementująca linked liste, której watością jest wartość całkowita - int
 */
public class IntLinkedList {

    /**
     * Poprzedni Node
     */
    private Node last;
    /**
     * OLD - TO DELETE
     */
    private int i; //TODO: DO USUNIECIA

    /**
     * Dodaje nowy Node do listy z wartością i
     * @param i wartosc Node'a w liście
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Sprawdza czy lista jest pusta
     * @return true jeżeli jest pusta
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Sprawdza czy lista jest pełna
     * @return true jeżeli jest pełna
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Zwraca wartość z ostatniego elementu listy
     * @return Zwraca ostatnią wartość listy
     */
    public int top() {
        if (isEmpty())
            return -1;
        return last.getValue();
    }

    /**
     * Usuwa ostatni element listy i zwraca jej wartość
     * @return Zwraca wartość usuniętego node'a lub -1, jeżeli lista jest pusta.
     */
    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    /**
     * Klasa węzła listy
     */
    class Node {

        /**
         * Wartość węzła typy całkowitego
         */
        private int value;
        /**
         * Poprzedzający node (null oznacza, że node jest pierwszy)
         */
        private Node prev;
        /**
         * Następujący node (null oznacza, że node jest ostatni
         */
        private Node next;

        /**
         * Konstruktor Node
         * @param i wartość węzła
         */
        public Node(int i) {
            value = i;
        }

        /**
         * Zwraca wartość węzła
         * @return wartość węzła
         */
        public int getValue() {
            return value;
        }

        /**
         * Zwraca poprzedni węzeł
         * @return poprzedzający węzeł
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * Ustawia poprzedzający węzeł
         * @param prev poprzedzający węzeł
         */
        public void setPrev(Node prev) {
            this.prev = prev;
        }

        /**
         * Zwraca następujący węzeł
         * @return następujący węzeł
         */
        public Node getNext() {
            return next;
        }

        /**
         * Ustawia następujący węzeł
         * @param next następujący węzeł
         */
        public void setNext(Node next) {
            this.next = next;
        }
    }
}
