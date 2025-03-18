package BankAccountSystem.Utility;

public class IntrestCalculator {
    public static double generalIntrestCalculator(double amount, int months, double rateOfIntrest) {
        double PRT = amount * rateOfIntrest * (months / 12);
        return PRT / 100;
    }
}
