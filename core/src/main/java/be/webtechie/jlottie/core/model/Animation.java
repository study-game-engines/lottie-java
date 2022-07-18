package be.webtechie.jlottie.core.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Top level object, describing the animation.
 * https://lottiefiles.github.io/lottie-docs/animation/
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public record Animation(
        @JsonProperty("v") String version,
        @JsonProperty("nm") String name,
        @JsonProperty("mn") String matchName,
        @JsonProperty("ddd") Integer has3dLayers,
        @JsonProperty("fr") Integer framesPerSecond,
        @JsonProperty("ip") Integer inPoint,
        @JsonProperty("op") Integer outPoint,
        @JsonProperty("w") Integer width,
        @JsonProperty("h") Integer height,
        @JsonProperty("layers") List<Layer> layers
) {
}