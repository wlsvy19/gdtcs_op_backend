package com.example.demo.baseinfoMgt.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.baseinfoMgt.mapper.BaseInfoMgtMapper;
import com.example.demo.baseinfoMgt.service.BaseInfoMgtService;
import com.example.demo.baseinfoMgt.vo.ProgInfoVO;

@Service
public class BaseInfoMgtServiceImpl implements BaseInfoMgtService {

    @Autowired
    private BaseInfoMgtMapper baseInfoMgtMapper;

//    @Override
//    public List<Map<String, Object>> getProgInfo() {
//        System.out.println("2. 서비스호출");
//        return baseInfoMgtMapper.getProgInfo();
//    }

    @Override
    public List<ProgInfoVO> getProgInfo() {
        return baseInfoMgtMapper.getProgInfo();
    }

    @Override
    public List<Map<String, Object>> getProgInfoMap() {
        return baseInfoMgtMapper.getProgInfoMap();
    }

    @Override
    public int insertTest(ProgInfoVO vo) {
        return baseInfoMgtMapper.insertTest(vo);
    }

    @Override
    public int deleteTest(ProgInfoVO vo) {
        return baseInfoMgtMapper.deleteTest(vo);
    }

    @Override
    public int updateTest(ProgInfoVO vo) {
        return baseInfoMgtMapper.updateTest(vo);
    }

    @Override
    public List<Map<String, Object>> getMenuInfoMap() {
        return baseInfoMgtMapper.getMenuInfoMap();
    }

}
