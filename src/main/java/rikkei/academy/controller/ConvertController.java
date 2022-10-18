package rikkei.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import rikkei.academy.model.Money;

@Controller
public class ConvertController {
    @RequestMapping("/")
    public String index (Model model){
        Money money = new Money();
        model.addAttribute("money", money);
        return "index";
    }
    @PostMapping("/convert")
    public ModelAndView convert(Money money){
        Double vnd = money.getUsd()*money.getRate();
        money.setVnd(vnd);
        ModelAndView modelAndView = new ModelAndView("/index");

        return modelAndView;
    }
}
