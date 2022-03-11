package mdcininfrm.mdcininfrm.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
public class RestApiController {


    @PostMapping("/rpt/hosp")
    public void rptHosp() {
    }

}
