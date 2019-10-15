package logique;

public class BasculeRS{
    boolean Q, nonQ;
    Nor R,S;

    public BasculeRS(boolean inputA, boolean inputB) {
        R = new Nor(inputA, true);
        S = new Nor(false, inputB);
        // R.setA(inputA);
        // S.setB(inputB);
        // Q = updateQ();
        // nonQ = updateNonQ();
    }

    // public boolean updateQ(){
    //     R.setB(S.updateQ());
    //     Q = !(R.inputA() && S.outputQ());
    //     return Q;
    // }

    // public boolean updateNonQ(){
    //     S.setA(R.updateQ());
    //     nonQ = !(S.inputB() && R.outputQ());
    //     return nonQ;
    // }

    public boolean getS(){
        return S.inputB();
    }

    public boolean getR(){
        return R.inputA();
    }

    public boolean getQ(){
        return R.outputQ();
    }

    public boolean getNonQ(){
        return S.outputQ();
    }

    public void setS(boolean inputB){
        S.setB(inputB);
        R.setB(S.outputQ());
    }

    public void setR(boolean inputA){
        R.setA(inputA);
        S.setA(R.outputQ());
    }

    public String toString(){
        return "R: " +getR()+ " S: " +getS()+ "\nQ: " +getQ()+ " NQ: " + getNonQ(); 
    }
    
    public static void main(String[] args) {
        BasculeRS bRs = new BasculeRS(true, false);
        System.out.println(bRs.getNonQ());
        System.out.println(bRs.getQ());
        bRs.setR(false);
        // bRs.setS(true);
        System.out.println(bRs.getNonQ());
        System.out.println(bRs.getQ());
        System.out.println(bRs.toString());
    }

}