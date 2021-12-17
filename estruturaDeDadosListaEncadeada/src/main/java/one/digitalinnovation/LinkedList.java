package one.digitalinnovation;

public class LinkedList<T> {
    private No<T> inputRef;

    public LinkedList() {
        this.inputRef = null;
    }

    public boolean isEmpty() {
        return inputRef == null ? true : false;
    }

    public No<T> getInputRef() {
        return inputRef;
    }

    public void setInputRef(No<T> inputRef) {
        this.inputRef = inputRef;
    }

    private int size() {
        int sizeList = 0;
        No<T> AuxRef = inputRef;
        while (true){
            if (AuxRef != null){
                sizeList++;
                if (AuxRef.getNextNo() != null){
                    AuxRef = AuxRef.getNextNo();
                }else {
                    break;
                }
            }else {
                break;
            }
        }
        return sizeList;
    }

    public void add (T content){
        No<T> newNo = new No(content);
        if (this.isEmpty()){
            inputRef = newNo;
            return;
        }
        No<T> noAux = inputRef;
        for(int i=0; i < size() - 1; i++){
            noAux = noAux.getNextNo();
        }
        noAux.setNextNo(newNo);
    }

    private void indexValidation(int index){
        if (index >= size()){
            int lastIndex = size()-1;
            throw new IndexOutOfBoundsException("Index nonexistent"+ index);
        }
    }

    private No<T> getNo(int index){
        indexValidation(index);
        No<T> noAux = inputRef;
        No<T> noReturn = null;
        for (int i=0; i<=index; i++){
            noReturn = noAux;
            noAux = noAux.getNextNo();
        }
        return noReturn;
    }
    public T get(int index){
        return getNo(index).getContent();
    }

    public T remove(int index){
        indexValidation(index);

        No<T> targetNo = getNo(index);
        if(index==0){
            inputRef = targetNo.getNextNo();
            return targetNo.getContent();
        }
        No<T> beforeNo = getNo(index-1);
        beforeNo.setNextNo(targetNo.getNextNo());
        return targetNo.getContent();
    }

    @Override
    public String toString(){
        String strReturn ="";
        No<T> noAux = inputRef;
        for(int i=0; i < size(); i++){
            strReturn += "[No{content = " + noAux.getContent() + "}]--->";
            noAux = noAux.getNextNo();
        }
        strReturn += "null";
        return strReturn;
    }

}
