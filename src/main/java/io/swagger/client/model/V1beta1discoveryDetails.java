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
import io.swagger.client.model.DiscoveryDiscovered;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Details of a discovery occurrence.
 */
@Schema(description = "Details of a discovery occurrence.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-08-12T17:39:58.649+10:00[Australia/Sydney]")
public class V1beta1discoveryDetails {
  @SerializedName("discovered")
  private DiscoveryDiscovered discovered = null;

  public V1beta1discoveryDetails discovered(DiscoveryDiscovered discovered) {
    this.discovered = discovered;
    return this;
  }

   /**
   * Get discovered
   * @return discovered
  **/
  @Schema(description = "")
  public DiscoveryDiscovered getDiscovered() {
    return discovered;
  }

  public void setDiscovered(DiscoveryDiscovered discovered) {
    this.discovered = discovered;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1discoveryDetails v1beta1discoveryDetails = (V1beta1discoveryDetails) o;
    return Objects.equals(this.discovered, v1beta1discoveryDetails.discovered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discovered);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1discoveryDetails {\n");
    
    sb.append("    discovered: ").append(toIndentedString(discovered)).append("\n");
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
