package com.calendar.scheduler;

import com.calendar.supportMan.SupportMan;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Getter
@Setter
public class SupportScheduler {
    SupportMan tomas = new SupportMan("Tom","Pol",0,0,new ArrayList<>());
    SupportMan greg = new SupportMan("Greg","Mal",0,0,new ArrayList<>());
    SupportMan rob = new SupportMan("Rob","Tel",0,0,new ArrayList<>());

    public void scheduleASupport(){
        tomas.setHolidayHours(5);
        tomas.setHolidayHours(tomas.getHolidayHours()+6);
        System.out.println(tomas.getHolidayHours());
    }

    public void getHours(SupportMan supportMan){
        System.out.println(supportMan.getHolidayHours());
    }
}
