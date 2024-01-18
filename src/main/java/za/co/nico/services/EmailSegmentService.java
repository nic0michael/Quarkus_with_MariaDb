package za.co.nico.services;

import za.co.nico.dtos.EmailSegmentDto;
import za.co.nico.exceptions.EmailSegmentNotFoundException;

import java.util.List;

public interface EmailSegmentService {

  EmailSegmentDto getEmailSegmentById(long id) throws EmailSegmentNotFoundException;

  List<EmailSegmentDto> getAllEmailSegmentEntities();

  EmailSegmentDto updateEmailSegment(long id, EmailSegmentDto user) throws EmailSegmentNotFoundException;

  EmailSegmentDto saveEmailSegment(EmailSegmentDto message)  throws EmailSegmentNotFoundException;

  void deleteEmailSegment(long id) throws EmailSegmentNotFoundException;
}
