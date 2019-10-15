package logique;

public abstract class Logique {
    private boolean A,B,Q;
    private int cycle;
    private int max_cycle;

    abstract boolean updateQ() throws ExceptionPorteAChanger;

    public Logique(boolean inputA, boolean inputB)  throws ExceptionPorteAChanger{
        A = inputA;
        B = inputB;
        cycle = 0;
        max_cycle = 100;
        Q = updateQ();
    }

    public void setMax(int max){
        max_cycle = max;
    }

    public int getCycle(){
        return cycle;
    }

    public int getMaxCycle(){
        return max_cycle;
    }

    public boolean isBroken(){
        if((max_cycle - cycle)<=0)
            return true;
        return false;
    }

    public boolean inputA() throws ExceptionPorteAChanger{
        if(!isBroken()){
            cycle++;
            return A;
        }else
            throw new ExceptionPorteAChanger("Input A");
    }

    public boolean inputB() throws ExceptionPorteAChanger {
        if(!isBroken()){
            cycle++;
            return B;
        }else
            throw new ExceptionPorteAChanger("Input B");
    }

    public boolean outputQ() throws ExceptionPorteAChanger {
        if(!isBroken()){
            cycle++;
            return Q;
        }else
            throw new ExceptionPorteAChanger("Output Q");
    }

    public void setA(boolean pA) throws ExceptionPorteAChanger {
        if(!isBroken()){
            cycle++;
            A = pA;
            Q = updateQ();
        }else
            throw new ExceptionPorteAChanger("Set A");
    }

    public void setB(boolean pB) throws ExceptionPorteAChanger {
        if(!isBroken()){
            cycle++;
            B = pB;
            Q = updateQ();
        }else
            throw new ExceptionPorteAChanger("Set B");
    }
}
