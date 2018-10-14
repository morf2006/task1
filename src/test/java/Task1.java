import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1 {
    private Double sumToPay = 372000.00;

    @Test
    public void firstTest() {
        Double loanAmount = 300000.00;
        Double interestForFirst10Years = 0.10;
        Double interestForSecond10Years = 0.08;
        Double interestForLast10Years = 0.06;


        sumAndCheck1(loanAmount, interestForFirst10Years, interestForSecond10Years, interestForLast10Years);
    }

    private void sumAndCheck1(Double loanAmount, Double interestForFirst10Years, Double interestForSecond10Years,
                              Double interestForLast10Years) {
        Double sum = (loanAmount + (loanAmount * interestForFirst10Years) +
                (loanAmount * interestForSecond10Years) + (loanAmount * interestForLast10Years));
        Assertions.assertEquals(sumToPay, sum, "Amount is not correct");
    }
}