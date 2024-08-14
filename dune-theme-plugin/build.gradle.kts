plugins {
    base
    alias(libs.plugins.fleet.plugin)
}

group = "io.github.anvell"
version = "1.3.0"

fleetPlugin {
    id = "io.github.anvell.dune.theme"

    metadata {
        readableName = "Dune Theme"
        description = "Harmonic and flow inducing color scheme which is gentle for your eyes."

        icons {
            default = layout.projectDirectory.file("../assets/logo.svg")
        }
    }

    fleetRuntime {
        version = libs.versions.fleet.runtime
    }
}
