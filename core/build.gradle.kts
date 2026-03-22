dependencies {
    compileOnly("ru.hukm:BigEmerald:1.0-SNAPSHOT")
    compileOnly(libs.paper.v11605)

    api(platform(libs.koin.bom))
    api(libs.koin.core)
    api(libs.reflectionremapper)
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}
