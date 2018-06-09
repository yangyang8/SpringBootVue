package com.hailong.config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 进行了自已注入了c3p0的数据源的操作
 * @author Administrator
 *
 */


@Configuration  //是一个配置类
public class C3P0DataSourceConfig {
	//进行取出我们的配置的值
	@Value("${spring.datasource.driverClassName}")
	private String driverClassName;
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;
	
	@Bean
	public DataSource getC3P0DataSource(){
		ComboPooledDataSource cmp=new ComboPooledDataSource();
		try {
			cmp.setDriverClass(driverClassName);
			cmp.setJdbcUrl(url);
			cmp.setUser(username);
			cmp.setPassword(password);
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
		return cmp;
	}

}
