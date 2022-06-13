package com.bpo.rocks.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RocksController {
    
    @RequestMapping(value="/band", method=RequestMethod.GET)
    public String band(HttpServletRequest request, HttpServletResponse response, @RequestHeader("uuid") String uuid)
    {
        return uuid;
    }
}
