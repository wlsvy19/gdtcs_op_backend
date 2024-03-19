package com.example.demo.baseinfoMgt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.baseinfoMgt.service.BaseInfoMgtService;
import com.example.demo.baseinfoMgt.vo.ProgInfoVO;

@Controller
@RequestMapping("/api/baseInfo")
public class BaseInfoMgtController {
    @Autowired
    private BaseInfoMgtService baseInfoMgtService;

    @GetMapping("/getPrgMgtList")
    public ResponseEntity<List<ProgInfoVO>> getProgInfo() {
        List<ProgInfoVO> progList = baseInfoMgtService.getProgInfo();
        int row = 1;
        for (ProgInfoVO vo : progList) {
            // System.out.println(row + "-" + vo.getPrgNm() + ", " + vo.getPrgNote());
            row++;
        }
        return ResponseEntity.ok(progList);
    }

    // TODO: 모든 메뉴 불러와서 상위메뉴에 따른 하위메뉴 구성
    @GetMapping("/getPrgMgtMap")
    public ResponseEntity<List<Map<String, Object>>> getProgInfoMap() {
        List<Map<String, Object>> progMap = baseInfoMgtService.getProgInfoMap();
        // System.out.println("progMap: " + progMap);
        return ResponseEntity.ok(progMap);
    }

    @PostMapping("/insertTest")
    @ResponseBody
    public int insertTest(@RequestBody ProgInfoVO vo) {
        int result = baseInfoMgtService.insertTest(vo);
        return result;
    }

    @PostMapping("/updateTest")
    @ResponseBody
    public int updateTest(@RequestBody ProgInfoVO vo) {
        return baseInfoMgtService.updateTest(vo);
    }

    @PostMapping("/deleteTest")
    @ResponseBody
    public int deleteTest(@RequestBody ProgInfoVO vo) {
        return baseInfoMgtService.deleteTest(vo);
    }

    // 메뉴 테스트
    @PostMapping("/selectMenuInfo")
    public ResponseEntity<List<Map<String, Object>>> getMenuInfoMap() {
        List<Map<String, Object>> progMap = baseInfoMgtService.getMenuInfoMap();
        System.out.println("##### progMap:" + progMap);
        return ResponseEntity.ok(progMap);
    }
}
