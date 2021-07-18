package dev.mbo.invoicing.filter;

import lombok.extern.jbosslog.JBossLog;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@JBossLog
@Provider
public class CorsFilter implements ContainerResponseFilter {

  @Override
  public void filter(
    final ContainerRequestContext requestContext,
    final ContainerResponseContext responseContext
  ) {
    responseContext.getHeaders()
      .add("Access-Control-Allow-Origin", "*");
    responseContext.getHeaders()
      .add("Access-Control-Allow-Credentials", "true");
    responseContext.getHeaders()
      .add("Access-Control-Allow-Headers", "origin, content-type, accept, authorization");
    responseContext.getHeaders()
      .add("Access-Control-Allow-Methods", "GET, POST, PUT, PATCH, DELETE, OPTIONS, HEAD");
  }
}
