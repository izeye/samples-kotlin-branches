import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.70"
    id("org.jetbrains.dokka") version "0.10.1"
    id("org.gradle.test-retry") version "1.0.0"
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}

repositories {
    jcenter()
}

dependencies {
    implementation(platform("org.junit:junit-bom:latest.release"))

    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))
    implementation("ch.qos.logback:logback-classic:latest.release")

    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.test {
    useJUnitPlatform()

    retry {
        maxFailures.set(10)
        maxRetries.set(5)
    }
}

tasks.wrapper {
    gradleVersion = "6.2.2"
}
