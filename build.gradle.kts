import buildlogic.Utils

plugins {
    id("build.library")
    id("build.fabric")
}

Utils.setupResources(project, rootProject, "fabric.mod.json")

dependencies {
    minecraft("com.mojang:minecraft:1.21.4")
    mappings(loom.officialMojangMappings())
    modImplementation("net.fabricmc:fabric-loader:0.16.9")
}
