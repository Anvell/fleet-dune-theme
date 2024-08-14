plugins {
    base
    alias(libs.plugins.fleet.plugin)
}

group = "io.github.anvell"
version = "0.1.0"

fleetPlugin {
    id = "io.github.anvell.dune.theme"

    metadata {
        readableName = "Dune Theme"
        description = "Dune inspired theme for JetBrains Fleet"
        icons {
            default = layout.projectDirectory.file("../assets/logo.svg")
        }
    }

    fleetRuntime {
        version = libs.versions.fleet.runtime
    }
}
