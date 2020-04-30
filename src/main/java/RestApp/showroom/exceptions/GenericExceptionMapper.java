package RestApp.showroom.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import RestApp.showroom.model.ErrorPayload;

@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

	@Override
	public Response toResponse(Throwable exception) {
		ErrorPayload error = new ErrorPayload(500, "internal server error");
		return Response.status(javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR).entity(error).build();

	}

}
