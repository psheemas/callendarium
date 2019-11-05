package com.calendar.calendarium.controller;
import com.calendar.scheduler.SupportScheduler;
import com.calendar.supportMan.SupportMan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/callendarium")
public class CallendariumController {

    @Autowired
    public SupportScheduler supportScheduler;

    @RequestMapping(method = RequestMethod.GET, value = "getCal")
    public void checker(){
        System.out.println("checker");
        supportScheduler.scheduleASupport();

        System.out.println("------");
        System.out.println(supportScheduler.getTomas().getHolidayHours());
    }

}
