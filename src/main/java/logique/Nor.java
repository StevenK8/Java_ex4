package logique;

public class Nor extends Logique{
    boolean Q;

    public Nor(boolean inputA, boolean inputB) {
        super(inputA, inputB);
    }

    public boolean updateQ(){
        Q = !(inputA() || inputB());
        return Q;
    }

    public static void main(String[] args) {
        Nor nand = new Nor(true, false);
    }
}
