package inheritance;

public interface SymbianPhone {

    /**
     * Assume that this is early stage of creating mobile
     * <p>
     * Declare 3 methods sendText(), makeCall(), contactList()
     * Can a method contains method body in Interface?
     * Ans:
     */

    public void sendText();

    public default void makeCall() {

    }
}

