import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

public class TestCode {
    @Test
    public void testSpain() throws Exception {
        String result = Main.Spain("Oleg");
        Assert.assertEquals("Hola,Oleg", result);
    }

    @Test
    public void testGermany() throws Exception {
        String result = Main.Germany("Oleg");
        Assert.assertEquals("Halo,Oleg", result);
    }

    @Test
    public void testIsOksana() throws Exception {
        String result = Main.IsOksana("Oksana");
        Assert.assertEquals("Wow! You are Oksana!", result);
    }

    @Test
    public void testIsNotOksana() throws Exception {
        String result = Main.IsOksana("Oleg");
        Assert.assertEquals("Meh... You are not Oksana...", result);
    }
}
