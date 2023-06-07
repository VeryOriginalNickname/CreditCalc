public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int money, months, result;
        float percent;


        money = 1_000_000;
        months = 12;
        percent = 9.99f;

        result = service.calculate(money, months, percent);
        System.out.println("Ежемесячная оплата от " + money + " с процентной ставкой " + percent + " на " + months + " месяц(ев), составит: " + result + " рублей");

        //money = 1_000_000;
        months = 24;
        //percent = 9.99f;

        result = service.calculate(money, months, percent);
        System.out.println("Ежемесячная оплата от " + money + " с процентной ставкой " + percent + " на " + months + " месяц(ев), составит: " + result + " рублей");


        //money = 1_000_000;
        months = 36;
        //percent = 9.99f;

        result = service.calculate(money, months, percent);
        System.out.println("Ежемесячная оплата от " + money + " с процентной ставкой " + percent + " на " + months + " месяц(ев), составит: " + result + " рублей");
    }
}
