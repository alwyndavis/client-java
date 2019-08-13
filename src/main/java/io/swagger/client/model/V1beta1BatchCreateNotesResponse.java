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
 * Response for creating notes in batch.
 */
@Schema(description = "Response for creating notes in batch.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-08-12T17:39:58.649+10:00[Australia/Sydney]")
public class V1beta1BatchCreateNotesResponse {
  @SerializedName("notes")
  private List<V1beta1Note> notes = null;

  public V1beta1BatchCreateNotesResponse notes(List<V1beta1Note> notes) {
    this.notes = notes;
    return this;
  }

  public V1beta1BatchCreateNotesResponse addNotesItem(V1beta1Note notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<V1beta1Note>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * The notes that were created.
   * @return notes
  **/
  @Schema(description = "The notes that were created.")
  public List<V1beta1Note> getNotes() {
    return notes;
  }

  public void setNotes(List<V1beta1Note> notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1BatchCreateNotesResponse v1beta1BatchCreateNotesResponse = (V1beta1BatchCreateNotesResponse) o;
    return Objects.equals(this.notes, v1beta1BatchCreateNotesResponse.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1BatchCreateNotesResponse {\n");
    
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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