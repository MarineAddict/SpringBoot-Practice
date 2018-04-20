package springbootdemo.com.practice.test.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import springbootdemo.com.practice.test.entity.TestClass;


public interface TestRepository extends JpaRepository<TestClass, Integer>{
	
	public List<TestClass> findByAge(Integer age);
	
	@Query(value="delete from student where age=?1",nativeQuery=true)
	@Modifying
	@Transactional
	public void deleteByAge(Integer age);
	
	
	
}
