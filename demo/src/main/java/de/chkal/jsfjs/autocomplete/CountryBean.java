package de.chkal.jsfjs.autocomplete;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class CountryBean {

  private String value;

  @Inject
  private CountryService countryService;

  public List<String> suggest(String query) {
    return countryService.findNamesByQuery(query);
  }

  public String getValue() {
    return value;
  }

  public void setValue(String code) {
    this.value = code;
  }

}
