package com.xx.idoctorall.dao.api;

import com.xx.idoctorall.entity.relation.Comment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommentRepository extends CrudRepository<Comment, Long> {

    List<Comment> findByUserid(Long userid);
    Comment save(Comment comment);
}
