package com.samina.MVCweb.Controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController{

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("errorMsg", "Your username and password are invalid.");

        if (logout != null)
            model.addAttribute("msg", "You have been logged out successfully.");

        return "login";
    }


    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String showDashboard(ModelMap model) {
        model.put("name", getLoggedInUserName());
        return "dashboard";
    }

    private String getLoggedInUserName() {
        Object principal = SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            return ((UserDetails) principal).getUsername();
        }

        return principal.toString();
    }
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String showWelcome(ModelMap model) {
        model.put("name", getLoggedInUserName());
        return "welcome";
    }
}
