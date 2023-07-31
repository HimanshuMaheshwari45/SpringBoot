package com.test.myfirstapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class firstController {

  @RequestMapping("/test")
  @ResponseBody
  public String handle(){
    return "this is first controller i am creating in VS Code and showing that on web page also checking the spring Devtools works or not";
  }
  
}
