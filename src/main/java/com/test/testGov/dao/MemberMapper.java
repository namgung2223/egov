package com.test.testGov.dao;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import java.util.Map;

@Mapper
public interface MemberMapper {

    Map<String, Object> selectMemberList(String id);
}
