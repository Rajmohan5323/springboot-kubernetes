package com.raj.bookmarker.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.Instant;

@Entity
@Table(name = "bookmarks")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bookmark {
    @Id
    @SequenceGenerator(
        name = "bookmark_sequence_gen",
        sequenceName = "bookmark_sequence")
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "bookmark_sequence_gen")
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String url;
    private Instant createdAt;
}
