package coursepi.mainapplication.controllers;


import coursepi.mainapplication.command.TopicServiceCommand;
import coursepi.mainapplication.repsository.TopicQueryObject;
import coursepi.mainapplication.repsository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController

public class TopicController {

	
	@Autowired
	private TopicRepository topicRepository;


	//Comments
	@GetMapping("/")
	public List<TopicQueryObject> getAllTopics() {
		return topicRepository.findAll();

	}
	
	@RequestMapping(method=RequestMethod.GET, value ="/{id}")
	public TopicQueryObject getTopic(@PathVariable String id) {
		return topicRepository.findByTopicId(id);
		
	}	
	
	@PostMapping("/create")
	public String createTopic(@RequestBody TopicServiceCommand topic) {
	 
		String id = UUID.randomUUID().toString();
		topicRepository.save(new TopicQueryObject(id,topic.getName(),topic.getDescription()));
		return  id;
	}

}
