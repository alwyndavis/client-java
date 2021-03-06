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
import io.swagger.client.model.V1beta1Note;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Response for listing notes.
 */
@Schema(description = "Response for listing notes.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-08-12T17:39:58.649+10:00[Australia/Sydney]")
public class V1beta1ListNotesResponse {
  @SerializedName("notes")
  private List<V1beta1Note> notes = null;

  @SerializedName("nextPageToken")
  private String nextPageToken = null;

  public V1beta1ListNotesResponse notes(List<V1beta1Note> notes) {
    this.notes = notes;
    return this;
  }

  public V1beta1ListNotesResponse addNotesItem(V1beta1Note notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<V1beta1Note>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * The notes requested.
   * @return notes
  **/
  @Schema(description = "The notes requested.")
  public List<V1beta1Note> getNotes() {
    return notes;
  }

  public void setNotes(List<V1beta1Note> notes) {
    this.notes = notes;
  }

  public V1beta1ListNotesResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

   /**
   * The next pagination token in the list response. It should be used as &#x60;page_token&#x60; for the following request. An empty value means no more results.
   * @return nextPageToken
  **/
  @Schema(description = "The next pagination token in the list response. It should be used as `page_token` for the following request. An empty value means no more results.")
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1ListNotesResponse v1beta1ListNotesResponse = (V1beta1ListNotesResponse) o;
    return Objects.equals(this.notes, v1beta1ListNotesResponse.notes) &&
        Objects.equals(this.nextPageToken, v1beta1ListNotesResponse.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, nextPageToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1ListNotesResponse {\n");
    
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
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
