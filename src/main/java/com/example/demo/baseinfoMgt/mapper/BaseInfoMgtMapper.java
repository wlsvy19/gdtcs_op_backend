package com.example.demo.baseinfoMgt.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.baseinfoMgt.vo.ProgInfoVO;

@Mapper
public interface BaseInfoMgtMapper {
    List<ProgInfoVO> getProgInfo();

    List<Map<String, Object>> getProgInfoMap();

    int insertTest(ProgInfoVO vo);

    int deleteTest(ProgInfoVO vo);

    int updateTest(ProgInfoVO vo);

    List<Map<String, Object>> getMenuInfoMap();
}
