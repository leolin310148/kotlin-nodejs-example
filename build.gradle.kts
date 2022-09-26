plugins {
    kotlin("multiplatform") version "1.7.10"
    kotlin("plugin.serialization") version "1.7.10"
    id("io.kotest.multiplatform") version "5.4.2"
}

group = "puni"
version = "1.0"

repositories {
    jcenter()
    mavenCentral()
}

kotlin {
    js(IR) {
        binaries.executable()
        nodejs {
        }
    }
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.0")
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-js:1.6.4")
            }
        }
        val jsTest by getting {
            dependencies {
                implementation("io.kotest:kotest-framework-engine-js:5.4.2")
            }
        }
    }
}
