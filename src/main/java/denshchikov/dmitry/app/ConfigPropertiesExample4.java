package denshchikov.dmitry.app;

import java.util.List;
import org.immutables.value.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Value.Immutable
@Value.Style(of = "new", allParameters = true, builtinContainerAttributes = false, jdkOnly = true)
@ConfigurationProperties
public interface ConfigPropertiesExample4 {
  List<String> listProperty();
}
