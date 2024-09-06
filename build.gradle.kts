plugins {
    application
    checkstyle
}

group = "ru.anseranser"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
    minHeapSize = "1024m"
    maxHeapSize = "4096m"
}