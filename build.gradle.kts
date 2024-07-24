plugins {
    java
    id("dev.deftu.gradle.multiversion")
    id("dev.deftu.gradle.tools")
    id("dev.deftu.gradle.tools.resources")
    id("dev.deftu.gradle.tools.bloom")
    id("dev.deftu.gradle.tools.shadow")
    id("dev.deftu.gradle.tools.minecraft.loom")
    id("dev.deftu.gradle.tools.minecraft.releases")
}

toolkitMultiversion {
    moveBuildsToRootProject.set(true)
}

toolkitLoomHelper {
    if (!mcData.isNeoForge) {
        useMixinRefMap(modData.id)
    }
}

repositories {
    maven("https://maven.su5ed.dev/releases") // Forgified Fabric API
    maven("https://maven.terraformersmc.com/") // ModMenu
    maven("https://nexus.resourcefulbees.com/repository/maven-public/") // Resourceful Config
}

dependencies {

    // Resourceful Config
    modImplementation("com.teamresourceful.resourcefulconfig:resourcefulconfig-${mcData.loader}-${mcData.version}:${rootProject.extra["resourcefulconfig_version"]}")

    if (mcData.isFabric) {
        // Base dependencies
        modImplementation("net.fabricmc:fabric-loader:${mcData.dependencies.fabric.fabricLoaderVersion}")
        modImplementation("net.fabricmc.fabric-api:fabric-api:${mcData.dependencies.fabric.fabricApiVersion}")

        // Extra
        // ModMenu
        modImplementation("com.terraformersmc:modmenu:${rootProject.extra["modmenu_version"]}")
    } else if (mcData.isNeoForge) {
        // Base dependencies
        "neoForge"("net.neoforged:neoforge:${rootProject.extra["neoforge_version"]}")
        modImplementation("org.sinytra.forgified-fabric-api:forgified-fabric-api:${rootProject.extra["forgified_fabric_api_version"]}+${mcData.version}")
    }
}
