package com.sungsuhan.api.member.controller;

import com.sungsuhan.api.member.domain.CalcDTO;
import com.sungsuhan.api.member.domain.MemberDTO;
import com.sungsuhan.api.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService service;

    @PostMapping("/calc")
    public String calc(@RequestBody CalcDTO calc) {
        return service.calc(calc);
    }
    @PostMapping("/bmi")
    public String bmi(@RequestBody MemberDTO bmi) {
        return service.bmi(bmi);
    }
    @PostMapping("/grade")
    public String grade(@RequestBody MemberDTO grade) {
        return service.grade(grade);
    }
    @PostMapping("/login")
    public String login(@RequestBody MemberDTO login) {
        return service.login(login);
    }



}
