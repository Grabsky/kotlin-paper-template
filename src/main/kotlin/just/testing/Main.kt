package just.testing

import org.bukkit.plugin.java.JavaPlugin

object MainProvider {
    lateinit var INS: Main
}

// Don't forget to replace default values:
//   - main class name and main class provider name (here)
//   - property 'rootProject.name' (settings.gradle.kts)
//   - property 'group' (build.gradle.kts)
//   - properties 'name' and 'main' (plugin.yml)
class Main : JavaPlugin() {

    override fun onEnable() {
        super.onEnable()
        // Creating instance(s)
        MainProvider.INS = this
        // ...
        this.logger.info("Hello World!")
    }

    override fun onDisable() {
        super.onDisable()
        // ...
        this.logger.info("Bye World!")
    }

}