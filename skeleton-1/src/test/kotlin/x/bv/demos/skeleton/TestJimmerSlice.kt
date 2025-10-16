package x.bv.demos.skeleton

import org.assertj.core.api.Assertions.assertThat
import org.babyfish.jimmer.spring.cfg.JimmerAutoConfiguration
import org.instancio.Instancio
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.ImportAutoConfiguration
import org.springframework.context.annotation.Import
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.jdbc.Sql
import x.bv.demos.skeleton.test.container.MySQLTestContainerTestConfig
import x.bv.demos.skeleton.test.slice.jimmer.JimmerTest

@JimmerTest
@Sql("classpath:init-book.sql") // 初始化数据库 SQL
@ActiveProfiles("test") // 使用测试配置
@ContextConfiguration(classes = [MySQLTestContainerTestConfig::class]) // 导入 TestContainer
@ImportAutoConfiguration(JimmerAutoConfiguration::class) // 导入 ORM 自动配置类, 或手动编写的配置类, 用来构建其操作器
//@Import(BookRepository::class) // 导入要测试的 Repository
class TestJimmerSlice {

//    @Autowired
//    private val repository: BookRepository? = null

    @Test
    fun testSaveAndQuery() {
//        assertThat(repository).isNotNull()
//        val bookInput = Instancio.create<BookInput?>(BookInput::class.java)
//        repository!!.saveBook(bookInput)
//        val bookById = repository.findBookById(bookInput.getId()!!, BookFetcher.`$`.allTableFields())
//        assertThat(bookById).isNotNull()
//        assertThat(bookById.name()).isEqualTo(bookInput.getName())
    }
}