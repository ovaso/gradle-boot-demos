package x.bv.demos.skeleton.wares

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.AutoConfiguration
import org.springframework.context.annotation.Import
import x.bv.demos.skeleton.wares.web.WebWaresConfiguration

@AutoConfiguration
@Import(value = [WebWaresConfiguration::class])
class WaresAutoConfiguration {
	private val log: Logger by lazy { LoggerFactory.getLogger(this::class.java) }

	init {
		log.info("${WebWaresConfiguration::class.simpleName} init")
	}
}
