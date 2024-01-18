package za.co.nico.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import za.co.nico.dtos.EmailSegmentDto;
import za.co.nico.entities.EmailSegmentEntity;
import za.co.nico.exceptions.EmailSegmentNotFoundException;
import za.co.nico.repositories.EmailSegmentRepository;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class EmailSegmentServiceImpl implements EmailSegmentService{
  @Inject
  private final EmailSegmentRepository emailRepository;

  public EmailSegmentServiceImpl(EmailSegmentRepository emailRepository) {
    this.emailRepository = emailRepository;
  }

  @Override
  public EmailSegmentDto getEmailSegmentById(long id) throws EmailSegmentNotFoundException {
    EmailSegmentEntity emailSegment = emailRepository.findById(id);
    EmailSegmentDto emailSegmentDto = new EmailSegmentDto(emailSegment);
    if(null == emailSegment){
      throw new EmailSegmentNotFoundException();
    }
    return emailSegmentDto;
  }

  @Override
  public List<EmailSegmentDto> getAllEmailSegmentEntities() {
    List<EmailSegmentEntity> entities = emailRepository.listAll();
    List<EmailSegmentDto> emailSegmentDtos = new ArrayList<EmailSegmentDto>();
    for (EmailSegmentEntity entity : entities ) {
      EmailSegmentDto emailSegmentDto = new EmailSegmentDto(entity);
      emailSegmentDtos.add(emailSegmentDto);
    }
    return emailSegmentDtos;
  }

  @Override
  public EmailSegmentDto updateEmailSegment(long id, EmailSegmentDto segment) throws EmailSegmentNotFoundException {
    EmailSegmentEntity emailSegmentEntity = emailRepository.findById(id);
    EmailSegmentDto emailSegmentDto = null;

    if(null != emailSegmentEntity){
      emailSegmentEntity.setEmailSegmentEntity(segment);
      emailRepository.persist(emailSegmentEntity);
      emailSegmentDto = new EmailSegmentDto(emailSegmentEntity);
    } else {
      throw new EmailSegmentNotFoundException();
    }
    return emailSegmentDto;
  }

  @Override
  public EmailSegmentDto saveEmailSegment(EmailSegmentDto segment) throws EmailSegmentNotFoundException {
    if(null == segment){
      throw new EmailSegmentNotFoundException();
    } else {
      EmailSegmentEntity entity =new EmailSegmentEntity();
      entity.setEmailSegmentEntity(segment);
      emailRepository.persistAndFlush(entity);
      EmailSegmentDto segmentDto = new EmailSegmentDto(entity);
      return segmentDto;
    }
  }

  @Override
  public void deleteEmailSegment(long id) throws EmailSegmentNotFoundException {
    EmailSegmentEntity segment = emailRepository.findById(id);
    if(null == segment){
      throw new EmailSegmentNotFoundException();
    }
    emailRepository.delete(segment);
  }
}
