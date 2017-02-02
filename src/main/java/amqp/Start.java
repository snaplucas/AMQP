package amqp;

import amqp.sender.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Start implements CommandLineRunner {

    private final MessageSender messageSender;

    @Autowired
    public Start(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    @Override
    public void run(String... strings) throws Exception {
        messageSender.sendMessage("teste", "mensagem teste");
    }
}
