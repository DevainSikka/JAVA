package exceptions;
public class TryCatch extends Exception {
    public TryCatch() {
        super("This is testing ");
    }

    public void ThrowsException() throws TryCatch {
        throw new TryCatch();
    }

    public static void main(String args[]) {
        TryCatch tryCatch = new TryCatch();
        try {
            tryCatch.ThrowsException();
        } catch (TryCatch tryCatch2) {
            System.out.println("in try Catch ");
        }
    }
}
