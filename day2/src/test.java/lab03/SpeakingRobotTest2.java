package lab03;

import foo.bar.lab03.AppConfig;
import foo.bar.lab03.Robot;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class SpeakingRobotTest2 {

    @Autowired
    private Robot robot;

    @Test
    public void testRandomQuoter(){
        Assert.assertNotEquals(robot.speak(), robot.speak());
    }
}
