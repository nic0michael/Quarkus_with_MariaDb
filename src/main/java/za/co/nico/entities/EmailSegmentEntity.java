package za.co.nico.entities;

import jakarta.persistence.*;
import za.co.nico.dtos.EmailSegmentDto;

@Entity
@Table(name = "EMAIL_SEGMENT")
public class EmailSegmentEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String segmentId;
  private String segmentName;
  private String visibility;
  private String owner;
  private String content;

  public EmailSegmentEntity() {
  }
  public EmailSegmentEntity(String segmentId, String segmentName, String visibility, String owner, String content) {
    this.segmentId = segmentId;
    this.segmentName = segmentName;
    this.visibility = visibility;
    this.owner = owner;
    this.content = content;
  }

  public void setEmailSegmentEntity(EmailSegmentDto emailSegment) {
    this.segmentId = emailSegment.getSegmentId();
    this.segmentName = emailSegment.getSegmentName();
    this.visibility = emailSegment.getVisibility();
    this.owner = emailSegment.getOwner();
    this.content = emailSegment.getContent();
  }

  public long getId() {
    return id;
  }

  public String getSegmentId() {
    return segmentId;
  }

  public void setSegmentId(String segmentId) {
    this.segmentId = segmentId;
  }

  public String getSegmentName() {
    return segmentName;
  }

  public void setSegmentName(String segmentName) {
    this.segmentName = segmentName;
  }

  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  @Override
  public String toString() {
    return "EmailSegmentEntity{" +
        "id=" + id +
        ", segmentId='" + segmentId + '\'' +
        ", segmentName='" + segmentName + '\'' +
        ", visibility='" + visibility + '\'' +
        ", owner='" + owner + '\'' +
        ", content='" + content + '\'' +
        '}';
  }

}
