package com.test.testGov.service.impl;

import com.test.testGov.dao.MemberMapper;
import com.test.testGov.service.MemberService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;


@Service("memberService")
public class MemberServiceImpl implements MemberService {

    @Resource(name = "memberMapper")
    MemberMapper memberMapper;

    @Override
    public Map<String, Object> selectMemberList(String id) {
        return memberMapper.selectMemberList(id);
    }


}
