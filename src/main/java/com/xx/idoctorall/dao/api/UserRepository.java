package com.xx.idoctorall.dao.api;


import com.xx.idoctorall.entity.relation.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface UserRepository extends CrudRepository<User, Integer> {

    List<User> findAllByUsername(String username);
    List<User> findAll();

    User getPasswordByUsername(String userName);

    User getRoleidByUsername(String userName);

    User save(User user) ;

    User findByUsername(String userName);

    List<User> findByRoleid(int roleId);

    User findById(int id);

    void deleteById(Integer id);

    @Modifying
    @Query(value = "update User u set u.name=?1,u.sex=?2,u.email=?3,u.phone=?4 where u.id=?5", nativeQuery = true)
    int update(String name,String sex,String email,String phone,int id);

    @Modifying
    @Query(value = "update User u set u.password=?1 where u.id=?2", nativeQuery = true)
    int updatePwdById(String pwd,int id);

    @Modifying
    @Query(value = "update User u set u.realnamestatus=?1 where u.username=?2", nativeQuery = true)
    int updateRealnameStatus(int status,String username);

}
