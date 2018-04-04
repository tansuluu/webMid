package kg.edu.iaau.com.controller;

import kg.edu.iaau.com.dao.DaoCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @Autowired
    DaoCustomer daoCustomer;

    @RequestMapping("/")
    public String viewCustomers(Model model)
    {
        model.addAttribute("customers", daoCustomer.getCustomers());
        return "index";
    }
    @RequestMapping("/customerDetail")
    public String viewcustomerDetails(@RequestParam(name = "id", required = false,defaultValue ="1") int id, Model model){
        model.addAttribute("customer",daoCustomer.getCustomers(id));
        return "customerDetails";
    }



    }
