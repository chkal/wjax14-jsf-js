package de.chkal.jsfjs.autocomplete;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class CountryBean {

  private String code;

  @Inject
  private CountryService countryService;

  public List<String> suggest(String query) {
    return countryService.findNamesByQuery(query);
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

}
