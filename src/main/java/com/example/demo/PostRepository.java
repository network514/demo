package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
//@Transactional
//public class PostRepository {
//    @PersistenceContext
//    EntityManager entityManager;
//
//    public  Post add(Post post) {
//        entityManager.persist(post);
//    }
//
//    public void delete(Post post) {
//        entityManager.remove(post);
//    }
//
//    public List<Post> findAll() {
//        return entityManager.createQuery("SELECT p FROM Post AS p", Post.class).getResultList();
//    }
//
//}

// @Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}