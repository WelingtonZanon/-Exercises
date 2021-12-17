package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> myLinkedList = new LinkedList();

        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add("test3");
        myLinkedList.add("test4");

        System.out.println("Item na posição 3");

        System.out.println(myLinkedList.get(2));
        System.out.println("------");
        System.out.println("Toda Lista");

        System.out.println(myLinkedList);
        System.out.println("------");

        myLinkedList.remove(2);

        System.out.println("Toda Lista sem o terceiro item excluido.");

        System.out.println(myLinkedList);
        System.out.println("------");
    }
}
