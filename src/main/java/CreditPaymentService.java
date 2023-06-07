public class CreditPaymentService {

    public int calculate(int money, int months, float yearP) {

        float monthP = yearP / 12 / 100;

        float a = (float) Math.pow((1 + monthP), months);
        float Coe = monthP * a / ((a) - 1);

        float result = Coe * money;

        return ((int) result);
    }
}
