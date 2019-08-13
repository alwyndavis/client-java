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
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Specifies the hash algorithm.   - HASH_TYPE_UNSPECIFIED: Unknown.  - SHA256: A SHA-256 hash.
 */
@JsonAdapter(HashHashType.Adapter.class)
public enum HashHashType {
  HASH_TYPE_UNSPECIFIED("HASH_TYPE_UNSPECIFIED"),
  SHA256("SHA256");

  private String value;

  HashHashType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static HashHashType fromValue(String text) {
    for (HashHashType b : HashHashType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<HashHashType> {
    @Override
    public void write(final JsonWriter jsonWriter, final HashHashType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public HashHashType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return HashHashType.fromValue(String.valueOf(value));
    }
  }
}