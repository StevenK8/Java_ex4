package logique;

public abstract class ExceptionPorteLogique extends Exception{

    private static final long serialVersionUID = 8810135675816470096L;

    public ExceptionPorteLogique(String message) {
        super(message);
    }
}