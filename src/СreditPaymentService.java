public class СreditPaymentService {

    public double calculate(double numberMonths) {
        double monthlyInterestRate = 9.99 / 12 / 100; // Месячная процентная ставка
        double result;
        result = monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, numberMonths))
                / (Math.pow(1 + monthlyInterestRate, numberMonths) - 1); // Расчет коэффициента аннуитета
        return result;
    }
}
