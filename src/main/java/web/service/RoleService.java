package web.service;

import web.model.Role;

import java.util.Set;

public interface RoleService {
    Set<Role> getAllRoles();

    Role getByName(String roleName);

    void create(Role role);
}
