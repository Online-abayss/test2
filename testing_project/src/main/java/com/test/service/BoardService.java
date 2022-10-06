package com.test.service;

import com.test.Dto.GetAllResponseDto;
import com.test.entity.Board;
import com.test.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;




    // 클라이언트 전체 정보 조회를 서버에 요청 -> 서버는 ok 레포에 정보가 적합한게 있는지 조회 -> 찾았다 Dto라는 그릇을 통해서 -> 클라한데 줘서 보여주면됨.
    @Transactional
    public List<GetAllResponseDto> GetAllBoard(){
        List<Board> BoardAll_lst = boardRepository.findAllByOrderByModifiedAtDesc();
        List<GetAllResponseDto> GetAllBoard_lst = new ArrayList<>();

        for(Board board : BoardAll_lst){
            GetAllResponseDto getAllResponseDto = new GetAllResponseDto(board);
            GetAllBoard_lst.add(getAllResponseDto);
        }

        return GetAllBoard_lst;






    }


}
