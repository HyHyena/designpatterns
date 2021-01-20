package CommandPattern;

import java.util.Stack;

public class LightInvoker {

    private volatile Stack<ICommand> commandStack;

    private ICommand lightOn;
    private ICommand lightOff;
    private ICommand lightDimDown;
    private ICommand lightDimUp;

    public LightInvoker(ICommand lightOn, ICommand lightOff, ICommand lightDimDown, ICommand lightDimUp, Stack<ICommand> commandStack) {
        this.lightOn = lightOn;
        this.lightOff = lightOff;
        this.lightDimDown = lightDimDown;
        this.lightDimUp = lightDimUp;
        this.commandStack = commandStack;
    }

    public void undo(){
        commandStack.pop().unexecute();
    }

    public void clickOn(){
        this.lightOn.execute();
        commandStack.push(lightOn);
    }

    public void clickOff(){
        this.lightOff.execute();
        commandStack.push(lightOff);
    }

    public void clickDimDown(){
        this.lightDimDown.execute();
        commandStack.push(lightDimDown);
    }

    public void clickDimUp(){
        this.lightDimUp.execute();
        commandStack.push(lightDimUp);
    }

}
