package com.myapp.webprj.board.domain;

import java.util.Date;

@Setter @getter
@ToString

public class Board {

    private Long bno;
    private String title;
    private String content;
    private String writer;
    private Date regDate;
    private Date updateDate;
}
