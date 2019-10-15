package logique;

public class ExceptionBasculeAReparer extends ExceptionPorteLogique{

    private static final long serialVersionUID = 7142728958546955614L;

    public ExceptionBasculeAReparer(String message) {
        super("Bascule à réparer | " + message);
    }
}