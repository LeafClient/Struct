plugins {
    java
    `maven-publish`
}

group = "com.leafclient"
version = "1.0.0"
description = "Leaf's utilities to structure and organize the entire project"

repositories {
    mavenCentral()
}

dependencies {

}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

val sourcesJar by tasks.registering(Jar::class) {
    archiveClassifier.set("sources")
    from(sourceSets.main.get().allSource)
}

artifacts {
    archives(sourcesJar)
}

publishing {
    publications {
        register("mavenJava", MavenPublication::class) {
            from(components["java"])
        }
    }
}