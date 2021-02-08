package com.company.Inventory_management.User;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Scanner;

@Controller
@RequestMapping(path ="/")
public class UserController {
@Autowired
    private UserRepository userRepository;

public void adduser(){
    Scanner sc=new Scanner(System.in);
    User usr=new User();
    System.out.println("Enter the id number of the new user :");
    usr.setUser_id(sc.nextInt());
    System.out.println("Enter the name of the new user :");
    usr.setUser_name(sc.nextLine());
    System.out.println("Enter the password of the new user :");
    usr.setPassword(sc.nextLine());
    System.out.println("Enter role of the new user(Admin or Operator)");
    usr.setRole(sc.nextLine());

}
}
