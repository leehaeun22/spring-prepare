package com.meta.springprepare.memo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Memo {
    private String username;
    private String contents;
    private String title;
    private Date createAt;
    private Date updatedAt;
}
