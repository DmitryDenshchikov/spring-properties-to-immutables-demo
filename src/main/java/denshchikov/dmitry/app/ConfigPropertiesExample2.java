package denshchikov.dmitry.app;

import java.util.List;
import org.immutables.value.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Value.Style(of = "new", allParameters = true, jdkOnly = true)
@Value.Immutable
@ConfigurationProperties
public interface ConfigPropertiesExample2 {
  List<String> listProperty();
}
