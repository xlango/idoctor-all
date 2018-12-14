package com.xx.idoctorall.service.impl;

import com.xx.idoctorall.dao.api.CommentRepository;
import com.xx.idoctorall.entity.relation.Comment;
import com.xx.idoctorall.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<Comment> findByUserid(int userid) {
        return commentRepository.findByUserid(userid);
    }

    @Override
    public Comment save(Comment comment) {
        return commentRepository.save(comment);
    }
}
