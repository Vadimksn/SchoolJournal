package com.vadimksn.schoolJournal.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/startPage")
public class SchoolJournalController {

    @RequestMapping(method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }

}
