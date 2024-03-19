package com.example.demo.baseinfoMgt.service;

import java.util.List;
import java.util.Map;

import com.example.demo.baseinfoMgt.vo.ProgInfoVO;

public interface BaseInfoMgtService {
    List<ProgInfoVO> getProgInfo();

    List<Map<String, Object>> getProgInfoMap();

    int insertTest(ProgInfoVO vo);

    int deleteTest(ProgInfoVO vo);

    int updateTest(ProgInfoVO vo);

    List<Map<String, Object>> getMenuInfoMap();
}
