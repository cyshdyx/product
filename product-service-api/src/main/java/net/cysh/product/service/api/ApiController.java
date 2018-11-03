package net.cysh.product.service.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @RequestMapping("/api/say-hello")
    public String sayHello(){
        return "hello city!";
    }
}
