package com.example.boot.controller;

import com.example.boot.entity.AppMessage;
import com.example.boot.service.AppMessageService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appmessage")
public class AppMessageController {

    @Autowired
    private AppMessageService appMessageService;

    @GetMapping("/getThree")
    public List<AppMessage> getThreeForMessage() {
        List<AppMessage> list = appMessageService.getMessage();
        return list;
    }

    @GetMapping("/getAll")
    public List<AppMessage> getAllMessage() {

        List<AppMessage> list = appMessageService.getAllMessage();
        int num = list.size();
        if (null != list && num > 3) {
            for (int i = 0; i < num - 3; i++) {
                list.remove(0);
            }
        }
        return list;
    }

    @GetMapping("/getByID")
    public List<AppMessage> getMessageById(@RequestParam("id") String id) {
        List<AppMessage> list = appMessageService.getMessageById(id);
        int num = list.size();
        if (null != list && num > 5) {
            for (int i = 0; i < num - 5; i++) {
                list.remove(0);
            }
        }
        return list;
    }

    @PostMapping(value = "/add")
    public int addMessage(@RequestBody AppMessage appMessage) {
        return appMessageService.addMessage(appMessage);
    }

    @PostMapping(value = "/delMessageById")
    public int delMessageById(@RequestParam("id") String id) {
        return appMessageService.delMessage(id);
    }

}
