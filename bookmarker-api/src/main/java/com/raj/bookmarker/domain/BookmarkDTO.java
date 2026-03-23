package com.raj.bookmarker.domain;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
//@NoArgsConstructor  com.raj.bookmarker.domain.BookmarkDTO does not need a no-args constructor since we are using the all-args constructor for mapping.
public class BookmarkDTO {
    private Long id;
    private String title;
    private String url;
    private Instant createdAt;
}
