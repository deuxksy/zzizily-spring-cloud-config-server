package com.zzizily.mas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableConfigServer
@RestController
public class ZZiZiLYApplication {

  public static void main(String[] args) {
    SpringApplication.run(ZZiZiLYApplication.class, args);
  }

  @GetMapping("/")
  public String index() {
    return "OK";
  }

}