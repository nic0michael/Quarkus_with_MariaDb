package za.co.nico.dtos;

import za.co.nico.entities.SenderMessageEntity;
import za.co.nico.enums.MessageStatus;
import za.co.nico.enums.MessageType;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SenderMessageDto {

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
  private int priority; // zero is highest
  private LocalDateTime sendDate;
  private String messageType;
  private String messageStatus;

  public SenderMessageDto(SenderMessageEntity entity) {
    this.id = entity.getId();
    this.messageId = entity.getMessageId();
    this.senderSystem = entity.getSenderSystem();
    this.emailTo = entity.getEmailTo();
    this.emailCc = entity.getEmailCc();
    this.emailBcc = entity.getEmailBcc();
    this.replyEmail = entity.getReplyEmail();
    this.subject = entity.getSubject();
    this.body = entity.getBody();
    this.enrichedBody = entity.getEnrichedBody();
    this.priority = entity.getPriority();
    this.sendDate = entity.getSendDate();
    this.messageType = entity.getMessageType();
    this.messageStatus = entity.getMessageStatus();
  }

  public SenderMessageDto(String messageId, String senderSystem, String emailTo, String emailCc, String emailBcc, String replyEmail, String subject, String body, String enrichedBody, int priority, LocalDateTime sendDate, MessageType messageType, MessageStatus messageStatus) {
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

  public SenderMessageDto(String messageId, String senderSystem, String emailTo, String emailCc, String emailBcc, String replyEmail, String subject, String body, String enrichedBody, int priority, LocalDateTime sendDate, String messageType, String messageStatus) {
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
    this.messageType = messageType;
    this.messageStatus = messageStatus;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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

  public int getPriority() {
    return priority;
  }

  public void setPriority(int priority) {
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

  public void setMessageStatus(String messageStatus) {
    this.messageStatus = messageStatus;
  }

  public void setMessageTypes(MessageType messageType) {
    this.messageType = messageType.name();
  }
  public String getMessageStatus() {
    return messageStatus;
  }
  public void setMessageStatus(MessageStatus messageStatus) {
    this.messageStatus = messageStatus.name();
  }

  @Override
  public String toString() {
    return "SenderMessageDto{" +
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
