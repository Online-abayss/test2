package com.example.base_ij.like.service;


import com.example.base_ij.board.entity.Board;
import com.example.base_ij.board.repository.BoardRepository;

import com.example.base_ij.like.dto.request.LikeRequestDto;
import com.example.base_ij.like.entity.Likes;
import com.example.base_ij.like.repository.LikeRepositoty;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Column;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor

public class LikeService {

// like전용

    private final BoardRepository boardRepository;

    private final LikeRepositoty likeRepositoty;

    //
    public boolean getLike(LikeRequestDto likeRequestDto) {

        // 내가 좋아요를 누르고 싶은 게시글의 아이디
        Long BoardId = likeRequestDto.getBoardId();

        // 좋아요를 누를 본인id

        Long UserId = likeRequestDto.getLikeUserId();

        //게시글 존재여부. x -> 예외 o -> 진행

        Board board = boardRepository.findById(BoardId).orElseThrow(
                () -> new IllegalArgumentException("BOARD 쪽이냐?")
        );

        // 있으면 안되고 없으면 되는 기이한 현상.

        // 만약에 like 조회시 , 존재 할 경우 조건문 실행 , 없을 시 like 생성해서 게시글

        Likes likes = likeRepositoty.findById(UserId).orElse(null);
//          작성 할떄마다 새로 만들어서 값이

//        Likes likes = likeRepositoty.findById(UserId).orElse(new Likes(UserId, board.getId()));

        //        Likes likes = Likes.builder()
//                .boardId(board.getId())
//                .likeUserId(UserId)
//                .build();
        // 게시글에 본인이 좋아요를 했는지 여부.
        if(likes.isLikeStatus() == true){
            likes.changeLike(false);
            likeRepositoty.save(likes);
            return false;
        }
        else{
            likes.changeLike(true);
            likeRepositoty.save(likes);
            return true;
        }


        // board를 연결..

        //    ㄴ  좋아요를 눌렀을때 본인 id 존재여부 (o -> false,  x -> true)

//        Likes likes = likeRepositoty.findById(UserId).orElse(null);
//        Likes likes1 = new Likes(UserId, board.getId());
//        likes1.changeLike(true);
//        likeRepositoty.save(likes1);
//        log.info("성공");
//        boolean qwer=(likes1.isLikeStatus())? true: false;
//        return qwer;

        // 있으면 안되고 없으면 되는 기이한 현상.

        // 만약에 like 조회시 , 존재 할 경우 조건문 실행 , 없을 시 like 생성해서 게시글

//        Likes likes = likeRepositoty.findById(UserId).orElse(null);
//          작성 할떄마다 새로 만들어서 값이
//        Likes likes = likeRepositoty.findById(UserId).orElse(new Likes(UserId, board.getId()));
//
//        //        Likes likes = Likes.builder()
////                .boardId(board.getId())
////                .likeUserId(UserId)
////                .build();
//        if(likes.isLikeStatus() == true){
//            likes.changeLike(false);
//            likeRepositoty.save(likes);
//            return false;
//        }
//        else{
//            likes.changeLike(true);
//            likeRepositoty.save(likes);
//            return true;
//        }

//        return likes.isLikeStatus(); // 현재 false 왜냐 새로 넣었으니.

//        if (likes.isLikeStatus()) {
//            likes.changeLike(false);
//            likeRepositoty.save(likes);
//            log.info("false단?");
//            return false;
//        } else {
//            likes.changeLike(likes.isLikeStatus());
//            likeRepositoty.save(likes);
//            log.info("true단?");
//            return true;
//        }


    }

    public LikeRequestDto create(LikeRequestDto likeRequestDto) {
        Likes likes1 = Likes.createLike(likeRequestDto);
    }
}
// 의미 없는 코드
//        if(likeRepositoty.findById(UserId).orElse(null) == null){
//            Likes likeBoard = new Likes(UserId, board.getId());
//            likeRepositoty.save(likeBoard);
//        }

//        if(likes == null){
//            // 내가 좋아요 할 게시글 찾음.
//            Likes likeBoard = new Likes(UserId, board.getId());
//            likeRepositoty.save(likeBoard);
//        }

// 조건문 실행
//
//        if (likes == null) {
//                Likes likeBoard = new Likes(board.getId(), UserId);
//                likeRepositoty.save(likeBoard);
//                }

// 안에 있는값이 true 일경우

//한것들 찐
//            if(likes.isLikeStatus()){
//                likes.changeLike(false);
//                likeRepositoty.save(likes);
//                return false;
//            }
//
//            else{
//                likes.changeLike(likes.isLikeStatus());
//                likeRepositoty.save(likes);
//                return true;
//            }


// 게시글이 없는곳으로 넣으면 오류 뜨겟지. -> 예외처리? exception?


// orelse 알기.

// 위의 내용을 저장해서 전달

//    }
// 게시글 입력되여있고 -> 거기서 내가 boolean 여부 파악 해서 진행되는 상황.

//    @Transactional
//    public boolean love(LikeRequestDto likeRequestDto){
//
//        // 댓글 id 찾기
//        Long likeUserId = likeRequestDto.getLikeUserId();
//
//        // 테스트
////        Likes likes123 = likeRepositoty.findByLikeUserId(commentId).orElse(null);
//        Likes likesBoolean = new Likes(true);
//
//        //
//        Optional<Likes> likes = likeRepositoty.findByLikeUserId(likeUserId);
//
//        Comment comment = commentRepositoty.findById(likeUserId).orElse(null);
//
//
//
//        if (likes.isPresent()) {
//            likeRepositoty.deleteById(likes.get().getId());
//            // list<likes> 넣고싶은 방법을 구하고자....
//            comment.getLikes_lst().remove(likesBoolean);
//            commentRepositoty.save(comment);
//
//            return false;
//
//        } else {
//            Likes likes1 = new Likes(likeRequestDto);
//            likeRepositoty.save(likes1);
//
//            comment.getLikes_lst().add(likesBoolean);
//            commentRepositoty.save(comment);
//
//
//            return true;
//
//        }
//
//    }
//
//    @Transactional
//    public boolean love(LikeRequestDto likeRequestDto) {
//        // 게시판 전용 id
//        Long boardId = likeRequestDto.getBoardId();
////        Long userId = 1L;
////        Optional<Likes> likes = likeRepositoty.findByBoardIdAndAndLikeUserId(boardId,userId);
//
//        // 저장되여있는 특정 게시판의 좋아요 가져오기. // 유저 게시글당 1개씩이면 뒤에 userId 해보면될듯 // 현재 게시글당 한개.
//        Optional<Likes> likes = likeRepositoty.findByBoardId(boardId);
//
//        // 값이 null이 아니면 (좋아요가 눌려져있는경우  삭제)
//        if (likes.isPresent()) {
//            likeRepositoty.deleteById(likes.get().getId());
//
//            return false;
//        } else {
//            Likes likes1 = new Likes(boardId);
//            likeRepositoty.save(likes1);
//
//            return true;
//
//        }
//
//    }
//}

// 게시글 id 가져와서 그 id로 특정 게시글 추출  - > 추출한 게시글 json에 like 부분 update //
