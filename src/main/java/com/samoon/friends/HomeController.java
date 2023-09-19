package com.samoon.friends;

import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("friends")
public class HomeController{
    IFriendRepository<Friend> repository;
    
    HomeController(){
        repository = new FriendRepository();
    }

    @GetMapping("/all")
    public Collection<Friend> all(){
        return repository.get();
    }

    @PostMapping("/add")
    public String add(Friend friend){
        repository.save(friend);
        return friend.getName() + " added successfully!";
    }

    @PutMapping("/update")
    public String update(Friend friend){
        repository.save(friend);
        return friend.getName() + " updated successfully!";
    }

    @DeleteMapping("/delete")
    public String delete(long id){
        repository.delete(id);
        return "deleted successfully!";
    }

}