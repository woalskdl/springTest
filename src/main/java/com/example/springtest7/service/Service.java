package com.example.springtest7.service;

import com.example.springtest7.entity.Member;
import com.example.springtest7.entity.MemberList;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private final MemberList memberList;

    public Service(MemberList memberList) {
        this.memberList = memberList;
    }

    public String login(Member m) {

        if(memberList.memberList.containsKey(m.getId())){
            String id = m.getId();
            if(memberList.memberList.get(id).equals(m.getPw())){
                return id;
            }else{
                return "check pw";
            }
        }else{
            return "check id";
        }
    }

    public String join(Member m) {
        if(memberList.memberList.containsKey(m.getId())){
            return "join failed";
        }else{
            memberList.memberList.put(m.getId(), m.getPw());
            return "join completed";
        }
    }

    public String getName(Member member) {

        return "";
    }
}
