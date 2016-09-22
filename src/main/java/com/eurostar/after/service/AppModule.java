package com.eurostar.after.service;

import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule {
  @Override
  protected void configure() {
    bind(Server.class);
  }
}