package coursepi.mainapplication.events;

public class TopicCreatedEvent {

	private String id;
	private String name;
	private String description;
	public TopicCreatedEvent(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
 
}
