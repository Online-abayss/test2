package com.test.Dto;

import com.test.entity.Board;

public class GetAllResponseDto {

    private String title;

    private String content;

    public GetAllResponseDto(Board board){
        this.title = board.getTitle();
        this.content = board.getContent();

    }
}
