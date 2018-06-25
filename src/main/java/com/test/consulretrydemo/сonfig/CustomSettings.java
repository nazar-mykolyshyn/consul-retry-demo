package com.test.consulretrydemo.сonfig;

import org.springframework.cloud.client.serviceregistry.AutoServiceRegistrationProperties;
import org.springframework.cloud.consul.discovery.ConsulDiscoveryProperties;
import org.springframework.cloud.consul.serviceregistry.ConsulAutoRegistration;
import org.springframework.cloud.consul.serviceregistry.ConsulAutoServiceRegistration;
import org.springframework.cloud.consul.serviceregistry.ConsulServiceRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomSettings {

  @Bean
  public ConsulAutoServiceRegistration consulAutoServiceRegistration(
      ConsulServiceRegistry registry,
      AutoServiceRegistrationProperties autoServiceRegistrationProperties,
      ConsulDiscoveryProperties properties,
      ConsulAutoRegistration consulRegistration) {
    return new ConsulAutoServiceRegistrationCustom(registry,
        autoServiceRegistrationProperties, properties, consulRegistration);
  }

}
