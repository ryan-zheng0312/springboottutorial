/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("org.springframework.boot") version "2.4.1"
    id("io.spring.dependency-management") version "1.0.10.RELEASE"
}


allprojects {
    group = "com.qiusuo"
    version = "0.0.1-SNAPSHOT"
}


ext {
    set('springCloudVersion', "Hoxton.SR8")
}

subprojects {
    plugins {
        java
        `maven-publish`
        `org.springframework.boot`
        `io.spring.dependency-management`
    }

    //this will import the cloud dependencies bom. This mimics the maven dependency management
    dependencyManagement {
        imports {
            mavenBom("org.springframework.cloud:spring-cloud-dependencies:${springCloudVersion}")
        }
    }

    repositories {
        mavenLocal()
        jcenter()
    }
}
