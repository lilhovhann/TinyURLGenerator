package tiny.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import tiny.TinyApplication;
import tiny.services.TinyUrlService;

/**
 *
 * @author lilith
 */
@RunWith(SpringRunner.class)
@AutoConfigureWebMvc

public class TinyUrlServiceTest {

    @Autowired
    private TinyUrlService tinyUrlService;
    
    @Test
    public void hello(){
         System.out.println("Hey");
    }

//    @Test
//    public void letsTest() throws Exception {
////        String result = tinyUrlService.letsTest("Lilit");
//        System.out.println("Hey");
////        Assert.assertEquals("Hi Lilit", result);
//    }

    @Before
    public void setUp() throws Exception {
        System.out.println("I am before");
    }

    public String letsTest(String name) {
        return "Hi " + name;
    }
}
