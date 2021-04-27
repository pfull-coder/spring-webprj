package com.myapp.webprj.member.mapper;

import com.myapp.webprj.member.domain.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface MemberMapper {

    // 회원 가입 기능
    void register(Member member);
    // 아이디, 이메일 중복체크
    int isDuplicate(Map<String, Object> datas);
    // 회원정보 조회 기능
    Member getUserInfo(String account);

}
