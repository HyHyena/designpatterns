package StrategyPattern.mirea;

public class Main {
    public static void main(String[] args) {
        Printer complexPrinter = new Printer(new ComplexLaserPrint(), new ComplexInkjetPrint());
        System.out.println(complexPrinter.laserPrint());
        System.out.println(complexPrinter.inkjetPrint());
        System.out.println();
        Printer simplePrinter = new Printer(new SimpleLaserPrint(), new SimpleInkjetPrint());
        System.out.println(simplePrinter.laserPrint());
        System.out.println(simplePrinter.inkjetPrint());
    }
}
