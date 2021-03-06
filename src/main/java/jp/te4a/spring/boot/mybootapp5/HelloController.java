package jp.te4a.spring.boot.mybootapp5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{
    
    @RequestMapping("/")
    public String index(Model model){
        //return "this is Spring Boot sample";
        model.addAttribute("msg", "this is a setting message");
        return "index";
    }
    
    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public ModelAndView postForm(@RequestParam("text1") String text1){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("msg", String.format("you write %s!!!",text1));
        System.out.println(mv);
        return mv;
    }
}