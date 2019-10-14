package logique;

public abstract class Logique {
    private boolean A,B,Q;

    abstract boolean updateQ();

    public Logique(boolean inputA, boolean inputB) {
        A = inputA;
        B = inputB;
        Q = updateQ();
    }

    public boolean inputA(){
        return A;
    }

    public boolean inputB(){
        return B;
    }

    public boolean outputQ(){
        return Q;
    }

    public void setA(boolean pA){
        A = pA;
        Q = updateQ();
    }

    public void setB(boolean pB){
        B = pB;
        Q = updateQ();
    }
}
