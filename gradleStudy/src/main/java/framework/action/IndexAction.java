package framework.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexAction{
    
    @RequestMapping("index/*")
    public ModelAndView Index(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("pages/common/frame.html");
        return mav;
    }
}