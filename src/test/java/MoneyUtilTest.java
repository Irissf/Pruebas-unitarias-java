import org.junit.Assert;
import org.junit.Test;

public class MoneyUtilTest {

    @Test
    public void moneyTest(){
        String money = MoneyUtil.format(1000);
        //primer parámetro lo que esperamos recibir, segundo, lo que recibimos
        Assert.assertEquals("$1000.0",money);
    }

    @Test
    public void negativeMoneyTest(){
        String money = MoneyUtil.format(-1000);
        Assert.assertEquals("$-1000.0",money);
    }

    @Test
    public void euroMoneyTest(){
        String money = MoneyUtil.format(1000 , "€");
        Assert.assertEquals("1000.0€",money);
        /* Tenemos más opciones con Assert como diferente que, not null, etc*/
    }

    //si no pone simbolo, esperamos que llegue un error
    @Test(expected = IllegalArgumentException.class)
    public void notNullMoneyTest(){
        String money = MoneyUtil.format(1000 , null);
    }
}
