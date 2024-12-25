plugins {
  id("java")
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.postgresql:postgresql:42.7.4")
  implementation("jakarta.persistence:jakarta.persistence-api:3.2.0")
  implementation("org.hibernate.orm:hibernate-core:7.0.0.Beta3")
  implementation("org.apache.logging.log4j:log4j-core:2.24.3")
  implementation("org.apache.logging.log4j:log4j-api:2.24.3")
}
