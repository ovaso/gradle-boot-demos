package x.bv.demos.skeleton.wares.message

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.context.MessageSource
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class MessageSourceConfig {

	private val log: Logger by lazy { LoggerFactory.getLogger(MessageSourceConfig::class.java) }

	@Bean
	fun messageSource(): MessageSource {
		log.info("配置 MessageSource")
		return CompositeMessageSource()
	}
}
