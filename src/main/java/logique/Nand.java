package logique;

public class Nand extends Logique{
    boolean Q;

    public Nand(boolean inputA, boolean inputB) {
        super(inputA, inputB);
    }

    public boolean updateQ(){
        Q = !(inputA() && inputB());
        return Q;
    }

    
    public static void main(String[] args) {
        Nand nand = new Nand(true, false);
    }

}