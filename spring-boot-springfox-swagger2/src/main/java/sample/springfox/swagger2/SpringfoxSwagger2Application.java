package sample.springfox.swagger2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot集成Swagger2示例启动入口
 *
 * 说明：程序启动后，访问：http://localhost:8080/swagger-ui.html即可
 *
 */
@SpringBootApplication
public class SpringfoxSwagger2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringfoxSwagger2Application.class, args);
    }
}
