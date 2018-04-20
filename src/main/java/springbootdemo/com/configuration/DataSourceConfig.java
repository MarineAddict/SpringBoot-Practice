package springbootdemo.com.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("oracle")
public class DataSourceConfig {

	
	@Bean(name="dataSource")
	@Qualifier("dataSource")
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource getDataSource(){
		
		return DataSourceBuilder.create().build();
	}
	
	
}
	