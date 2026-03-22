pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenLocal()
        mavenCentral()
        maven("https://jitpack.io/")
        maven("https://repo.plasmoverse.com/snapshots")
        maven("https://repo.plasmoverse.com/releases")
        maven("https://repo.papermc.io/repository/maven-public/")
        maven("https://maven.kikugie.dev/snapshots")
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
    id("dev.kikugie.stonecutter") version "0.7.11"
}

rootProject.name = "pv-addon-discs"


include("core")
//include("v1_19_4")
//include("v1_20_6")
include("plugin")

include("nms")

stonecutter {
    kotlinController = true
    centralScript = "build.gradle.kts"

    create("nms") {
        versions("1.19.4", "1.20.6", "1.21.3", "1.21.5")
        vcsVersion = "1.19.4"
    }
}
