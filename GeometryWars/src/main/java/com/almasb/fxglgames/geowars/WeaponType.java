package com.almasb.fxglgames.geowars;

import javafx.util.Duration;

/**
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
public enum WeaponType {
    NORMAL(Duration.seconds(0.1)),
    RICOCHET(Duration.seconds(0.17 * 3)),
    BEAM(Duration.seconds(0.17 * 7)),
    WAVE(Duration.seconds(0.17 * 10));

    public final Duration delay;

    WeaponType(Duration delay) {
        this.delay = delay;
    }
}
