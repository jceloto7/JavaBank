plugins {
    id("java")
}

group = "com.jceloto7"
version = "1.0.0-SNAPSHOT"

tasks.jar{
    manifest{
        attributes["Main-Class"] = "com.jceloto7.java_bank.JavaBankApplication"
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(group = "org.apache.commons",name = "commons-lang3",version = "3.12.0")
    implementation("org.jetbrains:annotations:24.0.0")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}