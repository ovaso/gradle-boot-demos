package x.bv.demos.skeleton.test.container;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ResourceLoader;
import org.testcontainers.containers.MySQLContainer;

import java.io.IOException;

@Slf4j
@TestConfiguration(proxyBeanMethods = false)
public class MySQLTestContainerTestConfig {
	@Bean
	@ServiceConnection
	MySQLContainer<?> mysql(ResourceLoader loader) throws IOException {

		log.info("开始配置mysql容器");
		return new MySQLContainer<>("mysql:8.0.43");
	}
}
