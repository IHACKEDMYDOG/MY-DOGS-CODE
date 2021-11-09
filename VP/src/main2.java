public class Main {
    public static void Main(String[] args) {
        double temperature = 23.5;
        System.out.println("t = " +
                new CelsiusConverter().getConvertedValue(temperature));
        System.out.println("t = " +
                new KelvinConverter().getConvertedValue(temperature));
        System.out.println("t = " +
                new FahrenheitConverter().getConvertedValue(temperature));
    }

    interface Converter {
        double getConvertedValue(double baseValue);
    }

    static class CelsiusConverter implements Converter {
        public double getConvertedValue(double baseValue) {
            return baseValue;
        }
    }

    static class KelvinConverter implements Converter {

        public double getConvertedValue(double baseValue) {
            return baseValue + 273.15;
        }
    }

    static class FahrenheitConverter implements Converter {
        public double getConvertedValue(double baseValue) {
            return 1.8 * baseValue + 32;
        }
    }
}