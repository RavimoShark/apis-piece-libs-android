/*
 * Ravimoshark Piece API
 * This is an API to interact with Ravimoshark piece database. # Introduction This API allow to create, modify and delete pieces and products (cards, details and key points). # User Authentication This API does not contain any kind of user validation but It request to have a valid authentication user to interact with it. For more information about user Authentication, please refer to [Ravimoshark User Authentication](https://ravimoshark.com/back/apis/auth/latest). 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: dev@ravimoshark.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.ravimoshark.apis.piece.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ravimoshark.apis.piece.model.PieceCards;
import com.ravimoshark.apis.piece.model.PieceDetails;
import com.ravimoshark.apis.piece.model.PieceKeyPoints;
import com.ravimoshark.apis.piece.model.Pieces;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.Serializable;
/**
 * Products information.
 */
@Schema(description = "Products information.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-10-28T11:15:10.127+01:00[Europe/Paris]")
public class Products implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("piece")
  private Pieces piece = null;

  @SerializedName("refArticle")
  private String refArticle = null;

  @SerializedName("card")
  private PieceCards card = null;

  @SerializedName("pieceDetails")
  private List<PieceDetails> pieceDetails = null;

  @SerializedName("pieceKeyPoints")
  private List<PieceKeyPoints> pieceKeyPoints = null;

  @SerializedName("createdAt")
  private Date createdAt = null;

  @SerializedName("updatedAt")
  private Date updatedAt = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  public Products piece(Pieces piece) {
    this.piece = piece;
    return this;
  }

   /**
   * Get piece
   * @return piece
  **/
  @Schema(description = "")
  public Pieces getPiece() {
    return piece;
  }

  public void setPiece(Pieces piece) {
    this.piece = piece;
  }

  public Products refArticle(String refArticle) {
    this.refArticle = refArticle;
    return this;
  }

   /**
   * Get refArticle
   * @return refArticle
  **/
  @Schema(description = "")
  public String getRefArticle() {
    return refArticle;
  }

  public void setRefArticle(String refArticle) {
    this.refArticle = refArticle;
  }

  public Products card(PieceCards card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @Schema(description = "")
  public PieceCards getCard() {
    return card;
  }

  public void setCard(PieceCards card) {
    this.card = card;
  }

  public Products pieceDetails(List<PieceDetails> pieceDetails) {
    this.pieceDetails = pieceDetails;
    return this;
  }

  public Products addPieceDetailsItem(PieceDetails pieceDetailsItem) {
    if (this.pieceDetails == null) {
      this.pieceDetails = new ArrayList<PieceDetails>();
    }
    this.pieceDetails.add(pieceDetailsItem);
    return this;
  }

   /**
   * Get pieceDetails
   * @return pieceDetails
  **/
  @Schema(description = "")
  public List<PieceDetails> getPieceDetails() {
    return pieceDetails;
  }

  public void setPieceDetails(List<PieceDetails> pieceDetails) {
    this.pieceDetails = pieceDetails;
  }

  public Products pieceKeyPoints(List<PieceKeyPoints> pieceKeyPoints) {
    this.pieceKeyPoints = pieceKeyPoints;
    return this;
  }

  public Products addPieceKeyPointsItem(PieceKeyPoints pieceKeyPointsItem) {
    if (this.pieceKeyPoints == null) {
      this.pieceKeyPoints = new ArrayList<PieceKeyPoints>();
    }
    this.pieceKeyPoints.add(pieceKeyPointsItem);
    return this;
  }

   /**
   * Get pieceKeyPoints
   * @return pieceKeyPoints
  **/
  @Schema(description = "")
  public List<PieceKeyPoints> getPieceKeyPoints() {
    return pieceKeyPoints;
  }

  public void setPieceKeyPoints(List<PieceKeyPoints> pieceKeyPoints) {
    this.pieceKeyPoints = pieceKeyPoints;
  }

  public Products createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Products updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Products deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @Schema(description = "")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Products products = (Products) o;
    return Objects.equals(this.piece, products.piece) &&
        Objects.equals(this.refArticle, products.refArticle) &&
        Objects.equals(this.card, products.card) &&
        Objects.equals(this.pieceDetails, products.pieceDetails) &&
        Objects.equals(this.pieceKeyPoints, products.pieceKeyPoints) &&
        Objects.equals(this.createdAt, products.createdAt) &&
        Objects.equals(this.updatedAt, products.updatedAt) &&
        Objects.equals(this.deleted, products.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(piece, refArticle, card, pieceDetails, pieceKeyPoints, createdAt, updatedAt, deleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Products {\n");
    
    sb.append("    piece: ").append(toIndentedString(piece)).append("\n");
    sb.append("    refArticle: ").append(toIndentedString(refArticle)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    pieceDetails: ").append(toIndentedString(pieceDetails)).append("\n");
    sb.append("    pieceKeyPoints: ").append(toIndentedString(pieceKeyPoints)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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
