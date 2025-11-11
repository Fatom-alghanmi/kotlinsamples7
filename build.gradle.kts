plugins {
    kotlin("jvm") version "2.0.21"
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

// Java toolchain
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
        // vendor.set(JvmVendorSpec.ADOPTOPENJDK) // optional
    }
}

// Kotlin compiler options (new DSL)
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinJvmCompile>().configureEach {
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
    }
}

// Kotlin toolchain
kotlin {
    jvmToolchain(17)
}
