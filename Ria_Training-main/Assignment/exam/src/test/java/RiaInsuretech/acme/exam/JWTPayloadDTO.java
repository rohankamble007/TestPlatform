package RiaInsuretech.acme.exam;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
class JWTPayloadDTO implements Serializable {
    @JsonProperty("sub")
    private String sub;
    @JsonProperty("exp")
    private Long exp;
    @JsonProperty("iat")
    private Long iat;
    private String jwt;
}
