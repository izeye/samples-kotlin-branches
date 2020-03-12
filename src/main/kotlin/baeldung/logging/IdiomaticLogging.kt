package baeldung.logging

import baeldung.logging.util.*
import org.slf4j.LoggerFactory

fun main() {
    Property().greet()
    LoggerInCompanionObject().greet()
    LoggerAsExtensionOnAny().greet()
    LoggerAsExtensionOnMarkerInterface().greet()
    LoggerAsExtensionOnMarkerInterfaceWithCompanionProperty().greet()
    LoggerAsExtensionOnMarkerInterfaceWithProperty().greet()
    LoggerDelegateTests().greet()
    LoggerDelegateCompanionTests().greet()
    LoggerAsPropertyDelegate().greet()
    DelegateSubclass().greet()
}

class Property {
    private val log = LoggerFactory.getLogger(javaClass)

    fun greet() {
        log.info("Hello, world!")
    }

}

class LoggerInCompanionObject {
    companion object {
        private val log = getLogger(LoggerInCompanionObject::class.java)

        @Suppress("JAVA_CLASS_ON_COMPANION")
        private val companionLog = getLogger(javaClass)

        @Suppress("JAVA_CLASS_ON_COMPANION")
        private val enclosingLog = getLogger(javaClass.enclosingClass)

        @Suppress("JAVA_CLASS_ON_COMPANION")
        private val jvmStaticLog = getLogger(javaClass.enclosingClass)
    }

    fun greet() {
        log.info("Hello, world!")
        companionLog.info("Hello world!")
        enclosingLog.info("Hello world!")
        jvmStaticLog.info("Hello world!")
    }
}

class LoggerAsExtensionOnAny {
    fun greet() {
        logger().info("Hello, world!")
        "foo".logger().info("Hello, world!")
    }
}

class LoggerAsExtensionOnMarkerInterface : Logging {
    fun greet() {
        markerLogger().info("Hello, world!")
        reifiedLogger().info("Hello, world!")
    }
}

class LoggerAsExtensionOnMarkerInterfaceWithCompanionProperty {
    companion object : Logging {
        private val log = companionCompatibleLogger()
    }

    fun greet() {
        log.info("Hello, world!")
    }
}

class LoggerAsExtensionOnMarkerInterfaceWithProperty : Logging {
    private val log = companionCompatibleLogger()

    fun greet() {
        log.info("Hello, world!")
    }
}

class LoggerDelegateTests {
    private val log by LoggerDelegate()

    fun greet() {
        log.info("Hello, world!")
    }
}

class LoggerDelegateCompanionTests {
    companion object {
        private val log by LoggerDelegate()
    }

    fun greet() {
        log.info("Hello, world!")
    }
}

open class LoggerAsPropertyDelegate {
    private val log by LoggerDelegate()

    fun greet() {
        log.info("Hello, world!")
    }
}

class DelegateSubclass : LoggerAsPropertyDelegate() {
}
