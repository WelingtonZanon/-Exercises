package one.digitalinnovation;

public class Pilha<T> {

    No refNoEntradaPilha = null;

    public void push (T obj){

        No novoNo = new No<>(obj);

        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop(){
        if(!isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return  noPoped;
        }
        return null;
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
        return refNoEntradaPilha == null? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno = "-----------\n";
        stringRetorno+= " Pilha\n";
        stringRetorno+="------------\n";
        No noAuxiliar =refNoEntradaPilha;
        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar= noAuxiliar.getRefNo();
            }else {
                break;
            }
        }
        stringRetorno += "============";
        return  stringRetorno;
    }
}