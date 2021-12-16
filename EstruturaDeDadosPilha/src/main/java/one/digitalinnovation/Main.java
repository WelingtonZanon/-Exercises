package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha();
        minhaPilha.push( new No<>("primeiro"));
        minhaPilha.push( new No<>("segundo"));
        minhaPilha.push( new No<>("terceiro"));
        minhaPilha.push( new No<>("quarto"));
        minhaPilha.push( new No<>("quinto"));
        minhaPilha.push( new No<>("sexto"));
        minhaPilha.push( new No<>("setimo"));
        minhaPilha.push( new No<>("oitavo"));

        System.out.println(minhaPilha);
        System.out.println(minhaPilha.pop());

        minhaPilha.push(new No<>(99));

        System.out.println(minhaPilha);
    }
}
