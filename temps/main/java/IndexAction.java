package framework.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.apache.poi.*;

@Controller
public class IndexAction{
    
    @RequestMapping("index/*")
    public ModelAndView Index(){
        final ModelAndView mav = new ModelAndView();
        mav.setViewName("pages/common/frame.html");cd
        return mav;
    }
}