package com.southwind.controller;

import com.southwind.entity.Authority;
import com.southwind.entity.AuthorityVO;
import com.southwind.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/authority")
public class AuthorityHandler {

    @Autowired
    private AuthorityService authorityService;

    @RequestMapping("/findAll")
    @ResponseBody
    public AuthorityVO findAll(int page,int limit){
        AuthorityVO authorityVO = new AuthorityVO();
        authorityVO.setCode(0);
        authorityVO.setMsg("");
        authorityVO.setCount(authorityService.count());
        authorityVO.setData(authorityService.findAll(page,limit));
        return authorityVO;
    }

    @RequestMapping("/saveOrUpdate")
    public String saveOrUpdate(Authority authority){
        authorityService.save(authority);
        return "redirect:/authority_index.html";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam("id") String id){
        authorityService.delete(id);
        return "redirect:/authority_index.html";
    }

    @RequestMapping("/find")
    public ModelAndView find(@RequestParam("id") String id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("authority",authorityService.find(id));
        modelAndView.setViewName("authority_update");
        return modelAndView;
    }

}