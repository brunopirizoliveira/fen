package com.bpo.rocks.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RocksController {
    
    @RequestMapping(value="/band", method=RequestMethod.GET)
    public ResponseEntity<String> band(HttpServletRequest request, HttpServletResponse response, @RequestHeader("uuid") String uuid)
    {
        return new ResponseEntity<String>(uuid, HttpStatus.OK);
    }
}
