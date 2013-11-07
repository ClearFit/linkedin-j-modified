package com.google.code.linkedinapi.schema.json;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Telm Perez
 */
public class PictureUrls {

  // Constants ---------------------------------------------------------------------------------------------- Constants

  // Instance Variables ---------------------------------------------------------------------------- Instance Variables

  private Integer _total;
  private List<String> values = new ArrayList<String>();

  // Constructors ---------------------------------------------------------------------------------------- Constructors

  // Public Methods ------------------------------------------------------------------------------------ Public Methods

  // Protected Methods ------------------------------------------------------------------------------ Protected Methods

  // Private Methods ---------------------------------------------------------------------------------- Private Methods

  // Getters & Setters ------------------------------------------------------------------------------ Getters & Setters

  public Integer get_total() {
    return _total;
  }

  public void set_total(Integer _total) {
    this._total = _total;
  }

  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

} // end of class