package logique;

public class ExceptionPorteAChanger extends ExceptionPorteLogique{

    private static final long serialVersionUID = 1300608015837556034L;

    public ExceptionPorteAChanger(String message) {
        super("Porte à changer | " + message);
    }
}