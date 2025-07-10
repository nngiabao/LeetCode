package Math;

public class ConvertTemperature_2469 {
    public double[] convertTemperature(double celsius) {
        //Kelvin = Celsius + 273.15
        //Fahrenheit = Celsius * 1.80 + 32.0
        return new double[]{celsius + 273.15,(celsius * 1.8) + 32};
    }
}
