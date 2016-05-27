package jp.co.tads.wmd.repository.custom;

import java.util.List;

import jp.co.tads.wmd.persistence.MUser;

public interface MUserRepositoryCustom {

    public List<MUser> findAllUsers();

    public List<MUser> findUserList(String name);

    public MUser findUser(Long id, String password);

}
