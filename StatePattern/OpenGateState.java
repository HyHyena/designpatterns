package StatePattern;

public class OpenGateState implements GateState{
    Gate gate;

    public OpenGateState(Gate gate) {
        this.gate = gate;
    }

    @Override
    public void enter() {

    }

    @Override
    public void payOk() {
        //let user in
        this.gate.changeState(new ClosedGateState(this.gate));
    }

    @Override
    public void pay() {

    }

    @Override
    public void payFailed() {

    }
}
