package run.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import query.Queries;
import query.QueryExec;


@RestController
public class QueryController {
	private Queries querystrings = new Queries();
	private QueryExec qEx = new QueryExec();
	
	@GetMapping(value="/UserSkillQuery/")
	public LinkedList<ArrayList<String>> UserSkillQuery() {
		return qEx.execQuery(querystrings.UserSkill());
	}
	
	@GetMapping(value="/UserSkillQuery/{id}")
	public LinkedList<ArrayList<String>> UserSkillQuery(@PathVariable String id) {
		return qEx.execQuery(querystrings.UserSkill(id));
	}
	
	
	
	@GetMapping(value="/UserSkillInterestQuery/")
	public LinkedList<ArrayList<String>> UserSkillInterestQuery() {
		return qEx.execQuery(querystrings.UserSkillInterest());
	}
	
	@GetMapping(value="/UserSkillInterestQuery/{id}")
	public LinkedList<ArrayList<String>> UserSkillInterestQuery(@PathVariable String id) {
		return qEx.execQuery(querystrings.UserSkillInterest(id));
	}
	
	
	
	@GetMapping(value="/ProjectUserSkillQuery/{id}")
	public LinkedList<ArrayList<String>> ProjectUserSkillQuery(@PathVariable String id) {
		return qEx.execQuery(querystrings.ProjectUserSkill(id));
	}
	
	@GetMapping(value="/ProjectUserSkillQuery/")
	public LinkedList<ArrayList<String>> ProjectUserSkillQuery() {
		return qEx.execQuery(querystrings.ProjectUserSkill());
	}
	
	
	
	
	@GetMapping(value="/ProjectUserInterestQuery/{id}")
	public LinkedList<ArrayList<String>> ProjectUserInterestQuery(@PathVariable String id) {
		return qEx.execQuery(querystrings.ProjectUserInterest(id));
	}
	
	@GetMapping(value="/ProjectUserInterestQuery/")
	public LinkedList<ArrayList<String>> ProjectUserInterestQuery() {
		return qEx.execQuery(querystrings.ProjectUserInterest());
	}
	
	
	@GetMapping(value="/test/{id}")
	public String test(@PathVariable String id) {
		String res="{\"id\":"+id+",\"content\":\"Hello, World!\"}";
		return res;
	}

}
