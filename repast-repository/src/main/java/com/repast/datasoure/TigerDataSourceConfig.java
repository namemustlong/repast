package com.repast.datasoure;

import com.alibaba.druid.pool.DruidDataSource;
import com.repast.conf.DataSourceProperties;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author li.wei
 * @date 2019-07-22
 */
public class TigerDataSourceConfig {
    @Autowired
    private DataSourceProperties properties;

    @Primary
    @Bean(name = "tigerDataSource" ,destroyMethod = "close")
    public DruidDataSource dataSource() throws SQLException {
        DruidDataSource tigerDataSource = new DruidDataSource();
        tigerDataSource.setUrl(properties.getTigerUrl());
        tigerDataSource.setUsername(properties.getTigerUserName());
        tigerDataSource.setPassword(properties.getTigerPassWord());
        tigerDataSource.setFilters("mergeStat");
        tigerDataSource.setMaxActive(200);
        tigerDataSource.setInitialSize(10);
        tigerDataSource.setMaxWait(60000);
        tigerDataSource.setMinIdle(10);
        tigerDataSource.setTimeBetweenEvictionRunsMillis(60000);
        tigerDataSource.setMinEvictableIdleTimeMillis(300000);
        tigerDataSource.setValidationQuery("SELECT 'x'");
        tigerDataSource.setTestWhileIdle(true);
        tigerDataSource.setTestOnBorrow(false);
        tigerDataSource.setTestOnReturn(false);
        tigerDataSource.setRemoveAbandoned(true);
        tigerDataSource.setRemoveAbandonedTimeout(1800);
        tigerDataSource.setLogAbandoned(false);
        tigerDataSource.setUseGlobalDataSourceStat(true);
        return tigerDataSource;
    }

    /**
     * 数据源事务管理器
     *
     * @return
     */
    @Bean(name = "tigerDataSourceTransactionManager")
    public DataSourceTransactionManager getTransactionManager(@Qualifier("tigerDataSource") DataSource tigerDataSource) {
        return new DataSourceTransactionManager(tigerDataSource);
    }

    /**
     * 编程式事务
     *
     * @return
     */
    @Bean(name = "tigerTransactionTemplate")
    public TransactionTemplate getTransactionTemplate(@Qualifier("tigerDataSourceTransactionManager") DataSourceTransactionManager tigerDataSourceTransactionManager) {
        TransactionTemplate transactionTemplate = new TransactionTemplate();
        transactionTemplate.setTransactionManager(tigerDataSourceTransactionManager);
        return transactionTemplate;
    }

    @Bean(name = "tigerSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean(@Qualifier("tigerDataSource") DataSource dataSource) throws Exception {

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:mapper/*Mapper.xml"));
        sqlSessionFactoryBean.setTypeAliases(new Class[]{String.class,Integer.class,Long.class, BigDecimal.class, Map.class, List.class});
        sqlSessionFactoryBean.setVfs(SpringBootVFS.class);
        return sqlSessionFactoryBean.getObject();
    }
    @Bean(name = "tigerSqlSessionTemplate")
    public SqlSessionTemplate getSqlSessionTemplate(@Qualifier("tigerSqlSessionFactory") SqlSessionFactory factory) {
        return new SqlSessionTemplate(factory);
    }
}
