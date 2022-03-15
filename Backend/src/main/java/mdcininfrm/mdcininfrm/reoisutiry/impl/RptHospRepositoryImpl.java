package mdcininfrm.mdcininfrm.reoisutiry.impl;

import mdcininfrm.mdcininfrm.reoisutiry.RptHospRepository;
import org.springframework.beans.factory.annotation.Value;

public class RptHospRepositoryImpl implements RptHospRepository {

    @Value("${rort.hosp.key}")
    private String apiKey;
    //https://docs.spring.io/spring-framework/docs/current/reference/html/web-reactive.html#webflux-client
    @Override
    public void getOpenApi() {

    }
}
