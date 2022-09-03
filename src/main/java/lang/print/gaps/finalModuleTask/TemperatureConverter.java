package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        double x = (double) temperatureCelsius * 1.8;

        System.out.println(x + 32);
    }
}
