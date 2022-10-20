//package com.example.base_ij.comment.dto.response;
//
//import com.example.base_ij.comment.entity.Comment;
//import com.example.base_ij.like.entity.Likes;
//import lombok.Getter;
//
//import java.util.List;
//
//@Getter
//public class CommentResponseDto {
//
//    private String nickname;
//
//    private String comments;
//
//    private List<Likes> likesList;
//
//
//    public CommentResponseDto(String nickname, String comments, List<Likes> likesList) {
//        this.nickname = nickname;
//        this.comments = comments;
//        this.likesList = likesList;
//    }
//    public CommentResponseDto(Comment comment){
//        this.comments = comment.getComments();
//        this.nickname = comment.getNickname();
//        this.likesList = comment.getLikes_lst();
//    }
//}
