package com.elfn.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @PROJECT recipe
 * @Author Elimane on 12/06/2022
 */
@Controller
public class IndexController {
  @RequestMapping({"","/","index"})
  public String getIndexPage(){
    return "index";
  }
}
