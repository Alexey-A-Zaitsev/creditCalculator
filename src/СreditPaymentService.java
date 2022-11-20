public class СreditPaymentService {

    double i = 9.99 / 12 / 100; // Месячная процентная ставка

    public double calculate(double n) {
        double result;
        result = i * (Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1); // Расчет коэффициента аннуитета
        return result;
    }

}
