package wap.starlistbe.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import wap.starlistbe.domain.Root;
import wap.starlistbe.repository.BookmarkRepository;
import wap.starlistbe.repository.RootRepository;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class BookmarkService {

    private final BookmarkRepository bookmarkRepository;
    private final RootRepository rootRepository;

    public Root getAllBookmarks(Long userId) {
        return rootRepository.findById(userId)
                .orElseThrow(() -> new NoSuchElementException("[ERROR] 존재하지 않는 사용자 ID 입니다."));
    }
}
