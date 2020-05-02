package com.example.boot.controller;

import com.example.boot.entity.Flow;
import com.example.boot.entity.Users;
import com.example.boot.service.FlowService;
import com.example.boot.service.OrderService;
import com.example.boot.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Richard Xue
 * @version 1.0
 * @date 2019-11-30 22:27
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
  @Autowired
  private UsersService usersService;
  @Autowired
  private OrderService orderService;
  @Autowired
  private FlowService flowService;

  @GetMapping
  public Users get() {
    return usersService.getById(286057);
  }

  @GetMapping(value = "/search")
  public List<Users> search() {
    return usersService.search();
  }

  @GetMapping(value = "/order")
  public String order() {
    orderService.test();
    return "1";
  }

  @GetMapping(value = "/flow")
  public List<Flow> flow() {
    return flowService.test();
  }

}
