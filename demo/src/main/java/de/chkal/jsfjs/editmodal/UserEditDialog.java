package de.chkal.jsfjs.editmodal;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class UserEditDialog {

  private User user;

  public void prepare(User user) {
    this.user = user;
  }

  public String save() {

    FacesContext context = FacesContext.getCurrentInstance();
    context.addMessage(null,
        new FacesMessage("Der Benutzer wurde erfolreich gespeichert"));
    context.getExternalContext().getFlash().setKeepMessages(true);

    return "/dialog-edit-custom.xhtml?faces-redirect=true";

  }

  public User getUser() {
    return user;
  }

}
