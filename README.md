This is a minimal example of using new experimental feature `kotlin.js.experimental.generateKotlinExternals`.

What worth knowing:
 * Kotlin declarations are converted from typescript declaration files if such files are found in npm dependencies. 
 * Internally Kotlin Gradle Plugin uses the [dukat tool](https://jetbrains.quip.com/kiigAGasNsoM/Plan-for-1350-Blog-Post.) for converting Typescript declaration files.
 * dukat/kotlin-gradle-plugin integration is an experimental feature and a lot of work is still ahead.
 * dukat release cycle is shorter compared to that of Kotlin (to which kotlin-gradle-plugin belongs), so if you want to use fresher version of dukat, you can add `rootProject.kotlinNodeJs.versions.dukat.version = "<VERSION>"` to your build.gradle.kts file.   
   