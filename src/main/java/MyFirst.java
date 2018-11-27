import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirst {
    @Test


    public static void main(String[] args) {
        Print print1 = new Print("Oдин клик на состояние блока ", "ok");
        Print print2 = new Print("Второй клик на состояние блока ", "ok");

        System.out.println(print1.output());
        System.out.println(print2.output());


        Assert.assertEquals(print1.output(), "Oдин клик на состояние блока ok");
        Assert.assertEquals(print2.output(), "Второй клик на состояние блока ok");
    }

}




