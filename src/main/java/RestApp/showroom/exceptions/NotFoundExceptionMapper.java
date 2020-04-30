package RestApp.showroom.exceptions;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import RestApp.showroom.model.ErrorPayload;
@Provider
public class NotFoundExceptionMapper implements ExceptionMapper<NotFoundException> {

	@Override
	public Response toResponse(NotFoundException exception) {
		ErrorPayload error = new ErrorPayload(404, "Element not found!");
		return Response.status(javax.ws.rs.core.Response.Status.NOT_FOUND).entity(error).build();

	}
}
