package poo_anahin.constructores

import java.time.LocalDateTime

// CONSTRUCTOR SECUNDARIO:
// ES OBLIGATORIO TENER EL PRIMARIO YA CREADO
// THIS LLAMA AL PRIMARIO

class Post(
    val title: String,
    val author: String,
    val date: LocalDateTime
) {

    private var content: String = ""
    private var category: String = ""

    constructor(name: String, author: String, date: LocalDateTime, content: String, category: String) : this(
        name,
        author,
        date
    ) {
        this.content = content
        this.category = category
    }

    fun publish(): String {
        return """
            tittle = $title
            author = $author
            date = $date
            ${getCategory()}
            ${getcontent()}
        """.trimIndent()
    }

    fun getcontent(): String {
        return if (content.isNotEmpty() && content.isNotBlank()) {
            """
              Content: $content
           """.trimIndent()
        } else ""
    }

    fun getCategory(): String {
        return if (category.isNotEmpty() && category.isNotBlank())
            """
            category: $category
        """.trimIndent()
        else ""
    }


}