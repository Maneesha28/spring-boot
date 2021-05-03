package com.example.submissionformdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
    @Autowired
    CustomerRepo repo;

    @RequestMapping("/")
    public ModelAndView showForm() {
        return new ModelAndView("edureka");
    }

    @RequestMapping("/view")
    public ModelAndView viewForm(int id, String name, String email, ModelMap modelMap) {
        ModelAndView mv = new ModelAndView("viewform");
        modelMap.put("id", id);
        modelMap.put("name", name);
        modelMap.put("email", email);
        mv.addObject(modelMap);
        //taking customer as the function parameter and directly saving to repo gives null value for email.
        // that's why manually added all the value.
        Customer customer = new Customer();
        customer.setId(id);
        customer.setMail(email);
        customer.setName(name);
        repo.save(customer);
        return mv;
    }

/*    @GetMapping("form")
    public ModelAndView showForm(ModelMap modelMap) {
        return new ModelAndView("edureka");
    }
    @PostMapping("view")
    public ModelAndView viewForm(int id, String name, String email, ModelMap modelMap) {
        ModelAndView mv = new ModelAndView("viewform");
        modelMap.put("id", id);
        modelMap.put("name", name);
        modelMap.put("email", email);
        mv.addObject(modelMap);
        return mv;
    }*/
}
