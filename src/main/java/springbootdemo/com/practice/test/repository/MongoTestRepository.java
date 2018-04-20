package springbootdemo.com.practice.test.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import springbootdemo.com.practice.test.entity.MongoTestClass;

public interface MongoTestRepository extends MongoRepository<MongoTestClass,Integer>{
	
	List<MongoTestClass> findByName(String name);
	
	
	void deleteByName(String name);

}
