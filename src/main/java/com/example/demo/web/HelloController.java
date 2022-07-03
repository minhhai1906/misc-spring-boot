package com.example.demo.web;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class HelloController {
    @RequestMapping(value = "/basic")
    public String sayHello(){
        return "<h1>hello</h1>";
    }

    @RequestMapping(value = "/proper")
    public String sayProperHello(){
        return "<h1>hello, how are you?</h1>";
    }

    @RequestMapping("/user_entry")
    public String userForm(){
        return "<form action=\"/greeting/user_greeting\" method=GET>\n" +
                "  <label for=\"fname\">First name:</label><br>\n" +
                "  <input type=\"text\" id=\"fname\" name=\"fname\"><br>\n" +
                "  <label for=\"lname\">Last name:</label><br>\n" +
                "  <input type=\"text\" id=\"lname\" name=\"lname\"><br><br>\n" +
                "  <input type=\"submit\" value=\"Submit\">\n" +
                "</form> ";
    }

    @RequestMapping(value = "/user_greeting", method = RequestMethod.GET)
    public String handle(@RequestParam("fname") String firsName, @RequestParam("lname") String lastName){
        return "Hello there, " + firsName + " " + lastName;
    }

    @RequestMapping("/orders/{id}")
    public String getOrder(@PathVariable String id){
        return "Order ID " + id;
    }
}
