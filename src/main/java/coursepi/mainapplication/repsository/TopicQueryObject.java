package coursepi.mainapplication.repsository;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TopicQueryObject {

	
	@Id
	private String topicId;
	private String name;
	private String description;
	
	public TopicQueryObject(String id, String name, String description) {
		super();
		this.topicId = id;
		this.name = name;
		this.description = description;
	}
	
	public TopicQueryObject() {
		
	}
	public String getId() {
		return topicId;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	
}
