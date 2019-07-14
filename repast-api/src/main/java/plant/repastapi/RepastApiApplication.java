package plant.repastapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class RepastApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RepastApiApplication.class, args);
    }

}
