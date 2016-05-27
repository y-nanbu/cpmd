package jp.co.tads.wmd.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="m_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MUser {
    @Id
    @Column(name="id")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="password")
    private String password;
}
