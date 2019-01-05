package com.example.demo;

import javafx.geometry.Pos;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Component
@Transactional
@Import(JayRegister.class)
public class JpaRunner implements ApplicationRunner {

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    PostRepository postRepository;

    @Autowired
    Jay jay;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        /*
        Account account = new Account();
        account.setUsername("keesun");
        account.setPassword("jpa");

        Study study = new Study();
        study.setName("Spring Data Jpa");

        // account.getStudies().add(study);
        // study.setOwner(account);

        account.addStudy(study);

        Session session = entityManager.unwrap(Session.class);
        session.save(account);
        session.save(study);

        Account keesun = session.load(Account.class, account.getId());

        keesun.setUsername("whiteship");
        keesun.setUsername("keesun");
        keesun.setUsername("keesun2");
        System.out.print("===================");
        System.out.println(keesun.getUsername());

        entityManager.persist(account);x
        */
//        Post post = new Post();
//        post.setTitle("Spring Data JPA 언제 보나...");
//
//        Comment comment = new Comment();
//        comment.setComment("빨리 보고 싶어요.");
//        post.addComment(comment);
//
//        Comment comment1 = new Comment();
//        comment1.setComment("곧 보여드릴게요.");
//        post.addComment(comment1);
//
//        Session session = entityManager.unwrap(Session.class);
//        session.save(post);

//        Session session = entityManager.unwrap(Session.class);
//        Post post = session.get(Post.class, 1L);
//        System.out.println("=====================");
//        System.out.println(post.getTitle());
//
//        System.out.println(post.getComments());

//        Comment comment = session.get(Comment.class, 2);
//        System.out.println("===========================");
//        System.out.println(comment.getPost().getTitle());
//        System.out.println();

//        Post post = session.get(Post.class, 1L);
//        System.out.println("=================");
//        System.out.println(post.getTitle());
//
//        post.getComments().forEach(c -> {
//            System.out.println("==============");
//            System.out.println(c.getComment());
//        });

        //session.delete(post);

//        TypedQuery<Post> query = entityManager.createQuery("select p from Post as p", Post.class);
//        List<Post> posts = query.getResultList();
//        posts.forEach(System.out::println);

//        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
//        CriteriaQuery<Post> query = builder.createQuery(Post.class);
//        Root<Post> root = query.from(Post.class);
//        query.select(root);
//
//        List<Post> posts = entityManager.createQuery(query).getResultList();
//        posts.forEach(System.out::println);

//        List<Post> posts = entityManager.createNativeQuery("SELECT * FROM Post", Post.class).getResultList();
//        posts.forEach(System.out::println);

        postRepository.findAll().forEach(System.out::println);

        System.out.println(jay.getName());
    }
}