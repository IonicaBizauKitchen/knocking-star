package com.knockingstar.service;

import com.knockingstar.model.Post;

import java.util.List;

/**
 * @author �mer Ufuk Efendioglu
 */
public interface PostService {

    Post getPost(long id);

    List<Post> getAllPosts();
}
