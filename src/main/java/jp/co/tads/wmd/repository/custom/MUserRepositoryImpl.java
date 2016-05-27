package jp.co.tads.wmd.repository.custom;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;

import jp.co.tads.wmd.persistence.MUser;

public class MUserRepositoryImpl implements MUserRepositoryCustom {
    @Autowired
    private EntityManager manager;


    public List<MUser> findAllUsers() {
        String sql = "SELECT u FROM m_user u";

        TypedQuery<MUser> query = manager.createQuery(sql, MUser.class);
        return query.getResultList();
    };

    public List<MUser> findUserList(String name) {
        String sql = "SELECT u FROM m_user u WHERE u.name = :name";

        TypedQuery<MUser> query = manager.createQuery(sql, MUser.class)
                .setParameter("name", name);
        return query.getResultList();

    };

    public MUser findUser(Long id, String password){
        String sql = "SELECT * FROM m_user u WHERE u.id = ?1 AND u.password = ?2";

        Query query = manager.createNativeQuery(sql, MUser.class)
                .setParameter(1, id)
                .setParameter(2, password);
        return (MUser) query.getSingleResult();
    };

}
