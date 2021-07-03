package dev.mbo.invoicing.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * This class enables jax-rs. This replaces an entry in web.xml.
 */
@ApplicationPath("/api")
public class JaxRsActivator extends Application {
  /* class body intentionally left blank */
}
