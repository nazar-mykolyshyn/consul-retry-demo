package com.test.consulretrydemo.сonfig;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.cloud.client.serviceregistry.AutoServiceRegistrationProperties;
import org.springframework.cloud.consul.discovery.ConsulDiscoveryProperties;
import org.springframework.cloud.consul.serviceregistry.ConsulAutoRegistration;
import org.springframework.cloud.consul.serviceregistry.ConsulAutoServiceRegistration;
import org.springframework.cloud.consul.serviceregistry.ConsulServiceRegistry;
import org.springframework.retry.annotation.Retryable;

public class ConsulAutoServiceRegistrationCustom extends ConsulAutoServiceRegistration {

  public ConsulAutoServiceRegistrationCustom(
      ConsulServiceRegistry serviceRegistry,
      AutoServiceRegistrationProperties autoServiceRegistrationProperties,
      ConsulDiscoveryProperties properties,
      ConsulAutoRegistration registration) {
    super(serviceRegistry, autoServiceRegistrationProperties, properties, registration);
  }

  @Override
  @Retryable(interceptor = "consulRetryInterceptor")
  public void bind(WebServerInitializedEvent event) {
    super.bind(event);
  }
}