package structures;

public class IntArrayInt {

    private int[] numArray;
    private int num;
    
    public IntArrayInt(int[] numArray, int num){
        this.numArray = numArray;
        this.num = num;
    }
    
    public int[] getNumArray() {
        return this.numArray;
    }
    public int getNum() {
        return this.num;
    }
    
}
