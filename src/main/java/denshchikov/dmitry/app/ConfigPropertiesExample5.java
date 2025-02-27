package denshchikov.dmitry.app;

import java.util.List;
import org.immutables.value.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Value.Immutable
@ConfigurationProperties
public interface ConfigPropertiesExample5 {
  List<String> listProperty();
}
