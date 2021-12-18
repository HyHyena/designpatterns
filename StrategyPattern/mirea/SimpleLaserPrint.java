package StrategyPattern.mirea;

public class SimpleLaserPrint implements ILaserPrintBehavior {
    @Override
    public String laserPrint() {
        return "Simply laser printing";
    }
}
