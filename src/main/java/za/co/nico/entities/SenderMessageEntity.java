package za.co.nico.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import za.co.nico.dtos.SenderMessageDto;
import za.co.nico.enums.MessageStatus;
import za.co.nico.enums.MessageType;

import java.time.LocalDateTime;

@Entity
@Table(name = "SENDER_MESSAGE")
public class SenderMessageEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String messageId;
  private String senderSystem;
  private String emailTo;
  private String emailCc;
  private String emailBcc;
  private String replyEmail;
  private String subject;
  private String body;
  private String enrichedBody;
  private Integer priority; // zero is highest
  private LocalDateTime sendDate;
  private String messageType;
  private String messageStatus;

  public SenderMessageEntity() {

  }

  public void setSenderMessageEntity(SenderMessageDto dto){
    this.messageId = dto.getMessageId();
    this.senderSystem = dto.getSenderSystem();
    this.emailTo = dto.getEmailTo();
    this.emailCc = dto.getEmailCc();
    this.emailBcc = dto.getEmailBcc();
    this.replyEmail = dto.getReplyEmail();
    this.subject = dto.getSubject();
    this.body = dto.getBody();
    this.enrichedBody = dto.getEnrichedBody();
    this.priority = new Integer(dto.getPriority());
    this.sendDate = dto.getSendDate();
    this.messageType = dto.getMessageType();
    this.messageStatus = dto.getMessageStatus();
  }

  public SenderMessageEntity(String messageId, String senderSystem, String emailTo, String emailCc, String emailBcc, String replyEmail, String subject, String body, String enrichedBody, Integer priority, LocalDateTime sendDate, MessageType messageType, MessageStatus messageStatus) {
    this.messageId = messageId;
    this.senderSystem = senderSystem;
    this.emailTo = emailTo;
    this.emailCc = emailCc;
    this.emailBcc = emailBcc;
    this.replyEmail = replyEmail;
    this.subject = subject;
    this.body = body;
    this.enrichedBody = enrichedBody;
    this.priority = priority;
    this.sendDate = sendDate;
    this.messageType = messageType.name();
    this.messageStatus = messageStatus.name();
  }
  public long getId() {
    return id;
  }

  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public String getSenderSystem() {
    return senderSystem;
  }

  public void setSenderSystem(String senderSystem) {
    this.senderSystem = senderSystem;
  }

  public String getEmailTo() {
    return emailTo;
  }

  public void setEmailTo(String emailTo) {
    this.emailTo = emailTo;
  }

  public String getEmailCc() {
    return emailCc;
  }

  public void setEmailCc(String emailCc) {
    this.emailCc = emailCc;
  }

  public String getEmailBcc() {
    return emailBcc;
  }

  public void setEmailBcc(String emailBcc) {
    this.emailBcc = emailBcc;
  }

  public String getReplyEmail() {
    return replyEmail;
  }

  public void setReplyEmail(String replyEmail) {
    this.replyEmail = replyEmail;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public String getEnrichedBody() {
    return enrichedBody;
  }

  public void setEnrichedBody(String enrichedBody) {
    this.enrichedBody = enrichedBody;
  }

  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public LocalDateTime getSendDate() {
    return sendDate;
  }

  public void setSendDate(LocalDateTime sendDate) {
    this.sendDate = sendDate;
  }

  public String getMessageType() {
    return messageType;
  }

  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }

  public String getMessageStatus() {
    return messageStatus;
  }

  public void setMessageStatus(String messageStatus) {
    this.messageStatus = messageStatus;
  }


  @Override
  public String toString() {
    return "SenderMessageEntity{" +
        "id=" + id +
        ", messageId='" + messageId + '\'' +
        ", senderSystem='" + senderSystem + '\'' +
        ", emailTo='" + emailTo + '\'' +
        ", emailCc='" + emailCc + '\'' +
        ", emailBcc='" + emailBcc + '\'' +
        ", replyEmail='" + replyEmail + '\'' +
        ", subject='" + subject + '\'' +
        ", body='" + body + '\'' +
        ", enrichedBody='" + enrichedBody + '\'' +
        ", priority=" + priority +
        ", sendDate=" + sendDate +
        ", messageType='" + messageType + '\'' +
        ", messageStatus='" + messageStatus + '\'' +
        '}';
  }
}
