package logique;

public class Nor extends Logique{
    boolean Q;

    public Nor(boolean inputA, boolean inputB)  throws ExceptionPorteAChanger{
        super(inputA, inputB);
    }

    public boolean updateQ() throws ExceptionPorteAChanger{
        Q = !(inputA() || inputB());
        return Q;
    }
}
