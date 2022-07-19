package be.webtechie.jlottie.core.model;

import be.webtechie.jlottie.core.helper.KeyFrameDeserializer;
import be.webtechie.jlottie.core.helper.KeyFrameSerializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;

/**
 * https://lottiefiles.github.io/lottie-docs/concepts/#animated-property
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public record Animated(
        @JsonProperty("a") Integer animated,
        @JsonProperty("k")
        @JsonSerialize(using = KeyFrameSerializer.class)
        @JsonDeserialize(using = KeyFrameDeserializer.class)
        List<Double> keyframes
) {
}