package io.prometheus.api;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = ValueDeserializer.class)
public record Value (
    Date timestamp,
    Double value
) {}
