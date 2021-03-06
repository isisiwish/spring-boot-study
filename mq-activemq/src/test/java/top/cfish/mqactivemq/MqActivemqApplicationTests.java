package top.cfish.mqactivemq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.cfish.mqactivemq.producer.Producer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MqActivemqApplicationTests
{
    @Autowired
    private Producer producer;
    
    @Test
    public void sendSimpleQueueMessage() throws InterruptedException
    {
        for (int i = 0; i < 100; i++)
        {
            this.producer.sendQueue("Test queue message " + i);
        }
        Thread.sleep(1000L);
    }
    
    @Test
    public void sendSimpleTopicMessage() throws InterruptedException
    {
        for (int i = 0; i < 100; i++)
        {
            this.producer.sendTopic("Test Topic message " + i);
        }
        Thread.sleep(1000L);
    }
}
