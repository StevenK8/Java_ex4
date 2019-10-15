package logique;

public class BasculeRS{
    private Nor R,S;

    public BasculeRS(boolean inputA, boolean inputB, int max)  throws ExceptionPorteAChanger{
        R = new Nor(inputA, true);
        R.setMax(max);
        S = new Nor(false, inputB);
        S.setMax(max);
    }

    public boolean getS() throws ExceptionPorteAChanger{
        return S.inputB();
    }

    public boolean getR() throws ExceptionPorteAChanger{
        return R.inputA();
    }

    public boolean getQ() throws ExceptionPorteAChanger{
        return R.outputQ();
    }

    public boolean getNonQ() throws ExceptionPorteAChanger {
        return S.outputQ();
    }

    public void setS(boolean inputB) throws ExceptionPorteAChanger{
        S.setB(inputB);
        R.setB(S.outputQ());
    }

    public void setR(boolean inputA) throws ExceptionPorteAChanger{
        R.setA(inputA);
        S.setA(R.outputQ());
    }

    public String print() throws ExceptionPorteAChanger{
        return "R: " +getR()+ " S: " +getS()+ "\nQ: " +getQ()+ " NQ: " + getNonQ() + "\nCycle R: " + R.getCycle() +"/"+R.getMaxCycle()+ "\nCycle S: " + S.getCycle() +"/"+S.getMaxCycle(); 
    }
    
    public static void main(String[] args) throws ExceptionPorteAChanger {
        BasculeRS bRs = new BasculeRS(true, false, 10);
        System.out.println(bRs.getNonQ());
        System.out.println(bRs.getQ());
        bRs.setR(false);
        System.out.println(bRs.print());
    }

}