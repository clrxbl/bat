dependencies {
    compileOnly(libs.velocity.api)
    annotationProcessor(libs.velocity.api)

    compileOnly(libs.cloud.velocity)

    implementation(libs.adventure.minimessage)
    implementation(libs.configurate.hocon)
}

tasks {
    build {
        dependsOn(named("shadowJar"))
    }

    shadowJar {
        archiveClassifier.set(null as String?)
        archiveFileName.set(project.name + ".jar")
        destinationDirectory.set(rootProject.tasks.shadowJar.get().destinationDirectory.get())
    }
}
