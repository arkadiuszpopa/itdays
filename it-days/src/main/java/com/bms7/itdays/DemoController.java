package com.bms7.itdays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author BMS
 */
@Controller
public final class DemoController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "BMS");
        return "index";
    }

    @RequestMapping("/demo")
    @ResponseBody
    public String demo() {
        return "Demo";
    }
}
