package com.raj.bookmarker.domain;

import org.springframework.stereotype.Component;

@Component
public class BookmarkMapper {
    /*public BookmarkDTO toDTO(Bookmark bookmark) {
        return new BookmarkDTO(bookmark.getId(), bookmark.getTitle(), bookmark.getUrl(), bookmark.getCreatedAt());
    }*/

    public BookmarkDTO toDTO(Bookmark bookmark) {
        BookmarkDTO dto = new BookmarkDTO();
        dto.setId(bookmark.getId());
        dto.setTitle(bookmark.getTitle());
        dto.setUrl(bookmark.getUrl());
        dto.setCreatedAt(bookmark.getCreatedAt());
        return dto;
    }

}
