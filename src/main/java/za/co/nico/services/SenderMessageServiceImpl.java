package za.co.nico.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import za.co.nico.dtos.SenderMessageDto;
import za.co.nico.entities.SenderMessageEntity;
import za.co.nico.exceptions.SenderMessageNotFoundException;
import za.co.nico.repositories.SenderMessageRepository;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class SenderMessageServiceImpl implements SenderMessageService{

  private final SenderMessageRepository messageRepository;

  @Inject
  public SenderMessageServiceImpl(SenderMessageRepository messageRepository) {
    this.messageRepository = messageRepository;
  }

  @Override
  public SenderMessageDto getSenderMessageById(long id) throws SenderMessageNotFoundException {
    SenderMessageEntity message = messageRepository.findById(id);
    SenderMessageDto messageDto = new SenderMessageDto(message);
    if(null == message){
      throw new SenderMessageNotFoundException();
    }
    return messageDto;
  }

  @Override
  public List<SenderMessageDto> getAllSenderMessageEntities() {
    List<SenderMessageEntity> entities = messageRepository.listAll();
    List<SenderMessageDto> messageDtos = new ArrayList<SenderMessageDto>();
    for (SenderMessageEntity entity : entities ) {
      SenderMessageDto messageDto = new SenderMessageDto(entity);
      messageDtos.add(messageDto);
    }
    return messageDtos;
  }

  @Override
  public SenderMessageDto updateSenderMessage(long id, SenderMessageDto senderMessage) throws SenderMessageNotFoundException {
    SenderMessageEntity message = messageRepository.findById(id);
    SenderMessageDto messageDto = null;

    if(null != message){
      message.setSenderMessageEntity(senderMessage);
      messageRepository.persist(message);
      messageDto = new SenderMessageDto(message);
    } else {
      throw new SenderMessageNotFoundException();
    }
    return messageDto;
  }

  @Override
  public SenderMessageDto saveSenderMessage(SenderMessageDto message)  throws SenderMessageNotFoundException {
    if(null == message){
      throw new SenderMessageNotFoundException();
    } else {
      SenderMessageEntity entity =new SenderMessageEntity();
      entity.setSenderMessageEntity(message);
      messageRepository.persistAndFlush(entity);
      SenderMessageDto messageDto = new SenderMessageDto(entity);
      return messageDto;
    }
  }

  @Override
  public void deleteSenderMessage(long id) throws SenderMessageNotFoundException {
    SenderMessageEntity message = messageRepository.findById(id);
    if(null == message){
      throw new SenderMessageNotFoundException();
    }
    messageRepository.delete(message);
  }


}
