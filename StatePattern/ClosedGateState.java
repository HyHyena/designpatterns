package StatePattern;

public class ClosedGateState implements GateState{
    Gate gate;

    public ClosedGateState(Gate gate) {
        this.gate = gate;
    }

    @Override
    public void enter() {

    }

    @Override
    public void payOk() {

    }

    @Override
    public void pay() {

    }

    @Override
    public void payFailed() {

    }
}
