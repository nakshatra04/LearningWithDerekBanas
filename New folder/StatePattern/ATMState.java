package StatePattern;

/**
 * Created by Sohrab-PC on 12/15/2016.
 */
public interface ATMState {

    // Different states expected
    // HasCard, NoCard, HasPin, NoCash

    void insertCard();

    void ejectCard();

    void insertPin(int pinEntered);

    void requestCash(int cashToWithdraw);

}