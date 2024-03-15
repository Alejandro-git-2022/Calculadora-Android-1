buildscript {
    dependencies {
        classpath("com.google.gms:google-services:4.4.1")
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.2" apply false
}


android {
    // Otras configuraciones para tu proyecto Android
    
    // Configuración para ignorar el archivo google-services.json
    applicationVariants.all { variant ->
        variant.resolvedConfigurations.forEach { config ->
            config.dependencies.forEach { dep ->
                if (dep.name == 'google-services') {
                    dep.exclude group: 'com.google.gms.google-services', module: 'google-services'
                }
            }
        }
    }
}
