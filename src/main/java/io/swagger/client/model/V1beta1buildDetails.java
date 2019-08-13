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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.ProvenanceBuildProvenance;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Details of a build occurrence.
 */
@Schema(description = "Details of a build occurrence.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-08-12T17:39:58.649+10:00[Australia/Sydney]")
public class V1beta1buildDetails {
  @SerializedName("provenance")
  private ProvenanceBuildProvenance provenance = null;

  @SerializedName("provenanceBytes")
  private String provenanceBytes = null;

  public V1beta1buildDetails provenance(ProvenanceBuildProvenance provenance) {
    this.provenance = provenance;
    return this;
  }

   /**
   * Get provenance
   * @return provenance
  **/
  @Schema(description = "")
  public ProvenanceBuildProvenance getProvenance() {
    return provenance;
  }

  public void setProvenance(ProvenanceBuildProvenance provenance) {
    this.provenance = provenance;
  }

  public V1beta1buildDetails provenanceBytes(String provenanceBytes) {
    this.provenanceBytes = provenanceBytes;
    return this;
  }

   /**
   * Serialized JSON representation of the provenance, used in generating the build signature in the corresponding build note. After verifying the signature, &#x60;provenance_bytes&#x60; can be unmarshalled and compared to the provenance to confirm that it is unchanged. A base64-encoded string representation of the provenance bytes is used for the signature in order to interoperate with openssl which expects this format for signature verification.  The serialized form is captured both to avoid ambiguity in how the provenance is marshalled to json as well to prevent incompatibilities with future changes.
   * @return provenanceBytes
  **/
  @Schema(description = "Serialized JSON representation of the provenance, used in generating the build signature in the corresponding build note. After verifying the signature, `provenance_bytes` can be unmarshalled and compared to the provenance to confirm that it is unchanged. A base64-encoded string representation of the provenance bytes is used for the signature in order to interoperate with openssl which expects this format for signature verification.  The serialized form is captured both to avoid ambiguity in how the provenance is marshalled to json as well to prevent incompatibilities with future changes.")
  public String getProvenanceBytes() {
    return provenanceBytes;
  }

  public void setProvenanceBytes(String provenanceBytes) {
    this.provenanceBytes = provenanceBytes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1buildDetails v1beta1buildDetails = (V1beta1buildDetails) o;
    return Objects.equals(this.provenance, v1beta1buildDetails.provenance) &&
        Objects.equals(this.provenanceBytes, v1beta1buildDetails.provenanceBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provenance, provenanceBytes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1buildDetails {\n");
    
    sb.append("    provenance: ").append(toIndentedString(provenance)).append("\n");
    sb.append("    provenanceBytes: ").append(toIndentedString(provenanceBytes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
