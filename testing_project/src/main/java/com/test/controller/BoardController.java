package com.test.controller;

import com.test.Dto.GetAllResponseDto;
import com.test.repository.BoardRepository;
import com.test.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BoardController {

    private final BoardRepository boardRepository;

    private final BoardService boardService;

    @GetMapping("/api/board")
    public List<GetAllResponseDto> getAll(){

        return boardService.GetAllBoard();
    }
}
