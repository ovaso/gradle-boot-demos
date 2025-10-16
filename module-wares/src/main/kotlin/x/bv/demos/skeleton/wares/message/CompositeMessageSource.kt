package x.bv.demos.skeleton.wares.message

import org.springframework.context.MessageSource
import org.springframework.context.MessageSourceResolvable
import java.util.Locale

class CompositeMessageSource: MessageSource {
	override fun getMessage(
		code: String, args: Array<out Any?>?, defaultMessage: String?, locale: Locale?
	): String? {
		TODO("Not yet implemented")
	}

	override fun getMessage(
		code: String, args: Array<out Any?>?, locale: Locale?
	): String {
		TODO("Not yet implemented")
	}

	override fun getMessage(
		resolvable: MessageSourceResolvable, locale: Locale?
	): String {
		TODO("Not yet implemented")
	}

}
