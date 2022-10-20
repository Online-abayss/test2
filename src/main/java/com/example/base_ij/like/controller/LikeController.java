package com.example.base_ij.like.controller;


import com.example.base_ij.board.entity.Board;
import com.example.base_ij.board.repository.BoardRepository;
import com.example.base_ij.like.dto.request.LikeRequestDto;

import com.example.base_ij.like.entity.Likes;
import com.example.base_ij.like.repository.LikeRepositoty;
import com.example.base_ij.like.service.LikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController // 뷰 vs json.

@RequiredArgsConstructor
public class LikeController {

    private final LikeService likeService;
    private final LikeRepositoty likeRepositoty;
    private final BoardRepository boardRepository;

// save

    @PostMapping("/like")
    public boolean getLove(@RequestBody LikeRequestDto likeRequestDto) {

        LikeRequestDto likeRequestDto1 = likeService.create(likeRequestDto);
        return true;
    }

    @PatchMapping("/like")
        public boolean updateLove(@RequestBody LikeRequestDto likeRequestDto){


        }

//



        //    @PostMapping("/like")
//    public boolean getLove(@RequestBody LikeRequestDto likeRequestDto) {
//
//        // 나온 불린값을 List<Likes>에 저장하면 끝.?
////        Board board = boardRepository.findById(likeRequestDto.getLikeUserId()).orElse(null);
//
////        Likes likes = new Likes(likeRequestDto);
////        comment.getLikes_lst()
//
//        return likeService.getLike(likeRequestDto);
//    }
//

//
//        return likeService.love(likeRequestDto);

//    private final LikeService likeService;
//
//    private final LikeRepositoty likeRepositoty;
//
//
//
//    @PostMapping("/like")
//    public boolean getlove(@RequestParam Long boardId,@RequestBody LikeRequestDto likeRequestDto){
//        Likes likes = new Likes(likeRequestDto);
//
//
//        return likeService.love(likeRequestDto);
//    }

}
