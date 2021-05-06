package com.example.submissionformdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Optional;

@Controller
public class FormController {
    @Autowired
    CustomerRepo repo;


    @RequestMapping("/")
    public ModelAndView showForm() {
        return new ModelAndView("edureka");
    }

    @RequestMapping("/view")
    public ModelAndView viewForm(int id, String name, String email, ModelMap modelMap, Customer customer) {
        ModelAndView mv = new ModelAndView("viewform");
        modelMap.put("id", id);
        modelMap.put("name", name);
        modelMap.put("email", email);
        mv.addObject(modelMap);
        repo.save(customer);
        return mv;
    }

    @RequestMapping("/CustomerList")
    public ModelAndView getAllCustomers(ModelMap modelMap) {
        ModelAndView mv = new ModelAndView("customerlist");
        modelMap.put("customers", repo.findAll());
        return mv;
    }

    @RequestMapping("/CustomerList/{id}")
    @ResponseBody
    public Optional<Customer> getCustomer(ModelMap modelMap, @PathVariable("id") int id) {
        return repo.findById(id);
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
