package com.cclucky.metabubble.server.repository;

import com.cclucky.metabubble.server.pojo.entity.Comment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICommentDao extends IBaseDao<Comment, Long> {
    List<Comment> findAllByPostIdOrderByCreateTimeDesc(Long postId);

    List<Comment> findCommentsByPostId(Long postId);

    List<Comment> findByUserIdAndParentIdIsNotNullOrderByIdDesc(Long userId);

    List<Comment> findAllByIdIsInOrderByIdDesc(List<Long> ids);
}
