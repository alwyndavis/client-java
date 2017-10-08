/**
 * Grafeas API
 * An API to insert and retrieve annotations on cloud artifacts.
 *
 * OpenAPI spec version: 0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.grafeas.client;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.grafeas.client.Hash;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Container message for hashes of byte content of files, used in Source messages to verify integrity of source input to the build.
 */
@ApiModel(description = "Container message for hashes of byte content of files, used in Source messages to verify integrity of source input to the build.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-08T14:44:14.136-04:00")
public class FileHashes   {
  @SerializedName("fileHash")
  private List<Hash> fileHash = new ArrayList<Hash>();

  public FileHashes fileHash(List<Hash> fileHash) {
    this.fileHash = fileHash;
    return this;
  }

  public FileHashes addFileHashItem(Hash fileHashItem) {
    this.fileHash.add(fileHashItem);
    return this;
  }

   /**
   * Collection of file hashes.
   * @return fileHash
  **/
  @ApiModelProperty(example = "null", value = "Collection of file hashes.")
  public List<Hash> getFileHash() {
    return fileHash;
  }

  public void setFileHash(List<Hash> fileHash) {
    this.fileHash = fileHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileHashes fileHashes = (FileHashes) o;
    return Objects.equals(this.fileHash, fileHashes.fileHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileHash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileHashes {\n");
    
    sb.append("    fileHash: ").append(toIndentedString(fileHash)).append("\n");
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
