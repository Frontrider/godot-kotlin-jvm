include("godot-library")

pluginManagement {
    repositories {
        // jcenter()
        mavenCentral() // use this instead
        google()
        gradlePluginPortal()
    }
    resolutionStrategy.eachPlugin {
        if (requested.id.id == "com.utopia-rise.api-generator") {
            useModule("com.utopia-rise:api-generator:0.0.1")
        }
    }
}

includeBuild("api-generator") {
    dependencySubstitution {
        substitute(module("com.utopia-rise:api-generator")).with(project(":")) // assuming godot-entry-generator is the root project of entry-generator/godot-entry-generator
    }
}

subdir("entry-generation") {
    include("godot-kotlin-symbol-processor")
    include("godot-entry-generator")
}

subdir("plugins") {
    include("godot-gradle-plugin")
    include("godot-intellij-plugin")
}

subdir("utils") {
    include("godot-build-props")
}

class IncludeDsl(val root: String) {
    fun include(project: String) {
        settings.include(project)
        settings.project(":$project").also {
            it.projectDir = file("$root/$project")
        }
    }
}

fun subdir(root: String, block: IncludeDsl.() -> Unit) {
    block(IncludeDsl(root))
}
