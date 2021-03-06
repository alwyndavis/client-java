/*
 * grafeas.proto
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: version not set
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets CVSSv3PrivilegesRequired
 */
@JsonAdapter(CVSSv3PrivilegesRequired.Adapter.class)
public enum CVSSv3PrivilegesRequired {
  UNSPECIFIED("PRIVILEGES_REQUIRED_UNSPECIFIED"),
  NONE("PRIVILEGES_REQUIRED_NONE"),
  LOW("PRIVILEGES_REQUIRED_LOW"),
  HIGH("PRIVILEGES_REQUIRED_HIGH");

  private String value;

  CVSSv3PrivilegesRequired(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CVSSv3PrivilegesRequired fromValue(String text) {
    for (CVSSv3PrivilegesRequired b : CVSSv3PrivilegesRequired.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CVSSv3PrivilegesRequired> {
    @Override
    public void write(final JsonWriter jsonWriter, final CVSSv3PrivilegesRequired enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CVSSv3PrivilegesRequired read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CVSSv3PrivilegesRequired.fromValue(String.valueOf(value));
    }
  }
}
