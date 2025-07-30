package ut.edu.nhom_qtda;

import nz.net.ultraq.thymeleaf.layoutdialect.LayoutDialect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NhomQtdaApplication {

    public static void main(String[] args) {
        SpringApplication.run(NhomQtdaApplication.class, args);
    }
    @Bean
    public LayoutDialect layoutDialect() {
        return new LayoutDialect();
    }
}


