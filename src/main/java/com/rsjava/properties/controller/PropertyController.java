package com.rsjava.properties.controller;

import com.rsjava.properties.configuration.properties.GithubProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("properties")
@RequiredArgsConstructor
public class PropertyController {

    private final GithubProperties githubProperties;

    @GetMapping("login")
    @ResponseStatus(HttpStatus.OK)
    public String getLogin() {
        return githubProperties.getAuth().getLogin();
    }

    @GetMapping("template-names")
    @ResponseStatus(HttpStatus.OK)
    public String getAudiName() {
        return githubProperties.getTemplate().getNames().get("audi-english");
    }
}
