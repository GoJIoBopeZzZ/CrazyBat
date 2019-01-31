package com.red.crazybat.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.red.crazybat.CBGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Zombie Bird";
		config.width = 480;
		config.height = 320;
		new LwjglApplication(new CBGame(), config);
	}
}
