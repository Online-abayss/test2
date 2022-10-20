package com.example.base_ij.like.entity;

import com.example.base_ij.board.entity.Board;
import com.example.base_ij.like.dto.request.LikeRequestDto;
import lombok.*;

import javax.persistence.*;

//@Builder
@Getter
@NoArgsConstructor
//@AllArgsConstructor
@Entity

public class Likes {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "MANY_ONE_BOARD_ID")
    private Board board;

    @Column
    private Long likeUserId;
    //좋아요?상태?
    private boolean likeStatus;

    public  Likes createLike(LikeRequestDto likeRequestDto) {
        return new Likes();
    }


//    public Likes(Long likeUserId, Board board){
//        this.likeUserId = likeUserId;
//
//
//    }
//
//    public void changeLike(boolean likeStatus){
//         this.likeStatus = likeStatus;
//    }


//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    private Long id;
//
//
//    @Column
//    private Long boardId;
//
//    @Column
//    private Long likeUserId;
//
//    // 테스트 연관관계
//
//    @ManyToOne
//    @JoinColumn(name = "Comment_Id_Test")
//    private Comment comment;
//
//
//    public Likes(Long boardId, Long likeUserId) {
//        this.boardId = boardId;
//        this.likeUserId = likeUserId;
//
//    }
//
//    public Likes(Long boardId) {
//        this.boardId = boardId;
//
//    }
//    public Likes(LikeRequestDto likeRequestDto){
//        this.boardId = likeRequestDto.getBoardId();
//    }
//
//


}

