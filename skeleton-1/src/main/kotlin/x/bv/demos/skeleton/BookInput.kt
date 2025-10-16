package x.bv.demos.skeleton

import org.babyfish.jimmer.Input
import java.math.BigDecimal

class BookInput : Input<Book> {

    var id: Int? = null
    var name: String? = null
    var edition: Int? = null
    var price: BigDecimal? = null

    override fun toEntity(): Book? {
        return BookDraft.`$`.produce {
            this@BookInput.id?.let { this.id = it }
            this@BookInput.name?.let { this.name = it }
            this@BookInput.edition?.let { this.edition = it }
            this@BookInput.price?.let { this.price = it }
        }
    }
}