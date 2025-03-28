package wap.starlistbe.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Bookmark {

    @Id
    private Long id;

    private String title;

    private String summary;

    private String image;

    private String recommended;

    private String url;

    private Integer dateAdded;

    private Integer dateGroupModified;

    private Integer dateLastUsed;

    private Integer index;

    private Long parentId;

    // ROOT 혹은 FOLDER로 저장됨
    @Enumerated(EnumType.STRING)
    private ParentType parentType;

    private Boolean syncing;

    private Integer googleId;
}
