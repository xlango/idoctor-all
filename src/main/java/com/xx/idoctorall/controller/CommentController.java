package com.xx.idoctorall.controller;


import com.xx.idoctorall.entity.relation.Comment;
import com.xx.idoctorall.service.impl.CommentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/comment")
@CrossOrigin
public class CommentController {

    @Autowired
    private CommentServiceImpl commentService;

    @GetMapping("/findByUserid")
    public List<Comment> findByUserid(int userid){
        return commentService.findByUserid(userid);
    }

    @PostMapping("/save")
    public Comment save(Comment comment){
        comment.setCreateTime(new Date());
        return commentService.save(comment);
    }
}
