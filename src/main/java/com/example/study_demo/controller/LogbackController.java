package com.example.study_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: LogbackController
 * PackageName: com.example.study_demo
 * Describe:
 *
 * @author: 成文莹
 * @Create: 2023/9/1 - 20:45
 * @version:
 */
@RestController
@RequestMapping("/log")
public class LogbackController {
    /**
     * 测试正常请求
     * @param msg
     * @return
     */
    @GetMapping("/normal/{msg}")
    public String getMsg(@PathVariable String msg) {
        return msg;
    }

    /**
     * 测试抛异常
     * @return
     */
    @GetMapping("/exception/{msg}")
    public String getException(@PathVariable String msg){
        // 故意造出一个异常
        Integer.parseInt("abc123");
        return msg;
    }
}
