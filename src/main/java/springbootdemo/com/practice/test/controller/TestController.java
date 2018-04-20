package springbootdemo.com.practice.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import springbootdemo.com.practice.test.entity.Book;
import springbootdemo.com.practice.test.entity.MongoTestClass;
import springbootdemo.com.practice.test.entity.TestClass;
import springbootdemo.com.practice.test.repository.MongoTestRepository;
import springbootdemo.com.practice.test.repository.TestRepository;

@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired
	private TestRepository testRepository;
	
	@Autowired
	private MongoTestRepository mongoTestRepository;
	
	@Autowired
	private Book book;
	
	
	@RequestMapping("/testjsp")
    @ResponseBody
	public String testJSP(){
	String s="test";	
		return s;
	}
	
	
	@RequestMapping("/findByAge/{age}")
	@ResponseBody
	public List<TestClass> getTestData(@PathVariable("age") String age){	
		return testRepository.findByAge(Integer.parseInt(age));
	}
	
	
	@RequestMapping(value="/saveTestData",method=RequestMethod.POST)
	@ResponseBody
	public Integer saveTestData(@RequestBody TestClass testClass){
		return testRepository.save(testClass).getId();
	}
	
	@RequestMapping(value="/deleteTestDataByAge/{age}",method=RequestMethod.POST)
	@ResponseBody
	public void deleteTestDataByAge(@PathVariable("age") String age){
		testRepository.deleteByAge(Integer.parseInt(age));
	}
	
	@RequestMapping(value="/updateTestData",method=RequestMethod.POST)
	@ResponseBody
	public void updateTestData(@RequestBody TestClass testClass){
		testRepository.saveAndFlush(testClass);
	}
	
	
	
	
	/*Mongo DB*/
	@RequestMapping(value="/mongoDBSearchByName/{name}",method=RequestMethod.POST)
	@ResponseBody
	public List mongoDBSearchByName(@PathVariable("name") String name){
		return mongoTestRepository.findByName(name);
	}
	
	@RequestMapping(value="/mongoDBSave",method=RequestMethod.POST)
	@ResponseBody
	public void mongoDBSearchByName(@RequestBody MongoTestClass mongoTestClass){
		 mongoTestRepository.save(mongoTestClass);
	}
	
	
	
	
	@RequestMapping(value="/mongoDBDeleteByName/{name}",method=RequestMethod.POST)
	@ResponseBody
	public void mongoDBDeleteByName(@PathVariable("name") String name){
		 mongoTestRepository.deleteByName(name);
	}
	
	@RequestMapping(value="/getbook")
	@ResponseBody
	public Book testYaml(){
		return book;	
	}
	
	
	
}

