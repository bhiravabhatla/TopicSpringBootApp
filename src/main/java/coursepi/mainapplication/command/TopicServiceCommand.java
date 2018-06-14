package coursepi.mainapplication.command;


import coursepi.mainapplication.events.TopicCreatedEvent;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;


public class TopicServiceCommand {


    private String name;
    private String description;

    public TopicServiceCommand() {

    }

    public TopicServiceCommand(String id, String name, String description) {


        this.name = name;
        this.description = description;
    }


    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }


}
