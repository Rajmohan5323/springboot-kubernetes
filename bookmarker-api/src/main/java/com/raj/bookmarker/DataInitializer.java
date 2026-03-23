package com.raj.bookmarker;

import com.raj.bookmarker.domain.Bookmark;
import com.raj.bookmarker.domain.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner{

    private final BookmarkRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Bookmark(null, "Google", "https://www.google.com", Instant.now()));
        repository.save(new Bookmark(null, "Facebook", "https://facebook.com", Instant.now()));
        repository.save(new Bookmark(null, "Twitter", "https://twitter.com", Instant.now()));
        repository.save(new Bookmark(null, "Git", "https://twitter.com", Instant.now()));
        repository.save(new Bookmark(null, "GitHub", "https://twitter.com", Instant.now()));
        repository.save(new Bookmark(null, "Docker", "https://twitter.com", Instant.now()));
        repository.save(new Bookmark(null, "Kubernetes", "https://twitter.com", Instant.now()));
        repository.save(new Bookmark(null, "Intellij", "https://twitter.com", Instant.now()));
        repository.save(new Bookmark(null, "SpringBoot", "https://twitter.com", Instant.now()));
        repository.save(new Bookmark(null, "Kafka", "https://twitter.com", Instant.now()));
        repository.save(new Bookmark(null, "Microservices", "https://twitter.com", Instant.now()));
        repository.save(new Bookmark(null, "baeldung", "https://www.baeldung.com", Instant.now()));
        repository.save(new Bookmark(null, "devglan", "https://www.devglan.com", Instant.now()));
        repository.save(new Bookmark(null, "linuxize", "https://linuxize.com", Instant.now()));
        repository.save(new Bookmark(null, "DevOpsBookmarks", "http://www.devopsbookmarks.com", Instant.now()));
    }
}
