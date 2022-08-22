package com.mamasclub.happyjar.api.v1.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/Oauth")
@Log4j2
@RequiredArgsConstructor
public class OauthController {

    @RequestMapping("/clientCallback/{registrationId}")
    public void clientCallback(@PathVariable String registrationId) {

    }
}
