package io.github.jung27.test.plugin

import io.github.monun.kommand.kommand
import net.kyori.adventure.text.Component.text
import net.minecraft.server.level.ServerPlayer
import net.minecraft.world.entity.Entity
import org.bukkit.plugin.java.JavaPlugin

class TestPlugin : JavaPlugin() {
    override fun onEnable() {
        logger.info("Hello world!")

        println(ServerPlayer::class.java)
        for (declaredField in Entity::class.java.declaredFields) {
            println(declaredField.name)
        }

        kommand {
            register("test") {
                executes { sender.sendMessage(text("hello")) }
            }
        }
    }
}