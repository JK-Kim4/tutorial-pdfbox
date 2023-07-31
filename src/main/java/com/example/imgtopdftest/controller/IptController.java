package com.example.imgtopdftest.controller;

import lombok.RequiredArgsConstructor;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
public class IptController {

    @GetMapping("/test")
    public String testPage(){

        PDDocument document = new PDDocument();
        PDPage page = new PDPage(PDRectangle.A4);
        document.addPage(page);

        try {
            document.save("D:\\temp\\test.pdf");
            document.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return "test";
    }


}

