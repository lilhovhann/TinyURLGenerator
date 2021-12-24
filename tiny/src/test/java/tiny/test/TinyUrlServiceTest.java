package tiny.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tiny.services.TinyUrlService;

/**
 *
 * @author lilith
 */
@RunWith(SpringRunner.class)
@AutoConfigureWebMvc
public class TinyUrlServiceTest {

    private TinyUrlService tinyUrlService = new TinyUrlService();

    @Test
    public void letsTest() {
        String result = tinyUrlService.letsTest("Lilit");
        System.out.println("Hey");
        Assert.assertEquals("Hi Lilit", result);
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("I am before");
    }

    public String letsTest(String name) {
        return "Hi " + name;
    }
}
