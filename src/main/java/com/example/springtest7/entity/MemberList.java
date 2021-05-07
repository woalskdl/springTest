package com.example.springtest7.entity;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MemberList {
    public Map<String, String> memberList = new HashMap<>();
}
