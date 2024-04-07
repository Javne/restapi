package com.javne.restapi.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
public class Post {
    private long id;
    private String title;
    private String content;
    private LocalDateTime created;
}
