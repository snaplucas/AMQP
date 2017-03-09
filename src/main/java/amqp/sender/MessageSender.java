package amqp.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    private AmqpTemplate amqpTemplate;

    @Autowired
    public MessageSender(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    public void sendMessage(String queue, Object message) {
        amqpTemplate.convertAndSend(queue, message);
    }
}
