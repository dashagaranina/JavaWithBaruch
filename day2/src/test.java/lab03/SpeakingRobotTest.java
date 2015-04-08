package lab03;

import foo.bar.lab03.SpeakingRobot;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:context03.xml")
public class SpeakingRobotTest {

    @Autowired
    private SpeakingRobot robot;

    @Test
    public void speakingRobotTest(){
        assertNotEquals(robot.speak(), robot.speak());
    }
}
