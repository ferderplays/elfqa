package ney.kuoku.mixins.player;

import net.minecraft.player.*;

public class playermixin extends elfqa {
    if (this.startedGame(Minecraft)) {
        do {
            this.loadPlayer();
        }
    }
}