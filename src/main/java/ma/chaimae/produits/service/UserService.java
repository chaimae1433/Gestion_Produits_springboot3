package ma.chaimae.produits.service;

import ma.chaimae.produits.entities.Role;
import ma.chaimae.produits.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);


}
