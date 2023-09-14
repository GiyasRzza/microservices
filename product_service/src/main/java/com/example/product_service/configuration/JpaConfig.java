//package com.example.product_service.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//
////@Configuration
////public class JpaConfig {
////    @Bean
////    public EntityManagerFactory entityManagerFactory(DataSource dataSource) {
////        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
////        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
////        factory.setJpaVendorAdapter(vendorAdapter);
////        factory.setPackagesToScan("com.example.product_service");
////        factory.setDataSource(dataSource);
////        factory.afterPropertiesSet();
////        return factory.getObject();
////    }
//}
