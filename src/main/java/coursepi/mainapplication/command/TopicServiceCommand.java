package coursepi.mainapplication.command;


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
