package web.dao;

import web.model.Role;

import java.util.Set;

public interface RoleDao {

    Set<Role> getAllRoles();

    Role getByName(String roleName);

    void create(Role role);
}
