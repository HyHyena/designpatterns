package StrategyPattern.mirea;

public class ComplexInkjetPrint implements IInkjetPrintBehavior {
    @Override
    public String inkjetPrint() {
        return "Complex inkjet printing";
    }
}
