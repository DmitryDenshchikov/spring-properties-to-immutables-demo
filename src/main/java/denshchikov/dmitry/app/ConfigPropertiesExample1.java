package denshchikov.dmitry.app;

import org.immutables.value.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Value.Style(jdkOnly = true)
@Value.Immutable
@ConfigurationProperties
public interface ConfigPropertiesExample1 {
  List<String> listProperty();
}
