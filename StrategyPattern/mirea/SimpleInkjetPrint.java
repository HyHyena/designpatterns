package StrategyPattern.mirea;

public class SimpleInkjetPrint implements IInkjetPrintBehavior {
    @Override
    public String inkjetPrint() {
        return "Simply inkjet printing";
    }
}
