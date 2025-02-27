package denshchikov.dmitry.app;

import java.util.List;

import org.immutables.value.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Value.Immutable
@Value.Style(of = "new", allParameters = true, strictBuilder = true, jdkOnly = true)
@ConfigurationProperties
public interface ConfigPropertiesExample3 {
  @Value.Default
  @SuppressWarnings("immutables:untype")
  default List<String> listProperty() {
    return List.of();
  }
}
