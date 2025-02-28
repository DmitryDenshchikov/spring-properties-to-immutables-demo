package denshchikov.dmitry.app;

import java.util.List;
import org.immutables.value.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Value.Immutable
@ConfigurationProperties
public interface ConfigPropertiesExample6 {
  String[] listPropertyAsArray();

  @Value.Derived
  default List<String> listProperty() {
    return List.of(listPropertyAsArray());
  }
}
