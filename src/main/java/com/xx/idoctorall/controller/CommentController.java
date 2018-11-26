package com.xx.idoctorall.controller;


import com.xx.idoctorall.entity.relation.Comment;
import com.xx.idoctorall.service.impl.CommentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentServiceImpl commentService;

    @GetMapping("/findByUserid")
    public List<Comment> findByUserid(Long userid){
        return commentService.findByUserid(userid);
    }
}
