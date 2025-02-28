package denshchikov.dmitry.app;

import java.util.*;
import org.immutables.value.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Value.Style(jdkOnly = true)
@Value.Immutable
@ConfigurationProperties
public interface ConfigPropertiesExample8 {
  Integer integerProperty();

  String stringProperty();

  String[] listPropertyAsArray();

  String[] setPropertyAsArray();

  @Value.Derived
  default List<String> listProperty() {
    return List.of(listPropertyAsArray());
  }

  @Value.Derived
  default Set<String> setProperty() {
    return Set.of(setPropertyAsArray());
  }

  Map<String, String> mapProperty();

  Map<String, List<String>> multiMapProperty();
}
