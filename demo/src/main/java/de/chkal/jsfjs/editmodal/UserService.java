package de.chkal.jsfjs.editmodal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserService {

  private final List<User> users = new ArrayList<>();

  @PostConstruct
  public void init() {

    User user1 = new User();
    user1.setUserid("ck");
    user1.setFirstname("Christian");
    user1.setLastname("Kaltepoth");
    users.add(user1);

    User user2 = new User();
    user2.setUserid("hm");
    user2.setFirstname("Hans");
    user2.setLastname("Müller");
    users.add(user2);

  }

  public List<User> list() {
    return Collections.unmodifiableList(users);
  }

}
