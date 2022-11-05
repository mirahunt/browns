package com.browns;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DateController {

  @GetMapping("/date")
  public String dateForm(Model model) {
    model.addAttribute("date", new Date());
    return "date";
  }

  @PostMapping("/date")
  public String dateSubmit(@ModelAttribute Date date, Model model) {
    model.addAttribute("date", date);
    return "date";
  }

}