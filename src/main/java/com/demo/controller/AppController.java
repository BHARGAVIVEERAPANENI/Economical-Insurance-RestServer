package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.demo.model.User;
import com.demo.service.AppService;

import io.swagger.v3.oas.annotations.Operation;



@RestController
public class AppController {
	@Autowired
	AppService appService;
	
	@Operation(summary = "Get User Info")
    @GetMapping("/userInfo")
    public ResponseEntity<Object> getUserInfo(@RequestParam(value="userId",required = true,defaultValue = "0") int userId ,@RequestParam(value="email",required = true,defaultValue = "") String email) {
        
        User user=appService.getUserInfo(userId,email);
        if(user==null) {
        	 return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Please Check Your Params Value");
        }
     
               return ResponseEntity.status(HttpStatus.OK).body(user);

    }
	

}
