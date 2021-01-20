package CommandPattern;

public class LightDownCommand implements ICommand{
    Light light;

    public LightDownCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.dimDown();
    }

    @Override
    public void unexecute() {
        this.light.dimUp();
    }
}
