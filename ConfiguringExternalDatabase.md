# Configuring Mysql database

Steps are as below

    1. Add dependency for mysql in pom.xml file.
    
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>5.1.36</version>
        </dependency>
     
    2. Add the datasource in the properties file.
    
    spring.jpa.hibernate.ddl-auto=none
    
    spring.datasource.url=jdbc:mysql://localhost/tcrmd00
    spring.datasource.username=root
    spring.datasource.password=root
    spring.datasource.driver-class-name=com.mysql.jdbc.Driver