package mdcininfrm.mdcininfrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MdcinInfrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(MdcinInfrmApplication.class, args);
    }

}
