package com.raj.bookmarker.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
  //  Page<BookmarksDTO> findBy(Pageable pageable);
    //Optimized
    @Query("select new com.raj.bookmarker.domain.BookmarkDTO(b.id, b.title, b.url, b.createdAt) b from Bookmark b")
    Page<BookmarkDTO> findBookmarks (Pageable pageable);
}
