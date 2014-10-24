package de.chkal.jsfjs.autocomplete;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CountryService {

  public List<Country> findByQuery(String query) {

    List<Country> result = new ArrayList<>();

    for (Country country : getAllCountries()) {
      if (matches(country, query)) {
        result.add(country);
      }
    }

    return result;

  }

  private boolean matches(Country country, String query) {
    if (query != null && query.trim().length() > 0) {
      return country.getName().toLowerCase().startsWith(query.toLowerCase());
    }
    return true;
  }

  public List<String> findNamesByQuery(String query) {

    List<String> result = new ArrayList<>();

    for (Country country : findByQuery(query)) {
      result.add(country.getName());
    }

    return result;

  }

  private List<Country> getAllCountries() {

    List<Country> countries = new ArrayList<>();

    for (String code : Locale.getISOCountries()) {
      String name = new Locale(code, code).getDisplayCountry(Locale.GERMAN);
      countries.add(new Country(code, name));
    }

    return countries;

  }

}
