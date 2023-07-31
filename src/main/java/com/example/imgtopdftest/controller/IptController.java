package com.example.imgtopdftest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class IptController {

    /*인덱스 페이지 (표지 선택)*/
    @GetMapping(value = {"/index", "/"})
    public String indexPage(){

        return "step-01";
    }

    @GetMapping("/step2")
    public String coverPage(){

        return "step-02";
    }


}

