package com.deepak1.welcome.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class CalendarController {
    /*@GetMapping("/calendar")
    public String displayHolidays(@RequestParam(required = false) boolean festival,
                                  @RequestParam(required = false) boolean federal,Model model) {
        model.addAttribute("festival",festival);
        model.addAttribute("federal",federal);

        List<Calendar> calendars = Arrays.asList(
                new Calendar(" Jan 1 - March 23 ","First Term", Calendar.Type.FESTIVAL),
                new Calendar(" May 4 - July 31 ","Second Term", Calendar.Type.FESTIVAL),
                new Calendar(" Sept 1 - Nov 29 ","Third Term", Calendar.Type.FESTIVAL),
                new Calendar(" Nov 6 - Nov 18 ","KCSE Period", Calendar.Type.FESTIVAL),
                new Calendar(" Jan 17 ","Prize Giving Day", Calendar.Type.FEDERAL),
                new Calendar(" July 4 ","Cultural Day", Calendar.Type.FEDERAL),
                new Calendar(" Sep 5 ","Parents Day", Calendar.Type.FEDERAL),
                new Calendar(" Nov 11 ","Prayer Day", Calendar.Type.FEDERAL)
        );
        Calendar.Type[] types = Calendar.Type.values();
        for (Calendar.Type type : types) {
            model.addAttribute(type.toString(),
                    (calendars.stream().filter(calendar -> calendar.getType().equals(type)).collect(Collectors.toList())));
        }
        return "calendar.html";
    }*/
}
