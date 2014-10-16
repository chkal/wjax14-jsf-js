package de.chkal.jsfjs.autocomplete;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
@Path("/countries")
public class CountryResource {

  @Inject
  private CountryService countryService;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Country> list(@QueryParam("q") String query) {
    return countryService.findByQuery(query);
  }

}
