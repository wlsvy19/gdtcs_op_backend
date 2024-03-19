package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.baseinfoMgt.vo.TestVO;

@RestController
public class MainController {
    
    @PostMapping("/api/test")
    public TestVO test(@RequestBody TestVO dto) {
        System.out.println("##### Title:" + dto.getTitle());
        System.out.println("##### Body:" + dto.getBody());
        System.out.println("##### User ID:" + dto.getUserId());
        dto.setBody("Return Body");
        dto.setTitle("Return Title");
        dto.setUserId(2);
        
        return dto;
    }
}
