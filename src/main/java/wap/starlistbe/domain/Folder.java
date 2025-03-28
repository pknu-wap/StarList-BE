package wap.starlistbe.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class Folder {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Long googleId;

    @OneToMany
    private List<Bookmark> bookmarks;

    @ManyToOne
    private Root rootId;
}
