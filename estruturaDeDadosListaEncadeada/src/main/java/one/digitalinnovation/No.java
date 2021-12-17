package one.digitalinnovation;

public class No <T> {

    private T content;
    private No nextNo = null;

    public No(T content) {
        this.content = content;
    }

    public No(T content, No nextNo) {
        this.content = content;
        this.nextNo = nextNo;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public No getNextNo() {
        return nextNo;
    }

    public void setNextNo(No nextNo) {
        this.nextNo = nextNo;
    }

    @Override
    public String toString() {
        return "No{" + content + '}';
    }

    public String toStringLinked() {
        String str = "No{" + content + "}";
        if(nextNo != null){
            str += "->" + nextNo.toString();
        }else {
            str += "->null";
        }
        return str;
    }
}
