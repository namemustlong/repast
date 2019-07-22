package plant.repastapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@ComponentScan(value ={"com.repast","plant.repastapi"})
public class RepastApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RepastApiApplication.class, args);
    }

}
