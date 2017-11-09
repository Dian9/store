package id.zaura.marketplace.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public void homepage(){}
    
    @GetMapping("/index")
    public void homeindex(){}
}
