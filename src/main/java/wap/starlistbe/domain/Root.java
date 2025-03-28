package wap.starlistbe.domain;

import jakarta.persistence.*;

@Entity
public class Root {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Member memberId;
}
