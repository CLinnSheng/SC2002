public class UnkownOperatorException extends Exception {
    
    public UnkownOperatorException() {
        super("Unkown Operator");
    }

    public UnkownOperatorException(char op) {
        super(op + " is an unkown operator");
    }

    public UnkownOperatorException(String message) {
        super(message);
    }
}
