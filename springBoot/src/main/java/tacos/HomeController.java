package tacos;

import org.springframework.stereotype.Controller;
import org.springframewokr.web.bind.annotation.GetMapping;

@Controller
public class HomeController{
    @GetMapping("/")
    public String home(){
        return "home";
    }
}