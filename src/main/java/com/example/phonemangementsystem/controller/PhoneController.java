package com.example.phonemangementsystem.controller;

import com.example.phonemangementsystem.model.Phone;
import com.example.phonemangementsystem.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class PhoneController {

    @Autowired
    private PhoneService phoneService;

    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listPhones", phoneService.getAllPhones());
        return "index";
    }

    @GetMapping("/showNewPhoneForm")
    public String showNewPhoneForm(Model model){
        Phone phone =new Phone();
        model.addAttribute("phone", phone);
        return "new_phone";

    }

    @PostMapping("/savePhone")
    public String savePhone(@ModelAttribute("phone") Phone phone){
        phoneService.savePhone(phone);
        return "redirect:/";

    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model){
        Phone phone = phoneService.getPhonebyId(id);

        model.addAttribute("phone",phone);
        return "update_phone";

    }

    @GetMapping("/deletePhone/{id}")
    public String deletePhone(@PathVariable(value = "id") long id){
        this.phoneService.deletePhoneById(id);
        return "redirect:/";

    }

}
