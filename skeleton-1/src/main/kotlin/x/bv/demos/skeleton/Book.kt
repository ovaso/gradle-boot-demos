package x.bv.demos.skeleton

import org.babyfish.jimmer.sql.*
import java.math.BigDecimal

@Entity
@Table(name = "book")
interface Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int

    @Key
    val name: String

    @Key
    val edition: Int
    val price: BigDecimal
}