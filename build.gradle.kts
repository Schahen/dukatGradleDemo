plugins {
    id("org.jetbrains.kotlin.js") version "1.3.50"
}


repositories {
    mavenCentral()
    maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
}


kotlin {
    target {
        useCommonJs()
        nodejs()
    }

    sourceSets["main"].dependencies {
        implementation(kotlin("stdlib-js"))
        implementation(npm("chalk", "2.4.2"))
    }
}




