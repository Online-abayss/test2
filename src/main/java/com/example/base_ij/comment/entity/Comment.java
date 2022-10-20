//package com.example.base_ij.comment.entity;
//
//
//import com.example.base_ij.board.entity.Timestemped;
//import com.example.base_ij.comment.dto.request.CommentRequestDto;
//import com.example.base_ij.like.entity.Likes;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Getter
//@NoArgsConstructor
//public class Comment extends Timestemped {
//
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    private Long id;
//
//    @Column
//    private String nickname;
//
//    @Column
//    private String comments;
//
////    @OneToMany(mappedBy = "comment")
////    private List<Likes> likes_lst = new ArrayList<>();
//
//    public Comment(String nickname, String comments) {
//        this.nickname = nickname;
//        this.comments = comments;
//    }
//
//    public Comment(CommentRequestDto commentRequestDto){
//        this.nickname = commentRequestDto.getNickname();
//        this.comments = commentRequestDto.getComments();
//    }
//
//}
