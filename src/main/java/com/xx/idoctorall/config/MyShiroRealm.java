package com.xx.idoctorall.config;

import com.xx.idoctorall.dao.api.UserRepository;
import com.xx.idoctorall.entity.relation.User;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 自定义的Realm
 */
@Service
public class MyShiroRealm extends AuthorizingRealm {
    @Autowired
    private UserRepository userRepository;

    /**
     * 认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //1.从主体传过来的认证信息中，获取用户名
        String userName= (String) authenticationToken.getPrincipal();

        //2.通过用户名到数据库中获取凭证
        String password=getPasswordByUserName(userName);
        if (password==null){
            return null;
        }
        SimpleAuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo
                (userName,password,"myRealm");

        //加盐salt
        //authenticationInfo.setCredentialsSalt(ByteSource.Util.bytes(userName));

        return authenticationInfo;
    }

    /**
     * 通过用户名从数据库或缓存中获取数据
     * @param userName
     * @return
     */
    private String getPasswordByUserName(String userName) {
        User user=userRepository.getPasswordByUsername(userName);
        if (user!=null){
            return user.getPassword();
        }
        return null;
    }


    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String userName= (String) principalCollection.getPrimaryPrincipal();

        //通过用户获取角色数据
        Set<String> roles=getRolesByUserName(userName);

        //通过用户获取角色数据
        //Set<String> permissions=getPermissionsByUserName(userName);

        SimpleAuthorizationInfo simpleAuthorizationInfo=new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.setRoles(roles);
        //simpleAuthorizationInfo.setStringPermissions(permissions);

        return simpleAuthorizationInfo;
    }

    /**
     * 通过用户名从数据库或缓存中获取权限数据
     * @param userName
     * @return
     */
    private Set<String> getPermissionsByUserName(String userName) {
        Set<String> sets=new HashSet();
        sets.add("user:delete");
        sets.add("user:add");
        return sets;
    }

    /**
     * 通过用户名从数据库或缓存中获取角色数据
     * @param userName
     * @return
     */
    private Set<String> getRolesByUserName(String userName) {
        System.out.println("从数据库中取数据");
        List<String> list=new ArrayList<>();
        Integer roleid=userRepository.getRoleidByUsername(userName).getRoleid();
        list.add(roleid.toString());
        Set<String> sets=new HashSet(list);

        return sets;
    }

    public static void main(String[] args) {
        Md5Hash md5Hash=new Md5Hash("123456","222222");
        System.out.println(String.valueOf(md5Hash));
    }
}
