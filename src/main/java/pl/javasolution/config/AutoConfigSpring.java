package pl.javasolution.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("pl.javasolution.implementation")
//@Import(Config.class)
public class AutoConfigSpring {
}
