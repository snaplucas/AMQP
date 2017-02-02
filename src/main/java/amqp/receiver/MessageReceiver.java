package amqp.receiver;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

    @Async
    @RabbitListener(queues = "teste", containerFactory = "rabbitListenerContainerFactory")
    public void handler(Message message) {
        System.out.println(new String(message.getBody()));
    }
}
