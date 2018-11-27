package dia.test.csssr;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Click {

    @Test
    public static String output(String operation) {
        String result = "ок";
        String outp = operation + result;
        return outp;
    }

    public static void main(String[] args) {
        String str = output("Oдин клик на состояние блока ");
        Assert.assertEquals(str, "Oдин клик на состояние блока ок");
        String tre = output("Второй клик на состояние блока ");
        Assert.assertEquals(tre, "Второй клик на состояние блока ок");


    }

}



