package org.zerock.club.controller;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@Log4j
@Slf4j
@RequestMapping("/sample/")
public class SampleController {

    @GetMapping("/all")   // 모든 사용자 접근 가능
    public void exAll(){
        log.info("exAll........");
    }

    @GetMapping("/member")   // 로그인한 멤버만 접근 가능
    public void exMember(){
        log.info("exMember........");
    }

    @GetMapping("/admin")   // 관리자만 접근 가능
    public void exAdmin(){
        log.info("exAdmin........");
    }

    @GetMapping({"/exLayout1","/exLayout2","/exLayout3","/exLayout4"})
    public void exLay1(){
        log.info("exlayout.......");
    }
}
