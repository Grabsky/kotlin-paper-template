package just.testing

import org.bukkit.plugin.java.JavaPlugin

object MainProvider {
    lateinit var INS: Main
}

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