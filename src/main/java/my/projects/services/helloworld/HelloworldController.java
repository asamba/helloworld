package my.projects.services.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by asamba on 8/31/19.
 */
@RestController
public class HelloworldController {

    @GetMapping("/hello")
    public String sayHelloworld(){
        return "Hello World!";
    }
}
