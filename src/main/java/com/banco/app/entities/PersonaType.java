package com.banco.app.entities;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum PersonaType {
  CLIENT("p1");

  private String depCode;

  private PersonaType(String depCode) {
    this.depCode = depCode;
  }

  public String getDepCode() {
    return depCode;
  }

  @JsonCreator
  public static PersonaType getDepartmentFromCode(String value) {

    for (PersonaType type : PersonaType.values()) {

      if (type.getDepCode().equals(value)) {

        return type;
      }
    }

    return null;
  }
}
