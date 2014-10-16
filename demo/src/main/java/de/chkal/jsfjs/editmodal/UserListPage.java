package de.chkal.jsfjs.editmodal;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class UserListPage {

  @Inject
  private UserService userService;

  private List<User> users;

  @PostConstruct
  public void init() {
    users = userService.list();
  }

  public List<User> getUsers() {
    return users;
  }

}
