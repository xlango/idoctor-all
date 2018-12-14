package com.xx.idoctorall.service;

import com.xx.idoctorall.entity.relation.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> findByUserid(int userid);
    Comment save(Comment comment);
}
