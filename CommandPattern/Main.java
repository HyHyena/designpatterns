package CommandPattern;

import java.util.Stack;

public class Main {

    public static Stack<ICommand> commandStack;

    public static void main(String[] args) {
        commandStack = new Stack<>();
        Light light = new Light();
        LightInvoker lightInvoker = new LightInvoker(new LightOnCommand(light), new LightOffCommand(light),
                new LightDownCommand(light), new LightUpCommand(light), commandStack);
        lightInvoker.clickOn();
        lightInvoker.clickDimUp();
        lightInvoker.undo();
        lightInvoker.undo();
    }

}
