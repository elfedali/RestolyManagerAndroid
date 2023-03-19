package ma.weboven.restoly_manager.model

data class Page(
    val id: Int,
    val title: String,
    val body: String,
    val thumbnail: String,
    val published: Boolean,
    val position: Int,
    val created_at: String,
    val updated_at: String,
)

data class User(
    val id: Int,
    val name: String,
    val email: String,
    val email_verified_at: String,
    val created_at: String,
    val updated_at: String,
)