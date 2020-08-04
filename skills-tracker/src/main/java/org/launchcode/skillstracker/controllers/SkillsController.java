package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @RequestMapping
    public String displaySkills(){
        String html="<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>PHP</li>" +
                "<li>C++</li>" +
                "</ol>";
        return html;
    }
    @GetMapping(value="form")
    public String displayFormSkills(){
        String html = "<form method='post'>" +
                "Name:<br><input type = 'text' name='name' />" +
                "<br>My favorite language:" +
                "<br><select name='language1' id = 'language1'>" +
                "<option value ='Java'>Java</option>" +
                "<option value ='JavaScript'>JavaScript</option>" +
                "<option value ='Python'>Python</option>" +
                "</select>" +
                "<br>My second favorite language:" +
                "<br><select name='language2' id = 'language2'>" +
                "<option value ='Java'>Java</option>" +
                "<option value ='JavaScript'>JavaScript</option>" +
                "<option value ='Python'>Python</option>" +
                "</select>" +
                "<br>My third favorite language:" +
                "<br><select name='language3' id = 'language3'>" +
                "<option value ='Java'>Java</option>" +
                "<option value ='JavaScript'>JavaScript</option>" +
                "<option value ='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<input type = 'submit' value = 'Submit' />" +
                "</form>";
        return html;
    }
    @PostMapping(value="form")
    public String namepage(@RequestParam String name, String language1, String language2, String language3) {
        String html = "<h1>"+name+"</h1>" +
                "<ol>" +
                "<li>"+language1+"</li>" +
                "<li>"+language2+"</li>" +
                "<li>"+language3+"</li>" +
                "</ol>";
        return html;
    }
}
