package za.co.nico.controllers;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import za.co.nico.dtos.EmailSegmentDto;
import za.co.nico.exceptions.EmailSegmentNotFoundException;
import za.co.nico.services.EmailSegmentServiceImpl;

import java.util.List;

@Path("/emailsegments")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmailSegmentController {
  @Inject
  private final EmailSegmentServiceImpl service;

  public EmailSegmentController(EmailSegmentServiceImpl service) {
    this.service = service;
  }


  @GET
  @Path("/{id}")
  public EmailSegmentDto getEmailSegmentById(@PathParam("id") long id) throws EmailSegmentNotFoundException {
    return service.getEmailSegmentById(id);

  }

  @GET
  public List<EmailSegmentDto> getAllEmailSegmentEntities() {
    return service.getAllEmailSegmentEntities();
  }

  @PUT
  public EmailSegmentDto updateEmailSegment(@PathParam("id") long id, EmailSegmentDto segment) throws EmailSegmentNotFoundException {
    return service.updateEmailSegment(id,segment);
  }

  @POST
  public EmailSegmentDto saveEmailSegment(EmailSegmentDto segment) throws EmailSegmentNotFoundException {
    return service.saveEmailSegment(segment);
  }

  @DELETE
  @Path("/{id}")
  public void deleteEmailSegment(long id) throws EmailSegmentNotFoundException {
    service.deleteEmailSegment(id);
  }

}
