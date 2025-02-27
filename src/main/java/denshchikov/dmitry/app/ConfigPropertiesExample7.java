package denshchikov.dmitry.app;

import java.util.*;

import org.immutables.value.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Value.Modifiable
@Value.Style(strictBuilder = true)
@ConfigurationProperties
public interface ConfigPropertiesExample7 {
  Integer integerProperty();

  String stringProperty();

  @Value.Default
  default List<String> listProperty() {
    return new ArrayList<>();
  }

  @Value.Default
  default Set<String> setProperty() {
    return new HashSet<>();
  }

  Map<String, String> mapProperty();

  Map<String, List<String>> multiMapProperty();
}
