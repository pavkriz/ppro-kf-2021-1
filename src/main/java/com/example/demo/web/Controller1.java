package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class Controller1 {
    @RequestMapping("/a1")
    public void action1(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("Hello <b>world</b> 2");
    }

    @RequestMapping("/a2")
    public String action2(Model model) {
        model.addAttribute("personName", "Pavel");
        return "template1";
    }
}
