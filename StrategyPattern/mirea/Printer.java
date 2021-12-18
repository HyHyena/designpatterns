package StrategyPattern.mirea;

public class Printer {
    ILaserPrintBehavior iLaserPrintBehavior;
    IInkjetPrintBehavior iInkjetPrintBehavior;

    public Printer(ILaserPrintBehavior iLaserPrintBehavior, IInkjetPrintBehavior iInkjetPrintBehavior) {
        this.iLaserPrintBehavior = iLaserPrintBehavior;
        this.iInkjetPrintBehavior = iInkjetPrintBehavior;
    }

    public String laserPrint(){
        return iLaserPrintBehavior.laserPrint();
    }

    public String inkjetPrint(){
        return iInkjetPrintBehavior.inkjetPrint();
    }
}
