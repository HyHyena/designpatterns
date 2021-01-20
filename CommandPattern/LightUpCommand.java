package CommandPattern;

public class LightUpCommand implements ICommand{
    Light light;

    public LightUpCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.dimUp();
    }

    @Override
    public void unexecute() {
        this.light.dimDown();
    }

}
