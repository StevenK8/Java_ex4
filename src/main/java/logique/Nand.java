package logique;

public class Nand extends Logique{
    boolean Q;

    public Nand(boolean inputA, boolean inputB)  throws ExceptionPorteAChanger{
        super(inputA, inputB);
    }

    public boolean updateQ() throws ExceptionPorteAChanger{
        Q = !(inputA() && inputB());
        return Q;
    }
}