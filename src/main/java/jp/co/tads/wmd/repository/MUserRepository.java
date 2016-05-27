package jp.co.tads.wmd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;

import jp.co.tads.wmd.persistence.MUser;
import jp.co.tads.wmd.repository.custom.MUserRepositoryCustom;

@RepositoryDefinition(domainClass = MUser.class, idClass = Long.class)
public interface MUserRepository extends JpaRepository<MUser, Long>, MUserRepositoryCustom {

    public MUser getMUserByIdAndPassword(Long id, String password);

    @Query(value="SELECT * FROM m_user u WHERE u.id = ?1 AND u.password = ?2", nativeQuery=true)
    public MUser findUser3(Long id, String password);
}
