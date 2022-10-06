package com.test.entity;

import com.test.Dto.GetAllResponseDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity

public class Board extends TimeStamped{

    @Id // Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //제목
    @Column(nullable = false)
    private String title;

    // 게시글 내용
    @Column(nullable = false)
    private String content;

    // 작성자
    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private String password;

    public Board(String title, String content, String author, String password){
        this.title = title;
        this.content = content;
        this.author = author;
        this.password = password;

    }

    public Board(GetAllResponseDto getAllResponseDto){
        this.title = title;
        this.content = content;
        this.author = author;
        this.password = password;
    }




}
