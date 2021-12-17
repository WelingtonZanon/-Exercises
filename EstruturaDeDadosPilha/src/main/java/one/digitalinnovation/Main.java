package one.digitalinnovation;

public class Main {


    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha();
        minhaPilha.push("primeiro");
        minhaPilha.push("segundo");
        minhaPilha.push("terceiro");
        minhaPilha.push("quarto");
        minhaPilha.push("quinto");
        minhaPilha.push("sexto");
        minhaPilha.push("setimo");
        minhaPilha.push("oitavo");

        int[] numbers = new int[10];

        int a = numbers[1];

        System.out.println(minhaPilha);
        System.out.println(minhaPilha.pop());

        minhaPilha.push(99);

        System.out.println(minhaPilha);
    }

}