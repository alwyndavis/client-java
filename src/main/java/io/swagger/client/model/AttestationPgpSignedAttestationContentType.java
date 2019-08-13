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
 * Type (for example schema) of the attestation payload that was signed.   - CONTENT_TYPE_UNSPECIFIED: &#x60;ContentType&#x60; is not set.  - SIMPLE_SIGNING_JSON: Atomic format attestation signature. See https://github.com/containers/image/blob/8a5d2f82a6e3263290c8e0276c3e0f64e77723e7/docs/atomic-signature.md The payload extracted from &#x60;signature&#x60; is a JSON blob conforming to the linked schema.
 */
@JsonAdapter(AttestationPgpSignedAttestationContentType.Adapter.class)
public enum AttestationPgpSignedAttestationContentType {
  CONTENT_TYPE_UNSPECIFIED("CONTENT_TYPE_UNSPECIFIED"),
  SIMPLE_SIGNING_JSON("SIMPLE_SIGNING_JSON");

  private String value;

  AttestationPgpSignedAttestationContentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AttestationPgpSignedAttestationContentType fromValue(String text) {
    for (AttestationPgpSignedAttestationContentType b : AttestationPgpSignedAttestationContentType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AttestationPgpSignedAttestationContentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AttestationPgpSignedAttestationContentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AttestationPgpSignedAttestationContentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AttestationPgpSignedAttestationContentType.fromValue(String.valueOf(value));
    }
  }
}