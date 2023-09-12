package com.inexture.service1.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import io.opentelemetry.exporter.otlp.http.trace.OtlpHttpSpanExporter;

@Configuration
public class AppConfig {

	@Bean
	RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	OtlpHttpSpanExporter otlpHttpSpanExporter(@Value("${tracing.url}") String url) {
		return OtlpHttpSpanExporter.builder().setEndpoint(url).build();
	}

}
