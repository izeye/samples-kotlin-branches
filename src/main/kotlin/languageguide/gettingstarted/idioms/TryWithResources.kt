package languageguide.gettingstarted.idioms

import java.nio.file.Files
import java.nio.file.Paths

fun main() {
    val stream = Files.newInputStream(Paths.get("./src/languageguide/gettingstarted/idioms/TryWithResources.kt"))
    stream.buffered().reader().use { reader -> println(reader.readText()) }
}
