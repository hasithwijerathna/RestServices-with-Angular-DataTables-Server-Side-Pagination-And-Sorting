package com.hasith.rest;

import com.hasith.controllers.PaginationController;
import com.hasith.model.PageRequest;
import com.hasith.model.Pagination;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/json")
public class JSONService {

    @POST
    @Path("/dataPage")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Pagination getPageForDataTable(PageRequest request) {
        PaginationController controller = new PaginationController();
        return controller.getPage(request);
    }
}