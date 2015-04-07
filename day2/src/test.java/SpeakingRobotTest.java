import foo.bar.lab03.SpeakingRobot;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotEquals;

public class SpeakingRobotTest {

    @Test
    public void speakingRobotTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context03.xml");
        SpeakingRobot robot = context.getBean(SpeakingRobot.class);
        assertNotEquals(robot.speak(), robot.speak());
    }
}
