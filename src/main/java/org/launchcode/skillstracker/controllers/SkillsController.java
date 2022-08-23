package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class SkillsController {

    @GetMapping
    @ResponseBody
    public String languages(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</lo>" +
                "<form action='/form'>" +
                "<input type='submit' value= 'SUBMIT'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String languagesForm(){
        return "<html>"+
                "<body>"+
                "<form action='skills'>"+ // submit a request to //hello
                "<h2>Name:</h2>" +
                "<input type='text' name='name' method='post'>" +
                "<h2>My favorite language:</h2>" +
                "<select name='language1'>" +
                "   <option value='Java'>Java</option >" +
                "   <option value='JavaScript'>JavaScript</option >" +
                "   <option value='Python'>Python</option >" +
                " </select >" +
                "<h2>My second favorite language:</h2>" +
                "<select name='language2'>" +
                "   <option value='Java'>Java</option >" +
                "   <option value='JavaScript'>JavaScript</option >" +
                "   <option value='Python'>Python</option >" +
                "</select>" +
                "<h2>My third favorite language:</h2>" +
                "<select name='language3'>" +
                "   <option value='Java'>Java</option >" +
                "   <option value='JavaScript'>JavaScript</option >" +
                "   <option value='Python'>Python</option >" +
                "</select><br><br>" +
                "<input type='submit' value= 'SUBMIT'>" +
                "</form>" +
                "</body>" +
                "<html>";
    }

    @GetMapping("skills")
    @ResponseBody
    public String Skills(@RequestParam String name, String language1, String language2, String language3){
        return "<html>" +
                "<head>" +
                "<style>" +
                "h2 {color:blue;" +
                "margin-left: 30px;}" +
                "</style>" +
                "</head>" +
                "<body>" +
                "<h1 >"+name+"</h1>" +
                "<h2 style.marging> 1. "+language1+ "</h2>" +
                "<h2> 2. "+language2+"</h2>" +
                "<h2> 3. "+language3+"</h2>"+
                "</body>" +
                "</html>";
    }
}
