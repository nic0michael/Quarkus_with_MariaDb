package za.co.nico.services;

import za.co.nico.dtos.SenderMessageDto;
import za.co.nico.entities.SenderMessageEntity;
import za.co.nico.exceptions.SenderMessageNotFoundException;
import za.co.nico.repositories.SenderMessageRepository;

import java.util.List;

public interface SenderMessageService {

  SenderMessageDto getSenderMessageById(long id) throws SenderMessageNotFoundException;

  List<SenderMessageDto> getAllSenderMessageEntities();

  SenderMessageDto updateSenderMessage(long id, SenderMessageDto user) throws SenderMessageNotFoundException;

  SenderMessageDto saveSenderMessage(SenderMessageDto message)  throws SenderMessageNotFoundException;

  void deleteSenderMessage(long id) throws SenderMessageNotFoundException;
}
