package baeldung.logging.util

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

fun getLogger(forClass: Class<*>): Logger = LoggerFactory.getLogger(forClass)

fun <T : Any> T.logger(): Logger = getLogger(javaClass)

interface Logging

fun <T : Logging> T.markerLogger(): Logger = getLogger(javaClass)

inline fun <reified T : Logging> T.reifiedLogger(): Logger = getLogger(T::class.java)

// 'inline' has been removed due to a compile warning.
fun <T : Any> getClassForLogging(javaClass: Class<T>): Class<*> = javaClass.enclosingClass?.takeIf { !it.kotlin.isCompanion } ?: javaClass

inline fun <reified T : Logging> T.companionCompatibleLogger(): Logger = getLogger(getClassForLogging(T::class.java))

class LoggerDelegate<in R : Any> : ReadOnlyProperty<R, Logger> {
    override fun getValue(thisRef: R, property: KProperty<*>) = getLogger(getClassForLogging(thisRef.javaClass))
}
