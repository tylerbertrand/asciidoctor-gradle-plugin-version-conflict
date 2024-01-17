plugins {
    id("org.asciidoctor.jvm.convert") version "4.0.1"
    id("org.asciidoctor.jvm.base") version "4.0.1"
}

configurations.all {
    resolutionStrategy.failOnVersionConflict()
}
