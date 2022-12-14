public class Main {
    public static void main(String[] args) {

        double loanAmount  = 1_000_000; // сумма займа
        СreditPaymentService service = new СreditPaymentService();

        System.out.println();
        System.out.println("Ежемесячный платеж по кредиту на срок 1 год составит:");
        System.out.printf("%.0f", service.calculate(12) * loanAmount);

        System.out.println();
        System.out.println();
        System.out.println("Ежемесячный платеж по кредиту на срок 2 года составит:");
        System.out.printf("%.0f", service.calculate(24) * loanAmount);

        System.out.println();
        System.out.println();
        System.out.println("Ежемесячный платеж по кредиту на срок 3 года составит:");
        System.out.printf("%.0f", service.calculate(36) * loanAmount);
    }
}
