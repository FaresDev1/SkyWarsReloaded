package net.gcnt.skywarsreloaded.game;

import net.gcnt.skywarsreloaded.SkyWarsReloaded;
import net.gcnt.skywarsreloaded.game.types.GameStatus;
import net.gcnt.skywarsreloaded.wrapper.scheduler.CoreSWRunnable;
import net.gcnt.skywarsreloaded.wrapper.scheduler.SWRunnable;

import java.util.function.Consumer;

public abstract class CoreGameScheduler implements GameScheduler {

    protected final SkyWarsReloaded plugin;
    protected final GameWorld gameWorld;

    private SWRunnable runnable;
    private int ticksRun;
    private int ticksSinceGameStart;

    public CoreGameScheduler(SkyWarsReloaded plugin, GameWorld world) {
        this.plugin = plugin;
        this.gameWorld = world;
    }

    @Override
    public void start() {
        runnable = new CoreSWRunnable() {
            @Override
            public void run() {
                ticksRun++;
                if (gameWorld.getStatus() == GameStatus.PLAYING) ticksSinceGameStart++;
            }
        };
        plugin.getScheduler().runSyncTimer(runnable, 0, 1);
    }

    @Override
    public void end() {
        runnable.cancel();
        runnable = null;
    }

    @Override
    public void addDelayedTask(SWRunnable runnable, double delay) {

    }

    @Override
    public void addTimer(Consumer<SWRunnable> consumer, int timer) {

    }

    @Override
    public int getTicksSinceGameStart() {
        return this.ticksSinceGameStart;
    }

    @Override
    public int getSecondsSinceGameStart() {
        return this.ticksSinceGameStart / 20;
    }


}