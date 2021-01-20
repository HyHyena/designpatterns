package StatePattern;

public interface GateState {
    void enter();
    void payOk();
    void pay();
    void payFailed();
}
