/*
 * This file was generated by the Gradle 'init' task.
 */
plugins {
    java
    id("com.qiusuo.common")
}
dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-reactor-netty")
    implementation("org.springframework.boot:spring-boot-starter-data-redis")
    implementation("org.springframework:spring-messaging")
    implementation("org.springframework:spring-websocket")
    implementation("org.springframework.session:spring-session-data-redis")
    implementation("org.springframework.data:spring-data-cassandra")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.11.1")
    implementation("com.google.guava:guava:11.0.2")
}
