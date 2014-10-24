package de.chkal.jsfjs.calendar;

import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class CalendarBean {

  private Date date = new Date();

  public String action() {

    String message = "Keine Datum ausgewählt";

    if (date != null) {
      if (date.after(new Date())) {
        message = "Datum liegt in der Zukunft";
      } else {
        message = "Datum liegt in der Vergangenheit";
      }
    }

    FacesContext.getCurrentInstance().addMessage(
        null, new FacesMessage(message));
    return null;

  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

}
