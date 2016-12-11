import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by simple on 2016/12/10.
 */
public class Test1 {
    public static Logger logger= LoggerFactory.getLogger(Test1.class);
    @Test
    public void testShow(){
      System.out.println("TestShow");
        logger.info("dkdkdjkldj");
    }
}
