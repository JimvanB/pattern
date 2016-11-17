package app.controller;

import app.domain.Ontvanger;
import app.domain.Zender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Observer;

/**
 * Created by Jim on 17-11-2016.
 */
@Controller
public class AppController {

    @Autowired
    Zender zender;

    @RequestMapping("/showStatus")
    @ResponseBody
    public String showStatus() {

        StringBuilder sb = new StringBuilder();
        for (Observer ontvanger : zender.getObservers()) {
            sb.append(((Ontvanger) ontvanger).getValue());
            sb.append("<br/>");
        }
        return sb.toString();
    }


}
