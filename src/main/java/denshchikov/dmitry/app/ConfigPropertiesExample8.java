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

  String[] listProperty();

  String[] setProperty();

  @Value.Derived
  default List<String> immutableListProperty() {
    return List.of(listProperty());
  }

  @Value.Derived
  default Set<String> immutableSetProperty() {
    return Set.of(setProperty());
  }

  Map<String, String> mapProperty();

  Map<String, List<String>> multiMapProperty();
}
