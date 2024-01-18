package za.co.nico.controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import za.co.nico.dtos.SenderMessageDto;
import za.co.nico.exceptions.SenderMessageNotFoundException;
import za.co.nico.services.SenderMessageService;

import java.util.List;

@Path("/messages")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SenderMessageController {
  private final SenderMessageService service;


  @Inject
  public SenderMessageController(SenderMessageService service) {
    this.service = service;
  }

  @GET
  @Path("/{id}")
  public SenderMessageDto getUser(@PathParam("id") int id) throws SenderMessageNotFoundException {
    return service.getSenderMessageById(id);
  }


  @GET
  public List<SenderMessageDto> getAllSenderMessageEntities() {
    return service.getAllSenderMessageEntities();
  }



  @PUT
  public SenderMessageDto updateSenderMessage(@PathParam("id") long id, SenderMessageDto senderMessage) throws SenderMessageNotFoundException {
    return service.updateSenderMessage(id, senderMessage);
  }


  @POST
  public SenderMessageDto createSenderMessage(SenderMessageDto message)  throws SenderMessageNotFoundException {
    return service.saveSenderMessage(message);
  }


  @DELETE
  @Path("/{id}")
  public void deleteSenderMessage(@PathParam("id") long id) throws SenderMessageNotFoundException {
    service.deleteSenderMessage(id);
  }
}
