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
import io.swagger.client.model.ProvenanceFileHashes;
import io.swagger.client.model.SourceSourceContext;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Source describes the location of the source used for the build.
 */
@Schema(description = "Source describes the location of the source used for the build.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-08-12T17:39:58.649+10:00[Australia/Sydney]")
public class ProvenanceSource {
  @SerializedName("artifactStorageSourceUri")
  private String artifactStorageSourceUri = null;

  @SerializedName("fileHashes")
  private Map<String, ProvenanceFileHashes> fileHashes = null;

  @SerializedName("context")
  private SourceSourceContext context = null;

  @SerializedName("additionalContexts")
  private List<SourceSourceContext> additionalContexts = null;

  public ProvenanceSource artifactStorageSourceUri(String artifactStorageSourceUri) {
    this.artifactStorageSourceUri = artifactStorageSourceUri;
    return this;
  }

   /**
   * If provided, the input binary artifacts for the build came from this location.
   * @return artifactStorageSourceUri
  **/
  @Schema(description = "If provided, the input binary artifacts for the build came from this location.")
  public String getArtifactStorageSourceUri() {
    return artifactStorageSourceUri;
  }

  public void setArtifactStorageSourceUri(String artifactStorageSourceUri) {
    this.artifactStorageSourceUri = artifactStorageSourceUri;
  }

  public ProvenanceSource fileHashes(Map<String, ProvenanceFileHashes> fileHashes) {
    this.fileHashes = fileHashes;
    return this;
  }

  public ProvenanceSource putFileHashesItem(String key, ProvenanceFileHashes fileHashesItem) {
    if (this.fileHashes == null) {
      this.fileHashes = new HashMap<String, ProvenanceFileHashes>();
    }
    this.fileHashes.put(key, fileHashesItem);
    return this;
  }

   /**
   * Hash(es) of the build source, which can be used to verify that the original source integrity was maintained in the build.  The keys to this map are file paths used as build source and the values contain the hash values for those files.  If the build source came in a single package such as a gzipped tarfile (.tar.gz), the FileHash will be for the single path to that file.
   * @return fileHashes
  **/
  @Schema(description = "Hash(es) of the build source, which can be used to verify that the original source integrity was maintained in the build.  The keys to this map are file paths used as build source and the values contain the hash values for those files.  If the build source came in a single package such as a gzipped tarfile (.tar.gz), the FileHash will be for the single path to that file.")
  public Map<String, ProvenanceFileHashes> getFileHashes() {
    return fileHashes;
  }

  public void setFileHashes(Map<String, ProvenanceFileHashes> fileHashes) {
    this.fileHashes = fileHashes;
  }

  public ProvenanceSource context(SourceSourceContext context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @Schema(description = "")
  public SourceSourceContext getContext() {
    return context;
  }

  public void setContext(SourceSourceContext context) {
    this.context = context;
  }

  public ProvenanceSource additionalContexts(List<SourceSourceContext> additionalContexts) {
    this.additionalContexts = additionalContexts;
    return this;
  }

  public ProvenanceSource addAdditionalContextsItem(SourceSourceContext additionalContextsItem) {
    if (this.additionalContexts == null) {
      this.additionalContexts = new ArrayList<SourceSourceContext>();
    }
    this.additionalContexts.add(additionalContextsItem);
    return this;
  }

   /**
   * If provided, some of the source code used for the build may be found in these locations, in the case where the source repository had multiple remotes or submodules. This list will not include the context specified in the context field.
   * @return additionalContexts
  **/
  @Schema(description = "If provided, some of the source code used for the build may be found in these locations, in the case where the source repository had multiple remotes or submodules. This list will not include the context specified in the context field.")
  public List<SourceSourceContext> getAdditionalContexts() {
    return additionalContexts;
  }

  public void setAdditionalContexts(List<SourceSourceContext> additionalContexts) {
    this.additionalContexts = additionalContexts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvenanceSource provenanceSource = (ProvenanceSource) o;
    return Objects.equals(this.artifactStorageSourceUri, provenanceSource.artifactStorageSourceUri) &&
        Objects.equals(this.fileHashes, provenanceSource.fileHashes) &&
        Objects.equals(this.context, provenanceSource.context) &&
        Objects.equals(this.additionalContexts, provenanceSource.additionalContexts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactStorageSourceUri, fileHashes, context, additionalContexts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvenanceSource {\n");
    
    sb.append("    artifactStorageSourceUri: ").append(toIndentedString(artifactStorageSourceUri)).append("\n");
    sb.append("    fileHashes: ").append(toIndentedString(fileHashes)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    additionalContexts: ").append(toIndentedString(additionalContexts)).append("\n");
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
