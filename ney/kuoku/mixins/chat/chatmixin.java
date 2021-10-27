package ney.kuoku.mixins.chat;

import net.minecraft.gui.chat.*;
import net.minecraft.chat.*;

public class chatmixin extends elfqa {
    if (this.loadedWorld()) {
        do {
            this.loadChat(all);
        }
    }
    if (this.joinedServer()) {
        do {
            this.loadChat(all);
        }
    }
}