/*
 * Grafeas API
 * An API to insert and retrieve annotations on cloud artifacts.
 *
 * OpenAPI spec version: v1alpha1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.grafeas.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.grafeas.model.ApiCloudRepoSourceContext;
import io.grafeas.model.ApiGerritSourceContext;
import io.grafeas.model.ApiGitSourceContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A SourceContext is a reference to a tree of files. A SourceContext together with a path point to a unique revision of a single file or directory.
 */
@ApiModel(description = "A SourceContext is a reference to a tree of files. A SourceContext together with a path point to a unique revision of a single file or directory.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T13:20:14.121-07:00")
public class ApiSourceContext {
  @SerializedName("cloud_repo")
  private ApiCloudRepoSourceContext cloudRepo = null;

  @SerializedName("gerrit")
  private ApiGerritSourceContext gerrit = null;

  @SerializedName("git")
  private ApiGitSourceContext git = null;

  @SerializedName("labels")
  private Map<String, String> labels = null;

  public ApiSourceContext cloudRepo(ApiCloudRepoSourceContext cloudRepo) {
    this.cloudRepo = cloudRepo;
    return this;
  }

   /**
   * A SourceContext referring to a revision in a Google Cloud Source Repo.
   * @return cloudRepo
  **/
  @ApiModelProperty(value = "A SourceContext referring to a revision in a Google Cloud Source Repo.")
  public ApiCloudRepoSourceContext getCloudRepo() {
    return cloudRepo;
  }

  public void setCloudRepo(ApiCloudRepoSourceContext cloudRepo) {
    this.cloudRepo = cloudRepo;
  }

  public ApiSourceContext gerrit(ApiGerritSourceContext gerrit) {
    this.gerrit = gerrit;
    return this;
  }

   /**
   * A SourceContext referring to a Gerrit project.
   * @return gerrit
  **/
  @ApiModelProperty(value = "A SourceContext referring to a Gerrit project.")
  public ApiGerritSourceContext getGerrit() {
    return gerrit;
  }

  public void setGerrit(ApiGerritSourceContext gerrit) {
    this.gerrit = gerrit;
  }

  public ApiSourceContext git(ApiGitSourceContext git) {
    this.git = git;
    return this;
  }

   /**
   * A SourceContext referring to any third party Git repo (e.g., GitHub).
   * @return git
  **/
  @ApiModelProperty(value = "A SourceContext referring to any third party Git repo (e.g., GitHub).")
  public ApiGitSourceContext getGit() {
    return git;
  }

  public void setGit(ApiGitSourceContext git) {
    this.git = git;
  }

  public ApiSourceContext labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public ApiSourceContext putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, String>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Labels with user defined metadata.
   * @return labels
  **/
  @ApiModelProperty(value = "Labels with user defined metadata.")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiSourceContext apiSourceContext = (ApiSourceContext) o;
    return Objects.equals(this.cloudRepo, apiSourceContext.cloudRepo) &&
        Objects.equals(this.gerrit, apiSourceContext.gerrit) &&
        Objects.equals(this.git, apiSourceContext.git) &&
        Objects.equals(this.labels, apiSourceContext.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudRepo, gerrit, git, labels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiSourceContext {\n");
    
    sb.append("    cloudRepo: ").append(toIndentedString(cloudRepo)).append("\n");
    sb.append("    gerrit: ").append(toIndentedString(gerrit)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
